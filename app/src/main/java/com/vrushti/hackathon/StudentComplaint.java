package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentComplaint extends AppCompatActivity {
    EditText textView;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_complaint);
        textView = findViewById(R.id.textView);
        submit = findViewById(R.id.button10);

        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.getText().toString();
                Toast.makeText(StudentComplaint.this, "Thank you for your reviews.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}