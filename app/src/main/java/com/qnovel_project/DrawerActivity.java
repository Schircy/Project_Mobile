package com.qnovel_project;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;

import androidx.annotation.NonNull;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DrawerActivity extends AppCompatActivity {

    // <include> Initial

    LinearLayout popularSeries, latestSeries, latestUpdates;
    ImageView imgNovel1, imgNovel6, imgNovel11;
    Button btn_popular, btn_latestSeries, btn_latestUpdates;

    // Local Class
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        // Local Statement
        drawerLayout = findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // <include> Statement MainActivity()
        //Button Find ID
        btn_popular = findViewById(R.id.btn_PopularSeries);
        btn_latestSeries = findViewById(R.id.btn_LatestSeries);
        btn_latestUpdates = findViewById(R.id.btn_LatestUpdates);

        // Button Click Listener
        btn_popular.setOnClickListener(new DrawerActivity.buttonCase());
        btn_latestSeries.setOnClickListener(new DrawerActivity.buttonCase());
        btn_latestUpdates.setOnClickListener(new DrawerActivity.buttonCase());

        // Change Layout Find ID
        popularSeries = findViewById(R.id.list_Popular);
        latestSeries = findViewById(R.id.list_LatestSeries);
        latestUpdates = findViewById(R.id.list_LatestUpdates);

        // ImageView find ID
        imgNovel1 = findViewById(R.id.imgNovel1);
        imgNovel6 = findViewById(R.id.imgNovel6);
        imgNovel11 = findViewById(R.id.imgNovel11);

        imgNovel1.setOnClickListener(view -> startActivity(new Intent(DrawerActivity.this, NovelActivity.class)));
        imgNovel6.setOnClickListener(view -> startActivity(new Intent(DrawerActivity.this, NovelActivity.class)));
        imgNovel11.setOnClickListener(view -> startActivity(new Intent(DrawerActivity.this, NovelActivity.class)));
    }

    // Case Menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        switch (item.getItemId()) {
            case R.id.MyAccount:
            case R.id.setting:
                Toast.makeText(this, "Currently Not Available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Menu_profile:
                Intent toProfile = new Intent(this, ProfileActivity.class);
                startActivity(toProfile);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Create Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.setting_menu, menu);
        return true;
    }

    // BUTTON <Include> Main Activity
    public class buttonCase implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            // Button Click
            if (view.getId() == R.id.btn_PopularSeries) {
                popularSeries.setVisibility(View.VISIBLE);
                latestSeries.setVisibility(View.GONE);
                latestUpdates.setVisibility(View.GONE);
            } else if (view.getId() == R.id.btn_LatestSeries) {
                popularSeries.setVisibility(View.GONE);
                latestSeries.setVisibility(View.VISIBLE);
                latestUpdates.setVisibility(View.GONE);
            } else if (view.getId() == R.id.btn_LatestUpdates) {
                popularSeries.setVisibility(View.GONE);
                latestSeries.setVisibility(View.GONE);
                latestUpdates.setVisibility(View.VISIBLE);
            }
        }
    }
}