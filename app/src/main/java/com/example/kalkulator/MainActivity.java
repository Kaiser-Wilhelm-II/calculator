package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jeden = findViewById(R.id.jeden);
        Button dwa = findViewById(R.id.dwa);
        Button trzy = findViewById(R.id.trzy);
        Button cztery = findViewById(R.id.cztery);
        Button piec = findViewById(R.id.piec);
        Button szesc = findViewById(R.id.szesc);
        Button siedem = findViewById(R.id.siedem);
        Button osiem = findViewById(R.id.osiem);
        Button dziewiec = findViewById(R.id.dziewiec);
        Button zero = findViewById(R.id.zero);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button razy = findViewById(R.id.razy);
        Button dzielic = findViewById(R.id.dzielic);

    }
}