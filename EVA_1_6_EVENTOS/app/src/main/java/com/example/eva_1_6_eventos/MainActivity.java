package com.example.eva_1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnListener, btnClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);

        btnListener.setOnClickListener(this);
        //btnClaseAnonima.setOnClickListener();

    }
    public void miClick(View arg) {

        Toast.makeText(this, "Evento por ONCLICK", Toast.LENGTH_LONG).show();
    }
    public void OnClick(View View) {
    @Override
        Toast.makeText(this, "Evento por LISTENER", Toast.LENGTH_LONG).show();
    }
}
