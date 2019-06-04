package com.example.wedrowniczek;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Random;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Thread t = new Thread(() ->  load());
        t.start();
    }

    public void load()
    {
        for(int i = 0; i < (new Random()).nextInt(25) + 20; i++)
        {
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException ex)
            {

            }
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }


}
