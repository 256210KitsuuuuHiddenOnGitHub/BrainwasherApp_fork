package com.example.brainwashers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class AuthenticationScreen extends AppCompatActivity {
//This is where Authentication will process haha fake frend (Sorry for Login lang pala to hahahahaha)

  TextView register;
  TextView guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication_screen);

//        This will Redirect to Register Screen
        register = findViewById(R.id.Register);
        guest = findViewById(R.id.Guest);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), RegisterScreen.class);
                startActivity(i);
            }
        });
//        This will Redirect to Guest Screen
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Guest.class);
                startActivity(i);
            }
        });
    }
}