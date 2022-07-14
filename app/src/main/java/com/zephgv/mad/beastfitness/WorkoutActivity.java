package com.zephgv.mad.beastfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class WorkoutActivity extends AppCompatActivity {

    CardView cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cd1 = findViewById(R.id.pushcard);
        cd2 = findViewById(R.id.pullcard);
        cd3 = findViewById(R.id.squartcard);
        cd4 = findViewById(R.id.tplankcard);
        cd5 = findViewById(R.id.deadbugcard);
        cd6 = findViewById(R.id.skippingcard);
        cd7 = findViewById(R.id.heavysqcard);
        cd8 = findViewById(R.id.splitjumpcard);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=IODxDxX7oi4");
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=eGo4IYlbE5g");
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=YaXPRqUwItQ");
            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=rTY5mqJ1HNo");
            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=4XLEnwUr1d8");
            }
        });

        cd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=u3zgHI8QnqE");
            }
        });

        cd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=Uv_DKDl7EjA");
            }
        });

        cd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=qsF1gYTWTrQ");
            }
        });




    }
    private void gotoUri(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}