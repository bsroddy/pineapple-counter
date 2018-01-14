package com.brendanroddy.pineapplecounter;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Counter extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

    }

    public void increment(View v) {
        count++;
        if ((count > 4) && (count < 8)) {
            displayCount(count);
            openFace(null);

        }
        else if (count == 4) {

            Toast ohno = Toast.makeText(Counter.this, "oh no", Toast.LENGTH_SHORT);
            ohno.setGravity(Gravity.TOP, 0, 250);
            ohno.show();
        }
        else if (count<4){

            Toast obvious = Toast.makeText(Counter.this, "You've seen a pineapple!", Toast.LENGTH_SHORT);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=20 && count<=25){

            Toast obvious = Toast.makeText(Counter.this, "That's a lot....", Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=50 && count<=55){

            Toast obvious = Toast.makeText(Counter.this, "Are you still okay?", Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=75 && count<=80){

            Toast obvious = Toast.makeText(Counter.this, "Wait, you're not--", Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=90 && count<=93){

            Toast obvious = Toast.makeText(Counter.this, "one of THEM?", Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=110 && count<=115){

            Toast obvious = Toast.makeText(Counter.this, "Oh, nevermind.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=125 && count <=130){

            Toast obvious = Toast.makeText(Counter.this, "Pineapples don't have fingers.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=170 && count<=175){

            Toast obvious = Toast.makeText(Counter.this, "You know what?", Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=190 && count<=195){

            Toast obvious = Toast.makeText(Counter.this, "I bet you're lying.", Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=210 && count<=225){

            Toast obvious = Toast.makeText(Counter.this, "I bet you haven't seen a single pineapple.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }

        else if (count>=240 && count<=255){

            Toast obvious = Toast.makeText(Counter.this, "I bet you're just trying to get a little something extra.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }

        else if (count>=270 && count<=285){

            Toast obvious = Toast.makeText(Counter.this, "Tell you what, get to 400 and you'll get something.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }

        else if (count>=400 && count<=410){

            Toast obvious = Toast.makeText(Counter.this, "I lied.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=450 && count<=460){

            Toast obvious = Toast.makeText(Counter.this, "Try 600?",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count>=600 && count<=615){

            Toast obvious = Toast.makeText(Counter.this, "Congrats, but your princess is in another castle.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }

        else if (count==700){

            Toast obvious = Toast.makeText(Counter.this, "Fine.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();
        }
        else if (count==705) {

            openEgg(null);
        }
        else if (count>719){

            Toast obvious = Toast.makeText(Counter.this, "You should open a grocery store.",
                    Toast.LENGTH_LONG);
            obvious.setGravity(Gravity.TOP, 0, 250);
            obvious.show();

            if (count==1000)
                count=0;
        }
        displayCount(count);


    }

    public void reset(View v) {

        count = 0;
        displayCount(count);
    }


    private void displayCount(int count) {
        TextView countView = (TextView) findViewById(R.id.count_view);
        countView.setText("" + count);
    }

    public void openFace(View v) {

        Intent intent = new Intent(this, Face.class);
        MediaPlayer scream = MediaPlayer.create(this, R.raw.wilhelm_scream);
        scream.start();
        startActivity(intent);

        //count = 0;
        //displayCount(0);
    }

    public void openEgg(View v) {

        Intent intent = new Intent(this, Egg.class);
        startActivity(intent);


    }

}
