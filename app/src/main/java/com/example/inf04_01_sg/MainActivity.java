package com.example.inf04_01_sg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int licznikPolubien = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button polub = findViewById(R.id.buttonPolub);
        Button usun = findViewById(R.id.buttonUsun);
        TextView licznik = findViewById(R.id.textViewPolubienia);

        polub.setOnClickListener(view -> {
            licznikPolubien++;
            String text = licznikPolubien + " polubień";
            licznik.setText(text);
        });

        usun.setOnClickListener(view -> {
            if (licznikPolubien != 0){
                licznikPolubien--;
                String text = licznikPolubien + " polubień";
                licznik.setText(text);
            }
        });

    }
}