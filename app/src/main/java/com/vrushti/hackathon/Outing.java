package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import android.os.Bundle;
import android.view.Window;

import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;

public class Outing extends AppCompatActivity {

    EditText name, regno, phnno;
    Button btn;
    Spinner sp1, sp2;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outing);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));


        name = findViewById(R.id.name);
        regno = findViewById(R.id.regno);
        phnno = findViewById(R.id.phnno);
        btn = findViewById(R.id.gbtn);
        sp1 = findViewById(R.id.spinner1);
        sp2 = findViewById(R.id.spinner2);
        imageView = findViewById(R.id.qr);

        String[] G = {"LH-1", "LH-2", "LH-3"};
        ArrayAdapter ad = new ArrayAdapter<String>(Outing.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, G);
        sp1.setAdapter(ad);

        String[] S = {"9:00-5:00", "10:00-6:00", "11:00-7:00"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(Outing.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, S);
        sp2.setAdapter(ad1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String registrationNumber = regno.getText().toString();
                String phoneNumber = phnno.getText().toString();
                String selectedBuilding = sp1.getSelectedItem().toString();
                String selectedTimeSlot = sp2.getSelectedItem().toString();

                // Concatenate all the information into a single string
                String userInfo = "Name: " + userName + "\n" +
                        "Registration Number: " + registrationNumber + "\n" +
                        "Phone Number: " + phoneNumber + "\n" +
                        "Selected Building: " + selectedBuilding + "\n" +
                        "Selected Time Slot: " + selectedTimeSlot;

                generateQRCode(userInfo);
            }
        });
    }

    private void generateQRCode(String data) {
        // Generate QR code
        QRCodeWriter writer = new QRCodeWriter();
        try {

            BitMatrix bitMatrix = writer.encode(data, BarcodeFormat.QR_CODE, 512, 512);
            int width = bitMatrix.getWidth();
            int height = bitMatrix.getHeight();
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    bitmap.setPixel(x, y, bitMatrix.get(x, y) ? Color.BLACK : Color.WHITE);
                }
            }
            imageView.setImageBitmap(bitmap); // Set the generated QR code to the ImageView
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}













