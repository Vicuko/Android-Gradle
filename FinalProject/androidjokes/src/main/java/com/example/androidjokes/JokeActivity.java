package com.example.androidjokes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.androidjokes.R.layout.activity_joke);

        TextView title = findViewById(com.example.androidjokes.R.id.joke_title);
        title.setText(R.string.jokes_title);

        Intent intent = getIntent();
        String intentJoke = intent.getStringExtra("joke");

        TextView jokeText = (TextView) findViewById(com.example.androidjokes.R.id.joke_content);
        jokeText.setText(intentJoke);
    }
}