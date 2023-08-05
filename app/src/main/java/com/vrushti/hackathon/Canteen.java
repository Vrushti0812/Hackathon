package com.vrushti.hackathon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.zip.Inflater;

public class Canteen extends AppCompatActivity {

    private RecyclerView recyclerView;


EditText e1 , e2 , e3 , e4 , e5,e6;
HashMap<String, Integer> itemPrices;
Button submit;

    @SuppressLint("MissingInflatedId")
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

        itemPrices = new HashMap<>();
        itemPrices.put("Paratha and Chicken", 100);
        itemPrices.put("Biryani", 120);
        itemPrices.put("Chicken-65", 80);
        itemPrices.put("Maggie", 60);
        itemPrices.put("Pasta", 70);
        itemPrices.put("Rolls", 80);


        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBill();
            }
        });




    }
    private void showBill() {
        int totalPrice = 0;

        totalPrice += itemPrices.get("Paratha and Chicken") * Integer.parseInt(e1.getText().toString());
        totalPrice += itemPrices.get("Biryani") * Integer.parseInt(e2.getText().toString());
        totalPrice += itemPrices.get("Chicken-65") * Integer.parseInt(e3.getText().toString());
        totalPrice += itemPrices.get("Maggie") * Integer.parseInt(e4.getText().toString());
        totalPrice += itemPrices.get("Pasta") * Integer.parseInt(e5.getText().toString());
        totalPrice += itemPrices.get("Rolls") * Integer.parseInt(e6.getText().toString());

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Total Bill");
        builder.setMessage("Total Price: Rs " + totalPrice);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Handle OK button click if needed, or leave it empty
                dialog.dismiss(); // Dismiss the dialog
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}