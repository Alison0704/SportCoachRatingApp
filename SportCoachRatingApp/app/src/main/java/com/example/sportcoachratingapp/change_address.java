package com.example.sportcoachratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class change_address extends AppCompatActivity {
    Button btnDone,btngooglemap;
    EditText strAddress, strPostal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_address);

        btnDone = findViewById(R.id.Done);
        btngooglemap = findViewById(R.id.btnGoogleMap);
        strAddress = findViewById(R.id.getAddress);
        strPostal = findViewById(R.id.getPostalCode);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address, postalcode;
                address = "XXX";
                postalcode = "XXX XXX";

                address = strAddress.getText().toString();
                postalcode = strPostal.getText().toString();
                Intent intent = new Intent(change_address.this, SignUpPage.class);
                intent.putExtra("nameAddress", address);
                intent.putExtra("namePostalCode", postalcode);
                startActivity(intent);
            }
        });
        btngooglemap.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(change_address.this,"non disponible",Toast.LENGTH_SHORT).show();
            }
        });
    }
}