package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.material.internal.DescendantOffsetUtils;

public class HMSStudentPage1 extends AppCompatActivity {
    Button student , mess , outing , complaints , night , parlour , cleaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmsstudent_page1);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));
        student = findViewById(R.id.button2);
        mess = findViewById(R.id.button3);
        outing = findViewById(R.id.button4);
        complaints = findViewById(R.id.button5);
        night = findViewById(R.id.button6);
        parlour = findViewById(R.id.button7);
        cleaning = findViewById(R.id.button8);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , StudentInfo.class);
                startActivity(intent);
            }
        });
        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , Mess.class);
                startActivity(intent);
            }
        });
        outing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , Outing.class);
                startActivity(intent);
            }
        });
        complaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , StudentComplaint.class);
                startActivity(intent);
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , Canteen.class);
                startActivity(intent);
            }
        });
        parlour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , Parlour.class);
                startActivity(intent);
            }
        });
        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this , Cleaning.class);
                startActivity(intent);
            }
        });
    }
}