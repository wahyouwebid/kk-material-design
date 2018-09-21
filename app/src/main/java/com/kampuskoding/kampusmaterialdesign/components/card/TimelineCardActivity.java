package com.kampuskoding.kampusmaterialdesign.components.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.kampuskoding.kampusmaterialdesign.R;
import com.kampuskoding.kampusmaterialdesign.adapter.SimpleCardAdapter;
import com.kampuskoding.kampusmaterialdesign.adapter.TimelineCardAdapter;
import com.kampuskoding.kampusmaterialdesign.model.carditem.SimpleItem;
import com.kampuskoding.kampusmaterialdesign.model.carditem.TimelineItem;

import java.util.ArrayList;
import java.util.List;

public class TimelineCardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TimelineCardAdapter adapter;
    private List<TimelineItem> simpleItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline_card);
        setTitle("Timeline Card");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        generateList();
        loadData();
    }

    public void generateList(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        simpleItems = new ArrayList<>();
        adapter = new TimelineCardAdapter(this, simpleItems);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        TimelineItem data;
        int[] profile = new int[]{
                R.drawable.profile,
                R.drawable.profile
        };

        int[] covers = new int[]{
                R.drawable.cover
        };
        for (int i = 0; i<10; i++){
            data = new TimelineItem("John Robert","10 Aug 2018", profile[0], covers[0], "Lorem Ipsum is simply dummy text of the printing and typesetting industry." );
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
