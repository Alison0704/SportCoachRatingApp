package com.example.sportcoachratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpPage extends AppCompatActivity {

    Button btnChangeProfile, btnChangeAddress, btnBackToMain;
    ImageView imgProfile;
    TextView nameDisplay, addressDisplay;
    public String constName, constAddress, constPostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        btnChangeProfile = findViewById(R.id.ProfileChange);
        btnChangeAddress = findViewById(R.id.ChangeAddress);
        btnBackToMain = findViewById(R.id.backbutton);
        imgProfile = findViewById(R.id.ProfilePicture);
        nameDisplay = findViewById(R.id.NameDisplay);
        addressDisplay = findViewById(R.id.addressDisplay);

        String name = getIntent().getStringExtra("keyname");
        constName = name;
        String address = getIntent().getStringExtra("nameAddress");
        constAddress = address;
        String postal = getIntent().getStringExtra("namePostalCode");
        constPostal = postal;
        int imgId = getIntent().getIntExtra("imageProfile", R.drawable.ic_logo_00);

        if(name != null)
        {
            nameDisplay.setText("Salut " + constName + ", ton nom est enregistré");
        }
        if(address != null &&(postal != null))
        {
            addressDisplay.setText("Voici ton address: "+ constAddress + " et ton code postal: " + constPostal);
        }
        imgProfile.setImageResource(imgId);

        btnChangeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this, ProfileChangeActivity.class);
                startActivity(intent);
            }
        });
        btnChangeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this, change_address.class);
                startActivity(intent);
            }
        });
        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}