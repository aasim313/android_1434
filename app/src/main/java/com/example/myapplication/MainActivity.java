package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button yesBtn;
    private Button noBtn;

    private TextView textView;

    private Question[] questions = new Question[] {
      new Question(R.string.question1,true),
      new Question(R.string.question2,false),
      new Question(R.string.question3,false),
      new Question(R.string.question4,true),
      new Question(R.string.question5,true),
      };

    private int questionId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView  = findViewById(R.id.textView);

        yesBtn = findViewById(R.id.yesBtn);
         noBtn = findViewById(R.id.noBtn);


         textView.setText(questions[questionId].getQuestionResID());


         yesBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (questions[questionId].isAnswerTrue())
                 Toast.makeText(MainActivity.this,R.string.correct,Toast.LENGTH_SHORT).show();
                 else
                     Toast.makeText(MainActivity.this,R.string.inCorrect,Toast.LENGTH_SHORT).show();

                 if (questionId <(questions.length-1)) questionId++; else questionId=0;
                 textView.setText(questions[questionId].getQuestionResID());
             }
         });

         noBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (!questions[questionId].isAnswerTrue())
                     Toast.makeText(MainActivity.this,R.string.correct,Toast.LENGTH_SHORT).show();
                 else Toast.makeText(MainActivity.this,R.string.inCorrect,Toast.LENGTH_SHORT).show();

                 if (questionId <(questions.length-1)) questionId++; else questionId=0;
                 textView.setText(questions[questionId].getQuestionResID());
            }
         });


    }
}