package com.vrushti.hackathon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;



public class Canteen extends AppCompatActivity {


EditText e1 , e2 , e3 , e4 , e5,e6;
Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));


        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBill();
            }
        });




    }
    private void showBill() {
        int totalPrice=0;

        int price1 = 100 * Integer.parseInt(e1.getText().toString());
        int price2 = 120 * Integer.parseInt(e2.getText().toString());
        int price3 = 80 * Integer.parseInt(e3.getText().toString());
        int price4 = 60 * Integer.parseInt(e4.getText().toString());
        int price5 = 70 * Integer.parseInt(e5.getText().toString());
        int price6 = 80 * Integer.parseInt(e6.getText().toString());

        totalPrice = price1 + price2 + price3 + price4;



    }

}