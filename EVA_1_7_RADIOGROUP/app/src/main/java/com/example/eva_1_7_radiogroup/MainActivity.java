package com.example.eva_1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida = findViewById(R.id.rdGroupComida);

        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "Montados", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Burritos", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "Alitas", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(), "Garnachas", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(getApplicationContext(), "Tacos", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Codorniz", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}