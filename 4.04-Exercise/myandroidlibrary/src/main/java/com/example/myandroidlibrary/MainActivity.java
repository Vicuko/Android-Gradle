package com.example.myandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.myandroidlibrary.R.layout.activity_jokes);

        Intent intent = getIntent();
        String intentJoke = intent.getStringExtra("joke");

        TextView jokeText = (TextView) findViewById(com.example.myandroidlibrary.R.id.joketext);
        jokeText.setText(intentJoke);
    }
}
