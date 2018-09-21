package com.kampuskoding.kampusmaterialdesign.components.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.kampuskoding.kampusmaterialdesign.R;
import com.kampuskoding.kampusmaterialdesign.adapter.BasicCardAdapter;
import com.kampuskoding.kampusmaterialdesign.model.carditem.BasicItem;

import java.util.ArrayList;
import java.util.List;

public class BasicCardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BasicCardAdapter adapter;
    private List<BasicItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_card);
        setTitle("Basic Card");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        generateList();
        loadData();
    }

    public void generateList(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        itemList = new ArrayList<>();
        adapter = new BasicCardAdapter(this, itemList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        BasicItem data;

        int[] covers = new int[]{
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.a,
                R.drawable.b
        };

        data = new BasicItem("Belajar Android Pemula","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", covers[0]);
        itemList.add(data);

        data = new BasicItem("Belajar React Native","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", covers[1]);
        itemList.add(data);

        data = new BasicItem("Belajar Java Script","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", covers[2]);
        itemList.add(data);

        data = new BasicItem("Belajar PHP Dasar","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", covers[3]);
        itemList.add(data);

        data = new BasicItem("Belajar Kotlin Pemula","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", covers[4]);
        itemList.add(data);

        data = new BasicItem("Belajar C++ Sederhana","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", covers[5]);
        itemList.add(data);

        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
