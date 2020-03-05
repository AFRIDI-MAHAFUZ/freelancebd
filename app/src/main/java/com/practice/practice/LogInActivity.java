package com.practice.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    private TextView registerHereTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        registerHereTV = findViewById(R.id.registerHereTV);
        registerHereTV.setPaintFlags(registerHereTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
