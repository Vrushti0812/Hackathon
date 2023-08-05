package com.vrushti.hackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


public class AdminloginActivity extends AppCompatActivity {
    EditText aname , apassword;
    Button lgin;
    ImageView img;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

        aname = findViewById(R.id.email);
        apassword = findViewById(R.id.password);
        lgin = findViewById(R.id.button);
        img = findViewById(R.id.logo);

        lgin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e , p;
                e = aname.getText().toString();
                p = apassword.getText().toString();
                if(TextUtils.isEmpty(e)){
                    Toast.makeText(AdminloginActivity.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(p)){
                    Toast.makeText(AdminloginActivity.this,"Enter password",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(e, p)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in item's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Toast.makeText(AdminloginActivity.this, "Login Successful.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(AdminloginActivity.this , MainActivity2.class);
                                    startActivity(intent);

                                } else {
                                    // If sign in fails, display a message to the item.
                                    Toast.makeText(AdminloginActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }

                            }
                        });
            }
        });


    }
}