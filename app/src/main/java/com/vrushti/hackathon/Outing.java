package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.Window;

public class Outing extends AppCompatActivity {

    EditText name, regno, phnno;
    Button btn;
    Spinner sp1, sp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outing);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));


        name=findViewById(R.id.name);
        regno = findViewById(R.id.regnumber);
        phnno = findViewById(R.id.phnno);
        btn= findViewById(R.id.gbtn);
        sp1=findViewById(R.id.spinner1);
        sp2=findViewById(R.id.spinner2);

        String[] G = {"LH-1" , "LH-2", "LH-3"};
       ArrayAdapter ad = new ArrayAdapter<String>(Outing.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,G);
        sp1.setAdapter(ad);

        String[] S = {"9:00-5:00" , "10:00-6:00", "11:00-7:00"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(Outing.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,S);
        sp1.setAdapter(ad1);



    }


    }




