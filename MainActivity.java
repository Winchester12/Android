package com.example.admin.sportaplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_begin;
    Button btn_timetb;
    Button btn_chTrain;
    Button btn_set;
    Button btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_begin=(Button) findViewById(R.id.begin);
        btn_timetb=(Button) findViewById(R.id.timetable);
        btn_chTrain=(Button) findViewById(R.id.choose_training);
        btn_set=(Button) findViewById(R.id.settings);
        btn_about=(Button) findViewById(R.id.about);

        btn_begin.setOnClickListener(ocl_but);
        btn_timetb.setOnClickListener(ocl_but);
        btn_chTrain.setOnClickListener(ocl_but);
        btn_set.setOnClickListener(ocl_but);
        btn_about.setOnClickListener(ocl_but);
    }


    View.OnClickListener ocl_but=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.begin:
                    //провірка , чи відбувся тест, перевірка чи є в цей день треня
                    startActivity(new Intent(MainActivity.this,Training.class));
                    break;
                case R.id.timetable:
                    startActivity(new Intent(MainActivity.this,Timetable.class));
                    break;
                case R.id.choose_training:
                    startActivity(new Intent(MainActivity.this,chooseTraining.class));
                    break;
                case R.id.settings:
                    startActivity(new Intent(MainActivity.this,Settings.class));
                    break;
                case R.id.about:
                    startActivity(new Intent(MainActivity.this,About.class));
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
