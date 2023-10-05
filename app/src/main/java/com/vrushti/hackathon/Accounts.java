package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Accounts extends AppCompatActivity {

    Button b1 , b2 , b3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        b1 = findViewById(R.id.button9);
        b2 = findViewById(R.id.button11);
        b3 = findViewById(R.id.button12);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accounts.this, LH1_acc.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accounts.this , LH2_acc.class);
                startActivity(intent);
            }
        });

    }
}