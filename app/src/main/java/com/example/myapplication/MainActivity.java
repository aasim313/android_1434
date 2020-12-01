package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button yesBtn;
    private Button noBtn;
    private Button showAnswer;
    private Button showResult;

    private TextView textView;

    private Question[] questions = new Question[]{
            new Question(R.string.question1, true),
            new Question(R.string.question2, false),
            new Question(R.string.question3, false),
            new Question(R.string.question4, true),
            new Question(R.string.question5, true),
    };

    private int questionIndex = 0; // номер вопроса
    private String result = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState!=null) questionIndex = savedInstanceState.getInt("questionIndex");   // запрашиваем значение по ключу



        textView = findViewById(R.id.textView);


        yesBtn = findViewById(R.id.yesBtn);
        noBtn = findViewById(R.id.noBtn);
        showAnswer = findViewById(R.id.showAnswer);
        showResult = findViewById(R.id.showResult);


        textView.setText(questions[questionIndex].getQuestionResID());


        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questions[questionIndex].isAnswerTrue()) {
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                    result += ("вопрос " + Integer.toString(questionIndex+1) + ": " + " + "+ "\n");
                }else {
                    Toast.makeText(MainActivity.this, R.string.inCorrect, Toast.LENGTH_SHORT).show();
                    result += ("вопрос " + Integer.toString(questionIndex+1) + ": " + " + "+ "\n");
                }

                if (questionIndex < (questions.length - 1)) questionIndex++;
                else questionIndex = 0;
                textView.setText(questions[questionIndex].getQuestionResID());
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!questions[questionIndex].isAnswerTrue()) {
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                    result += ("вопрос " + Integer.toString(questionIndex+1) + ": " + " + " + "\n");
                }else{
                    Toast.makeText(MainActivity.this, R.string.inCorrect, Toast.LENGTH_SHORT).show();
                    result += ("вопрос " + Integer.toString(questionIndex+1) + ": " + " - "+ "\n");}

                if (questionIndex < (questions.length - 1)) questionIndex++;
                else questionIndex = 0;
                textView.setText(questions[questionIndex].getQuestionResID());
            }
        });


        showAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("answer",questions[questionIndex].isAnswerTrue());
                startActivity(intent);
            }
        });


        // удалить потом - для теста

         showResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, ResultActivity.class);  // cj
                intent.putExtra("result", result);
                startActivity(intent);  // выполненеи намерения ( запуск активности)


            }
        });

    }



    @Override
    public void  onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.d("System info", "Метод onSaveInstanceState() запущен");
        savedInstanceState.putInt("questionIndex", questionIndex);   // cохранение переменной и ключа к ней

    }



/*
    @Override
    public void onStart() {
        super.onStart();
        Log.d("System info", "Метод onStart() запущен");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("System info", "Метод onResume() запущен");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("System info", "Метод onPause() запущен");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("System info", "Метод onStop() запущен");

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("System info", "Метод onDestroy() запущен");
    }


*/

}