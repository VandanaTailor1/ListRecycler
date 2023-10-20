package com.example.listrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView txt1;
    TextView txt2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        String st= getIntent().getStringExtra("name");
        String s= getIntent().getStringExtra("name1");
        txt1=findViewById(R.id.email);
        txt2=findViewById(R.id.password);
          txt1.setText(st);
          txt2.setText(s);

    }
}