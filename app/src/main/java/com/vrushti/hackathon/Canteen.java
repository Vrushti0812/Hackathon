package com.vrushti.hackathon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;



public class Canteen extends AppCompatActivity {

    private RecyclerView recyclerView;
//    private RecyclerViewAdapter adapter;
//    private List<Item> itemList;


EditText e1 , e2 , e3 , e4 , e5,e6;
Button submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        itemList = new ArrayList<>();
//        // Add items to the list (replace these with your actual data)
//        itemList.add(new Item("Item 1"));
//        itemList.add(new Item("Item 2"));
//        itemList.add(new Item("Item 3"));
//        // Add more items as needed
//
//        adapter = new RecyclerViewAdapter();
//        recyclerView.setAdapter(adapter);
//        adapter.submitList(itemList);

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


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Total Bill");
        builder.setMessage(String.valueOf(totalPrice));
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