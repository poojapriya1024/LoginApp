package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView myTextView;
    EditText userName,emailID,phoneNumber,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        userName = findViewById(R.id.editTextText2);
        emailID = findViewById(R.id.editTextTextEmailAddress2);
        phoneNumber = findViewById(R.id.editTextPhone2);
        password = findViewById(R.id.editTextTextPassword3);

//        Bundle extras = getIntent().getExtras();
//        String s1 = extras.getString("Username");



    }
    String name,email,phone,pwd;
    public void signUpAndLogIn(View v) {
        //name = userName.getText().toString();
//        email = emailID.getText().toString();
//        phone = phoneNumber.getText().toString()
    }

    public void welcomePage(View v)
    {
        name = userName.getText().toString();
        email = emailID.getText().toString();
        phone = phoneNumber.getText().toString();
        pwd = password.getText().toString();

        Intent i = new Intent(getApplicationContext(),loginPage.class);
        i.putExtra("Username",name);
        startActivity(i);
    }
}