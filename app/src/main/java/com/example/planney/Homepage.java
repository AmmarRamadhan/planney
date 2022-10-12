package com.example.planney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void Tab1to2(View view) {
        Intent intent = new Intent(Homepage.this, SignUp.class);
        startActivity(intent);
    }
    public void Tab1to3(View view) {
        Intent intent = new Intent(Homepage.this, SignUp.class);
        startActivity(intent);
    }
    public void Tab1to4(View view) {
        Intent intent = new Intent(Homepage.this, SignUp.class);
        startActivity(intent);
    }
    public void Tab1to5(View view) {
        Intent intent = new Intent(Homepage.this, SignUp.class);
        startActivity(intent);
    }
}