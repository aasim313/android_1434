package com.example.myapplication;

public class Question {
    private int questionResID;
    private boolean answerTrue;

    public Question(int questionResID, boolean answerTrue) {
        this.questionResID = questionResID;
        this.answerTrue = answerTrue;
    }

    public int getQuestionResID() {
        return questionResID;
    }

    public void setQuestionResID(int questionResID) {
        this.questionResID = questionResID;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.answerTrue = answerTrue;
    }
}
