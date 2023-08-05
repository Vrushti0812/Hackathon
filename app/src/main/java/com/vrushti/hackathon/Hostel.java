package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Hostel extends AppCompatActivity {
    int CurrentProgress = 0;
    ProgressBar  progressBar;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);

        progressBar = findViewById(R.id.progreebar);
        start = findViewById(R.id.btnStart);

        CountDownTimer countDownTimer = new CountDownTimer(11*1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                CurrentProgress= CurrentProgress + 10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(50);


            }

            @Override
            public void onFinish() {

            }
        };
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.start();
            }
        });
    }
}