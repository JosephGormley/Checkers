package com.example.joegormley.checkers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGame(View view){
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);
    }

    public void openSettings(View view){
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}
