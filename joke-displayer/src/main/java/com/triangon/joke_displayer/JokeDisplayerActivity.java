package com.triangon.joke_displayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        Intent intent = JokeDisplayerActivity.this.getIntent();
        String joke = intent.getStringExtra("joke");
        TextView jokeTextView = this.findViewById(R.id.tv_joke);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
