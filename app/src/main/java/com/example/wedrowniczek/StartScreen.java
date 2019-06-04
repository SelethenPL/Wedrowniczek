package com.example.wedrowniczek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }


    public void goToLoadActivity (View view){
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);
        this.finish();
    }






















































































































}
