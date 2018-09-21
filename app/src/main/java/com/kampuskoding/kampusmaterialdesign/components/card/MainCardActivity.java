package com.kampuskoding.kampusmaterialdesign.components.card;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.kampuskoding.kampusmaterialdesign.R;

public class MainCardActivity extends AppCompatActivity {

    Button btnSimple,btnBasic,btnTimeline,btnOverlap,btnProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        setTitle("Card");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnSimple = findViewById(R.id.btn_simple_card);
        btnBasic = findViewById(R.id.btn_basic_card);
        btnTimeline = findViewById(R.id.btn_time_line_card);
        btnOverlap = findViewById(R.id.btn_overlap_card);
        btnProfile = findViewById(R.id.btn_profile_card);

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCardActivity.this, SimpleCardActivity.class);
                startActivity(intent);
            }
        });

        btnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCardActivity.this, BasicCardActivity.class);
                startActivity(intent);
            }
        });

        btnTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCardActivity.this, TimelineCardActivity.class);
                startActivity(intent);
            }
        });

        btnOverlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCardActivity.this, OverlapCardActivity.class);
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCardActivity.this, ProfileCardActivity.class);
                startActivity(intent);
            }
        });
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
