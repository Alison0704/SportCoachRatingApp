package com.example.sportcoachratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button btnSignUp;
   Button btnCalculator;
   Button btnLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUp = findViewById(R.id.SignUpButton);
        btnCalculator = findViewById(R.id.CalculatorButton);
        btnLogIn = findViewById(R.id.LoginButton);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpPage.class);
                startActivity(intent);
            }
        });
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculatorPage.class);
                startActivity(intent);
            }

        });
        btnLogIn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"non disponible",Toast.LENGTH_SHORT).show();
            }
        });

    }

}