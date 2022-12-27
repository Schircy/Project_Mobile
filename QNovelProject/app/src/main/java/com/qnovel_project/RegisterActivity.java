package com.qnovel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Initial Variable
        TextView btn=findViewById(R.id.haveAnAccount);
        Button btn_sign=findViewById(R.id.btn_Sign);

        //Ke Login
        btn.setOnClickListener(view -> startActivity(new Intent(RegisterActivity.this,LoginActivity.class)));
        //Ke MainActivity
        btn_sign.setOnClickListener(view -> startActivity(new Intent(RegisterActivity.this,DrawerActivity.class)));
    }
}