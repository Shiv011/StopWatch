package com.com.mycompany.stopwatch;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    TextView text1, text2, text3, text4, textView;
    Button start, stop, display, random_but;
    Button button1, button2, button3, button4, button5;
    Chronometer chronometer;
    public static int i = 0;
    public static int j = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start_button);
        stop = (Button) findViewById(R.id.stop_button);
        chronometer = (Chronometer) findViewById(R.id.chronometer1);
        display = (Button) findViewById(R.id.display);
        textView = (TextView) findViewById(R.id.textView);
        random_but = (Button) findViewById(R.id.random_button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
    }


    public void start(View view) {
        chronometer.start();
        start.setText("Sharma");
        stop.setVisibility(View.VISIBLE);
    }

    public void stop(View view) {
        chronometer.stop();
        stop.setVisibility(View.GONE);
    }

    public void display(View view) {
        textView.setText(display.getText().toString());
        display.setVisibility(View.GONE);
    }

    public void uniqueNumber(View view) {
        Random Ran = new Random();
        int num1=Ran.nextInt(5);
        int num2=Ran.nextInt(5);
        int num3=Ran.nextInt(5);
        int num4=Ran.nextInt(5);
        int num5=Ran.nextInt(5);
        button1.setText(""+num1);
        button2.setText(""+num2);
        button3.setText(""+num3);
        button4.setText(""+num4);
        button5.setText(""+num5);

    }



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
