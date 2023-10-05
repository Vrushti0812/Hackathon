package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

public class LH1_acc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lh1_acc);

        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));


    }
}