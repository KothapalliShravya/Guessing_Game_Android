package com.myappcompany.shravya.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String message = "";

    int r;

    public void randomNumberGenerator() {

        Random rand = new Random();

        r = rand.nextInt(20) + 1;

    }

    public void guess(View view) {

        EditText number = (EditText) findViewById(R.id.number);

        int guess = Integer.parseInt(number.getText().toString());

        if(guess > r) {

            message = "Lower!";

        }

        if(guess < r) {

            message = "Higher!";

        }

        if(guess == r) {

            message = "That is correct! Play again!";

            randomNumberGenerator();

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumberGenerator();

    }
}
