package com.example.hp.myapplication_intent;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Explicit

        Intent intent=new Intent (this,MainActivity2.class);
        intent.putExtra("Key","value");
        startActivity(intent);


    }
}
