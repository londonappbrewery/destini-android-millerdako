package com.londonappbrewery.destini;

public class HistoryDestini {

    private int mHistoryID;
    private int mAnswerAID;
    private int mAnswerBID;

    public HistoryDestini(int HistoryResourceID, int mAnswerAResourceID, int mAnswerBResourceID){
        mHistoryID = HistoryResourceID;
        mAnswerAID = mAnswerAResourceID;
        mAnswerBID = mAnswerBResourceID;
    }

    public int getHistoryID() {
        return mHistoryID;
    }

    public void setHistoryID(int historyID) {
        mHistoryID = historyID;
    }

    public int getAnswerAID() {
        return mAnswerAID;
    }

    public void setAnswerAID(int answerAID) {
        mAnswerAID = answerAID;
    }

    public int getAnswerBID() {
        return mAnswerBID;
    }

    public void setAnswerBID(int answerBID) {
        mAnswerBID = answerBID;
    }
}
