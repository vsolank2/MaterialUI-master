package com.dedsec.materialui.activity.bottomnavigation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.dedsec.materialui.R;

public class BottomNavigationLight extends AppCompatActivity {
    Context mContext;

    // Attributes for Bottom Navigation View
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_light);
        mContext = BottomNavigationLight.this;

        // For Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("HOME");
        // For Back Button Icon
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_menu_white));

        // For Bottom Navigation View
        // Calling Method....
        bottomNavigationViewHandler();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_default_light, menu);
        return true;
    }

    // Method For Back Button ICON
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.default_action_search:
                Toast.makeText(mContext, "Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.default_action_setting:
                Toast.makeText(mContext, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // Method For  BottomNavigationView
    public void bottomNavigationViewHandler() {
        bottomNavigationView = findViewById(R.id.t1_l3_bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_recent:
                        getSupportActionBar().setTitle("Recent");
                        return true;
                    case R.id.navigation_favorites:
                        getSupportActionBar().setTitle("Favorite");
                        return true;
                    case R.id.navigation_nearby:
                        getSupportActionBar().setTitle("Nearby");
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
}
