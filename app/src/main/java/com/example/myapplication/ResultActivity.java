package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private String inResult;
    private TextView resultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        inResult = getIntent().getStringExtra("result");
        resultList = findViewById(R.id.resultList);
        resultList.setText(inResult);



    }
}