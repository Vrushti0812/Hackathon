package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class AdminloginActivity extends AppCompatActivity {
    EditText aname , apassword;
    Button lgin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

        aname = findViewById(R.id.username);
        apassword = findViewById(R.id.password);
        lgin = findViewById(R.id.button);

        lgin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
    
            }
        });
    }
}