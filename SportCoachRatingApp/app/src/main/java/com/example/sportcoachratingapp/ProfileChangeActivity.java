package com.example.sportcoachratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ProfileChangeActivity extends AppCompatActivity {
    Button btnBack;
    ImageView img1,img2,img3,img4,img5,img6;
    ImageView imgPreview;
    EditText changeName;

    int imgIdSelected = R.drawable.ic_logo_00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_change);
        btnBack = findViewById(R.id.backToMain);
        img1 = findViewById(R.id.Choice1);
        img2 = findViewById(R.id.Choice2);
        img3 = findViewById(R.id.Choice3);
        img4 = findViewById(R.id.Choice4);
        img5 = findViewById(R.id.Choice5);
        img6 = findViewById(R.id.Choice6);
        imgPreview = findViewById(R.id.PreviewImg);
        changeName = findViewById(R.id.editName);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = changeName.getText().toString();
                Intent intent = new Intent(ProfileChangeActivity.this, SignUpPage.class);
                intent.putExtra("keyname", name);
                intent.putExtra("imageProfile", imgIdSelected);
                startActivity(intent);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreview.setImageDrawable(img1.getDrawable());
                imgIdSelected = R.drawable.ic_logo_01;
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreview.setImageDrawable(img2.getDrawable());
                imgIdSelected = R.drawable.ic_logo_02;
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreview.setImageDrawable(img3.getDrawable());
                imgIdSelected = R.drawable.ic_logo_03;

            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreview.setImageDrawable(img4.getDrawable());
                imgIdSelected = R.drawable.ic_logo_04;

            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreview.setImageDrawable(img5.getDrawable());
                imgIdSelected = R.drawable.ic_logo_05;

            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPreview.setImageDrawable(img6.getDrawable());
                imgIdSelected = R.drawable.ic_logo_00;

            }
        });

    }

}