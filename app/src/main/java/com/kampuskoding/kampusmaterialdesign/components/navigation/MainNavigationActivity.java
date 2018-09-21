package com.kampuskoding.kampusmaterialdesign.components.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.kampuskoding.kampusmaterialdesign.R;

public class MainNavigationActivity extends AppCompatActivity {

    Button btnSimpleDrawer, btnBasicDrawer, btnBasicBottombar,btnShiftingBottombar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Navigation");

        btnSimpleDrawer = findViewById(R.id.btn_nav_simple_drawer);
        btnBasicDrawer = findViewById(R.id.btn_nav_basic_drawer);
        btnBasicBottombar = findViewById(R.id.btn_basic_nav_bottombar);
        btnShiftingBottombar = findViewById(R.id.btn_shifting_nav_bottombar);

        btnSimpleDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, SimpleNavigationDrawerActivity.class);
                startActivity(intent);
            }
        });

        btnBasicDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, BasicNavigationDrawerActivity.class);
                startActivity(intent);
            }
        });

        btnBasicBottombar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, BasicBottombarActivity.class);
                startActivity(intent);
            }
        });

        btnShiftingBottombar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, ShiftingBottombarActivity.class);
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
