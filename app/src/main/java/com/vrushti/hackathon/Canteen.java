package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Canteen extends AppCompatActivity {
    private RecyclerView recyclerView;
//    private RecyclerViewAdapter adapter;
//    private List<Item> itemList;


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

    }
}