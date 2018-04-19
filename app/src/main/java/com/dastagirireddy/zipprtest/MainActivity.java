package com.dastagirireddy.zipprtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    ListView lv;
    MyAdapter ma;
    List<LocationDetails> details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        details = new Vector<LocationDetails>();
        lv = (ListView) findViewById(R.id.location_details);
        ma = new MyAdapter(MainActivity.this, details);
        lv.setAdapter((ListAdapter) ma);


        mButton = (Button) findViewById(R.id.location_add);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(MainActivity.this,SelectMapLocation.class);
                startActivity(addIntent);
            }
        });
    }
}
