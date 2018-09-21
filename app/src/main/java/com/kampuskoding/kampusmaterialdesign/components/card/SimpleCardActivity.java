package com.kampuskoding.kampusmaterialdesign.components.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.kampuskoding.kampusmaterialdesign.R;
import com.kampuskoding.kampusmaterialdesign.adapter.SimpleCardAdapter;
import com.kampuskoding.kampusmaterialdesign.model.carditem.SimpleItem;

import java.util.ArrayList;
import java.util.List;

public class SimpleCardActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SimpleCardAdapter adapter;
    private List<SimpleItem> simpleItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_card);
        setTitle("Simple Card");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        generateList();
        loadData();
    }

    public void generateList(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        simpleItems = new ArrayList<>();
        adapter = new SimpleCardAdapter(this, simpleItems);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        SimpleItem data;

        for (int i = 0; i<20; i++){
            data = new SimpleItem("Simple Card " +i);
            simpleItems.add(data);
        }

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
