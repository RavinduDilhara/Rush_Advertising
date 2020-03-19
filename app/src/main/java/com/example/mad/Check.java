package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Check extends AppCompatActivity {

    ImageView admin;
    ImageView cutomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        admin = findViewById(R.id.imageButtonCheckAdmin);
        cutomer = findViewById(R.id.imageButtonCheckCustomer);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Check.this, Admin_Login.class);
                startActivity(intent);
            }
        });

        cutomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Check.this, Customer_Login.class);
                startActivity(intent);
            }
        });
    }
}
