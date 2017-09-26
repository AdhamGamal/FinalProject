package com.udacity.gradle.builditbigger;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.udacity.gradle.jokedisplay.JokeActivity;

public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.JokeDeliver {
    String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new EndpointsAsyncTask(this).execute();
    }

    public void launchJokeActivity(View view) {
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra("joke", joke);
        startActivity(intent);
    }

    @Override
    public void onJokeDelivered(String joke) {
        this.joke = joke;
    }
}