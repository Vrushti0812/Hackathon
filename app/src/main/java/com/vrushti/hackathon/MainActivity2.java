package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button hostel , accounts , complaints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));
        hostel = findViewById(R.id.button2);
        accounts=  findViewById(R.id.button1);
        complaints = findViewById(R.id.button3);

        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this , Hostel.class);
                startActivity(intent);
            }
        });

        accounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this , Accounts.class);
                startActivity(intent);
            }
        });
        complaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this , Complaints.class);
                startActivity(intent);
            }
        });
    }
}