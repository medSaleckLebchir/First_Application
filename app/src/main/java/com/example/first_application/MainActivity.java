package com.example.first_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int count = 0;
    private TextView labelTxt;
    private Button incBtn, decBtn, resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setListeners();
    }

    private void setListeners() {
        incBtn.setOnClickListener(this);
        decBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
    }

    private void initViews() {
        labelTxt = findViewById(R.id.label);
        incBtn = findViewById(R.id.inc);
        decBtn = findViewById(R.id.dec);
        resetBtn = findViewById(R.id.reset);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.inc:
                labelTxt.setText(String.valueOf(++count));
                break;
            case R.id.dec:
                labelTxt.setText(count > 0 ? String.valueOf(--count) : "La valeur du conteur ne pas etre negative ...!");
                break;
            case R.id.reset:
                count = 0;
                labelTxt.setText(String.valueOf(count));
                break;
            default:
        }
    }

}