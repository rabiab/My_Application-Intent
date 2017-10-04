package com.example.hp.myapplication_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.commons.logging.Log;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Intent intent =getIntent();
        Intent view=new Intent();
        view.setAction(Intent.ACTION_DIAL);
        view.setData(Uri.parse("tel:923004150576"));
        String val=intent.getStringExtra("key");
        startActivity(view);


    }



}
