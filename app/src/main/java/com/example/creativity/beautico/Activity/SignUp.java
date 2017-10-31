package com.example.creativity.beautico.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.creativity.beautico.R;

public class SignUp extends AppCompatActivity {

    private Button signup;
    private EditText first_name;
    private EditText last_name;
    private EditText mobile;
    private EditText address_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = (Button) findViewById(R.id.signup);
        first_name = (EditText) findViewById(R.id.first_name);
        last_name = (EditText) findViewById(R.id.last_name);
        mobile = (EditText) findViewById(R.id.mobile);
        address_act = (EditText) findViewById(R.id.address_act);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (first_name.getText().toString().trim().equals("") || last_name.getText().toString().trim().equals("") || mobile.getText().toString().trim().equals("") ||
                        address_act.getText().toString().trim().equals("")) {
                    Toast.makeText(SignUp.this, "Please Fill all Required Field First", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignUp.this, "Your Account Created Successfully..", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUp.this, Login_screen.class);
                    startActivity(intent);
                }
            }
        });
    }
}
