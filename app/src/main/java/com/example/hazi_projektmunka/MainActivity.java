package com.example.hazi_projektmunka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev=findViewById(R.id.nev);
        EditText tel=findViewById(R.id.telszam);
        EditText cim=findViewById(R.id.cim);

        Button rendel=findViewById(R.id.megrendel);

        CheckBox sajt=findViewById(R.id.sajt);
        CheckBox csipos=findViewById(R.id.csipos);
        CheckBox bacon=findViewById(R.id.bacon);
        CheckBox gomba=findViewById(R.id.gomba);

        rendel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, Feldolgoz.class);

                i.putExtra("nev", nev.getText().toString());
                i.putExtra("telszam",tel.getText().toString());
                i.putExtra("cim", cim.getText().toString());
                if (sajt.isChecked()){
                    i.putExtra("sajt", sajt.getText().toString());
                }
                if (csipos.isChecked()){
                    i.putExtra("csipos", csipos.getText().toString());
                }
                if (bacon.isChecked()){
                    i.putExtra("bacon", bacon.getText().toString());
                }
                if (gomba.isChecked()){
                    i.putExtra("gomba", gomba.getText().toString());
                }
                startActivity(i);

            }
        });
    }
}