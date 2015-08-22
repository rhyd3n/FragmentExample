package com.example.android.fragmentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.simplefrag.SimpleFragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void simple(View v){
        Intent simpleintent = new Intent(getApplicationContext(), SimpleFragmentActivity.class);
        startActivity(simpleintent);
    }
}
