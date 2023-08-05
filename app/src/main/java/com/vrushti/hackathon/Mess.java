package com.vrushti.hackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.icu.number.Scale;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Window;
import android.widget.ImageView;

public class Mess extends AppCompatActivity {
    ImageView img;
    private ScaleGestureDetector scaleGestureDetector;
    private float FACTOR = 1.0f;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));
         img = findViewById(R.id.imageView);
         scaleGestureDetector = new ScaleGestureDetector(this,new ScaleListner());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        scaleGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class ScaleListner extends ScaleGestureDetector.SimpleOnScaleGestureListener{

        @Override
        public boolean onScale(@NonNull ScaleGestureDetector detector) {
            FACTOR *= detector.getScaleFactor();
            FACTOR = Math.max(0.1f,Math.min(FACTOR,10.0f));
            img.setScaleX(FACTOR);
            img.setScaleY(FACTOR);

            return true;
        }
    }
}