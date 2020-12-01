package com.example.myapplication;

public class Question {
    private int questionResID;
    private boolean answerTrue;
    private int answerID;

    public Question(int questionResID, boolean answerTrue, int answerID) {
        this.questionResID = questionResID;
        this.answerTrue = answerTrue;
        this.answerID = answerID;

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

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }
}
