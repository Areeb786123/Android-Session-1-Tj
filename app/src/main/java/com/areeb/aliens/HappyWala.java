package com.areeb.aliens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HappyWala extends AppCompatActivity {

    TextView Zara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_wala);
        Zara= findViewById(R.id.Areeb);

        Zara.setText(getIntent().getStringExtra("shivansh") + " " + "Happy Birthday 🙃" );
    }
}