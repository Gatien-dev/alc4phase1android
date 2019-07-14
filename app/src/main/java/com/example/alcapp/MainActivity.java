package com.example.alcapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_about,btn_my_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar appBar = findViewById(R.id.toolbar);
        setSupportActionBar(appBar);
        getSupportActionBar().setTitle("ALC Phase 1");
        btn_about=findViewById(R.id.btn_about_alc);
        btn_my_profile=findViewById(R.id.btn_my_profile);
        btn_my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MyProfileActivity.class));
            }
        });
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AboutAlcActivity.class));
            }
        });

//        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
