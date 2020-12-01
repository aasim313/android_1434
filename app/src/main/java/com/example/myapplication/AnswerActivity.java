package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private boolean isAnswerTrue;
    private String inHelp;
    private TextView textAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        inHelp = getIntent().getStringExtra("help");
        textAnswer = findViewById(R.id.textAnswer);
        textAnswer.setText(inHelp);



        // textAnswer.setText(isAnswerTrue ? R.string.correct : R.string.inCorrect);

    }
}