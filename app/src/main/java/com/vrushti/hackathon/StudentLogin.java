package com.vrushti.hackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StudentLogin extends AppCompatActivity {
    EditText sname , spassword , semail;
    Button login;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));
        sname = findViewById(R.id.username);
        spassword = findViewById(R.id.password);
        semail = findViewById(R.id.email);
        login = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e , p;
                String n ;
                n = sname.getText().toString();
                e = semail.getText().toString();
                p = spassword.getText().toString();
                if(TextUtils.isEmpty(e)){
                    Toast.makeText(StudentLogin.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(p)){
                    Toast.makeText(StudentLogin.this,"Enter password",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(e, p)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in item's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Toast.makeText(StudentLogin.this, "Login Successful.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(StudentLogin.this , HMSStudentPage1.class);
                                    startActivity(intent);

                                } else {
                                    // If sign in fails, display a message to the item.
                                    Toast.makeText(StudentLogin.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }

                            }
                        });

            }
        });

    }
}