package com.example.brainwashers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Guest extends AppCompatActivity {
    ImageView backBtn;
    Button continueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

//This will Go back to previous Screen
        backBtn = findViewById(R.id.GuestBackButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

//        This is the Continue Button function

        continueBtn = findViewById(R.id.Continue);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Guest.this,MainScreen.class);
                startActivity(i);
            }
        });
    }
}