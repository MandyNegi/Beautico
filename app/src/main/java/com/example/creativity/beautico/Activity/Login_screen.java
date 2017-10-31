package com.example.creativity.beautico.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.creativity.beautico.R;

public class Login_screen extends AppCompatActivity {
    String stringType = "";
    String getserid;
    private TextView textview_sign_up;
    private Button btnSing_in;
    private EditText edittext_email;
    private EditText edittext_password;
    private CheckBox checkbox_rember;
//    private SharedPreferences LoginCustId;

    private Boolean saveLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        checkbox_rember = (CheckBox) findViewById(R.id.checkbox_rember);

/*        LoginCustId = getSharedPreferences("loginPrefs", MODE_PRIVATE);

        if (LoginCustId.getString("Login", "").equals("True1") && LoginCustId.getString("button", "").equals("buttonfinder")) {
            //  Toast.makeText(LoginActivity.this,LoginCustId.getString("UserId", ""),Toast.LENGTH_LONG).show();
//            startActivity(new Intent(getApplicationContext(), MyProfile_eFinder.class));
            finish();
        }
        if (LoginCustId.getString("Login", "").equals("True2") && LoginCustId.getString("button", "").equals("buttondeliverers")) {
            //  Toast.makeText(LoginActivity.this,LoginCustId.getString("UserId", ""),Toast.LENGTH_LONG).show();
//            startActivity(new Intent(getApplicationContext(), Myprofile_Deliverers.class));
            finish();
        }*/

        textview_sign_up = (TextView) findViewById(R.id.textview_sign_up);
        textview_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_screen.this, SignUp.class);
                startActivity(intent);
            }
        });
//............................................Start Login............................................................
        edittext_password = (EditText) findViewById(R.id.edittext_password);
        edittext_email = (EditText) findViewById(R.id.edittext_email);

        btnSing_in = (Button) findViewById(R.id.btnSing_in);
        btnSing_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext_email.getText().toString().equals("") || edittext_password.getText().toString().equals("")
                        ) {
                    Toast.makeText(Login_screen.this, "Please Enter fill email and password ", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    userLogin(edittext_email.getText().toString(), edittext_password.getText().toString());
                }
            }
        });
    }

    private void userLogin(final String email, final String pass) {


        if (email.equals("abc123@gmail.com") && pass.equals("123456")) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));

        } else {
            Toast.makeText(this, "Your username or password is wrong", Toast.LENGTH_LONG).show();
        }

    }

    //.End Login...............................................................................................................................
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Login_screen.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }


}
