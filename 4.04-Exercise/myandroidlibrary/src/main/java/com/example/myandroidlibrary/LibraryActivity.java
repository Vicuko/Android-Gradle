package com.example.myandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Intent intent = getIntent();
        String intentJoke = intent.getStringExtra("joke");

        TextView jokeText = (TextView) this.findViewById(R.id.joketext);
        jokeText.setText(intentJoke);

    }
}
