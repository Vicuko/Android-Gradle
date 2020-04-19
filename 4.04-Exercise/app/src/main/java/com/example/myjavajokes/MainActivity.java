package com.example.myjavajokes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jokewizard.JokeWizard;
import com.example.myandroidlibrary.LibraryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello = (TextView) this.findViewById(R.id.hello);
        hello.setText("Hello World!");

        Button button = (Button) findViewById(R.id.library_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JokeWizard joke = new JokeWizard();
                String jokeText = joke.getJoke();

                Intent intent = new Intent(getBaseContext(), LibraryActivity.class);
                intent.putExtra("joke", jokeText);
                v.getContext().startActivity(intent);
            }
        });
    }
}
