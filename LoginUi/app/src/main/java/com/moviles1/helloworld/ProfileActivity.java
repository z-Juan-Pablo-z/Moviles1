package com.moviles1.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView tvEmail, tvPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);
        Intent intent = getIntent(); // va a obtener los datos desde otra activity
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        tvEmail.setText("Bienvenido " + email);
        tvPassword.setText("Su contrasña es: " + password);
    }
}