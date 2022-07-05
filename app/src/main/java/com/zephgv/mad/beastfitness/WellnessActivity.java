package com.zephgv.mad.beastfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class WellnessActivity extends AppCompatActivity {

    Random random = new Random();
    TextView textQuote;
    ImageView buttonQuote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        textQuote= findViewById(R.id.textViewQuote);
        buttonQuote= findViewById(R.id.nextimg);

        buttonQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayQuote();
            }
        });
    }
    public void displayQuote() {
        int randNum = random.nextInt((12+1) - 1) + 1;
        String randQuote = "";

        switch (randNum){
            case 1:
                randQuote=getString(R.string.quote1);
                break;
            case 2:
                randQuote=getString(R.string.quote2);
                break;
            case 3:
                randQuote=getString(R.string.quote3);
                break;
            case 4:
                randQuote=getString(R.string.quote4);
                break;
            case 5:
                randQuote=getString(R.string.quote5);
                break;
            case 6:
                randQuote=getString(R.string.quote6);
                break;
            case 7:
                randQuote=getString(R.string.quote7);
                break;
            case 8:
                randQuote=getString(R.string.quote8);
                break;
            case 9:
                randQuote=getString(R.string.quote9);
                break;
            case 10:
                randQuote=getString(R.string.quote10);
                break;
            case 11:
                randQuote=getString(R.string.quote11);
                break;
            case 12:
                randQuote=getString(R.string.quote12);
                break;

        }
        textQuote.setText(randQuote);
    }
}