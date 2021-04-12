package com.example.hazi_projektmunka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Feldolgoz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feldolgoz);
        TextView finaltext=findViewById(R.id.finaltext);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            finaltext.setText((extras.getString("nev"))+" rendelésed hamarosan szállítjuk a" +(extras.getString("feltetszam")) +" db feltéttel a "+(extras.getString("cim"))+" címre! \n"+(extras.getString("telszam")));
        }
    }
}
