package com.qnovel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Initial Variable
        Button btn_sign = findViewById(R.id.btn_Sign);
        TextView btn = findViewById(R.id.sign_up);
        //Ke Register
        btn.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, RegisterActivity.class)));
        //Ke MainActivity
        btn_sign.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this,MainActivity.class)));
    }
}
