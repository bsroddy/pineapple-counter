package com.brendanroddy.pineapplecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openCounter(View v){

        Intent intent = new Intent(this, Counter.class);
        startActivity(intent);
    }

    public void openOptions(View v){

        Toast snark = Toast.makeText(MainActivity.this, "You have no other option.", Toast.LENGTH_LONG);
        snark.setGravity(Gravity.TOP, 0, 250);
        snark.show();
    }
}
