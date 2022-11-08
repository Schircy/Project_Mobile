package com.qnovel_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity{

    // Initial Button
    Button btn_popular, btn_latestSeries,btn_latestUpdates;
    ListView popularSeries, latestSeries, latestUpdates;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar

        // Button
        btn_popular = findViewById(R.id.btn_PopularSeries);
        btn_latestSeries = findViewById(R.id.btn_LatestSeries);
        btn_latestUpdates = findViewById(R.id.btn_LatestUpdates);

        // Button Click
        btn_popular.setOnClickListener(new buttonCase());
        btn_latestSeries.setOnClickListener(new buttonCase());
        btn_latestUpdates.setOnClickListener(new buttonCase());

        // ListView
        popularSeries = findViewById(R.id.list_Popular);
        latestSeries = findViewById(R.id.list_LatestSeries);
        latestUpdates = findViewById(R.id.list_LatestUpdates);

        // ListView Array String
        ArrayAdapter<String> arrPopular;
        arrPopular = new ArrayAdapter<>(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                Popular);
        popularSeries.setAdapter(arrPopular);

        ArrayAdapter<String> arrSeries;
        arrSeries = new ArrayAdapter<>(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                Series);
        latestSeries.setAdapter(arrSeries);

        ArrayAdapter<String> arrUpdates;
        arrUpdates = new ArrayAdapter<>(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                Updates);
        latestUpdates.setAdapter(arrUpdates);
    }

    String Popular[] = {"Novel1", "Novel2", "Novel3","Novel4","Novel5"};
    String Series[] = {"Novel6", "Novel7", "Novel8","Novel9","Novel10"};
    String Updates[]={"Novel11", "Novel12", "Novel13","Novel14","Novel15"};



    public class buttonCase implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.btn_PopularSeries){
                popularSeries.setVisibility(View.VISIBLE);
                latestSeries.setVisibility(View.GONE);
                latestUpdates.setVisibility(View.GONE);
            } else if (view.getId()==R.id.btn_LatestSeries){
                popularSeries.setVisibility(View.GONE);
                latestSeries.setVisibility(View.VISIBLE);
                latestUpdates.setVisibility(View.GONE);
            } else if (view.getId()==R.id.btn_LatestUpdates){
                popularSeries.setVisibility(View.GONE);
                latestSeries.setVisibility(View.GONE);
                latestUpdates.setVisibility(View.VISIBLE);
            }
        }
    }
}