package com.example.eva_1_5_findview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgVwMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwMostrar= findViewById(R.id.imgVwMostrar);
        imgVwMostrar.setImageResource(R.drawable.pepe1);

    }
}