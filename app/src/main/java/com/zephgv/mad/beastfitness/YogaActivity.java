package com.zephgv.mad.beastfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class YogaActivity extends AppCompatActivity {

    CardView cd1,cd2,cd3,cd4,cd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        cd1 = findViewById(R.id.virkshasana);
        cd2 = findViewById(R.id.cobrasana);
        cd3 = findViewById(R.id.pranayama);
        cd4 = findViewById(R.id.yogasana);
        cd5 = findViewById(R.id.utkatasana);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=Dic293YNJI8");
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=fOdrW7nf9gw");
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=395ZloN4Rr8");
            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=1xRX1MuoImw");
            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=4xyTmX_OMiM");
            }
        });




    }
    private void gotoUri(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}