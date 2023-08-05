package com.vrushti.hackathon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.internal.DescendantOffsetUtils;

import java.util.Random;

public class HMSStudentPage1 extends AppCompatActivity {
    Button mess, outing, complaints, night, parlour, cleaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmsstudent_page1);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

        mess = findViewById(R.id.button3);
        outing = findViewById(R.id.button4);
        complaints = findViewById(R.id.button5);
        night = findViewById(R.id.button6);
        parlour = findViewById(R.id.button7);
        cleaning = findViewById(R.id.button8);

        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this, Mess.class);
                startActivity(intent);
            }
        });
        outing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this, Outing.class);
                startActivity(intent);
            }
        });
        complaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this, StudentComplaint.class);
                startActivity(intent);
//                showComplaintDialog();
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HMSStudentPage1.this, Canteen.class);
                startActivity(intent);
            }
        });
        parlour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomAppointmentTime();
            }
        });
        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showConfirmationDialog();
            }
        });
    }

    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cleaning Request");
        builder.setMessage("Your room cleaning has been requested.");
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

    private void showRandomAppointmentTime() {
        // Generate a random appointment time between 9:00 AM and 6:00 PM
        Random random = new Random();
        int hour = random.nextInt(9) + 9; // Generate random hour (9 to 17)
        int minute = random.nextInt(60);  // Generate random minute (0 to 59)

        // Format the time as a string
        String time = String.format("%02d:%02d", hour, minute);

        // Create the AlertDialog with the random appointment time and "Get Other Time" button
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Parlor Appointment");
        builder.setMessage("Your appointment is at: " + time);
        builder.setPositiveButton("Get Other Time", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Generate another random appointment time when "Get Other Time" is clicked
                showRandomAppointmentTime();
            }
        });
        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Handle OK button click if needed, or leave it empty
                dialog.dismiss(); // Dismiss the dialog
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

//    private void showComplaintDialog() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Submit Complaint");
//
//        // Inflate the complaint_dialog.xml layout
//        View view = getLayoutInflater().inflate(R.layout.complaint_dialog, null);
//        builder.setView(view);
//
//         EditText complaintEditText = view.findViewById(R.id.et);
//
//        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Get the user's complaint text from the EditText
//                String complaintText = complaintEditText.getText().toString().trim();
//
//                // Process the complaint, you can send it to your server or store it in a database
//                // For this example, we'll just show a Toast message
//                if (!complaintText.isEmpty()) {
//                    Toast.makeText(HMSStudentPage1.this, "Complaint submitted: " + complaintText, Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(HMSStudentPage1.this, "Please enter your complaint.", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss(); // Dismiss the dialog when "Cancel" is clicked
//            }
//        });
//
//        AlertDialog dialog = builder.create();
//        dialog.show();
    }
