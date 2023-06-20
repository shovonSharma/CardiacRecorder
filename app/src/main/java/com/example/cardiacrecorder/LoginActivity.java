package com.example.cardiacrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button button2;
    EditText edit1,edit2;
    TextView text2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button2=(Button) findViewById(R.id.btn_login);
        edit1=(EditText) findViewById(R.id.et_email);
        edit2=(EditText) findViewById(R.id.et_password);
        text2=(TextView) findViewById(R.id.text2);
    }
}