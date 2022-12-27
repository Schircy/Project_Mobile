package com.qnovel_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class NovelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_novel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_home) {
            Intent Home = new Intent(this, DrawerActivity.class);
            this.startActivity(Home);
            return true;
        }
        if (item.getItemId()==R.id.menu_profile){
            Intent Profile = new Intent(this,ProfileActivity.class);
            this.startActivity(Profile);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}