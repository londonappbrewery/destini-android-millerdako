package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mstoryTextView;
    Button mbuttonTop;
    Button mbuttonBottom;
    int mStoryIndex = 0;

    private HistoryDestini[] mQuestionBank = new HistoryDestini[] {
            new HistoryDestini(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new HistoryDestini(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new HistoryDestini(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new HistoryDestini(R.string.T4_End, 0, 0),
            new HistoryDestini(R.string.T5_End, 0, 0),
            new HistoryDestini(R.string.T6_End, 0, 0),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mbuttonTop = (Button) findViewById(R.id.buttonTop);
        mbuttonBottom = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mStoryIndex){
                    case 0:
                    case 1:
                        updateQuestion(2);
                        break;
                    case 2:
                        updateQuestion(5);
                        break;
                    default:
                        updateQuestion(0);
                        break;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mStoryIndex){
                    case 0:
                        updateQuestion(1);
                        break;
                    case 1:
                        updateQuestion(3);
                        break;
                    case 2:
                        updateQuestion(4);
                        break;
                    default:
                        updateQuestion(0);
                        break;
                }
            }
        });

    }

    private void updateQuestion(int mIndexResource){
        mStoryIndex = mIndexResource;
        mstoryTextView.setText(mQuestionBank[mIndexResource].getHistoryID());
        if(mQuestionBank[mIndexResource].getAnswerAID() != 0 || mQuestionBank[mIndexResource].getAnswerBID() != 0){
            mbuttonTop.setText(mQuestionBank[mIndexResource].getAnswerAID());
            mbuttonBottom.setText(mQuestionBank[mIndexResource].getAnswerBID());
        }else{
            mbuttonTop.setVisibility(View.GONE);
            mbuttonBottom.setVisibility(View.GONE);
        }
    }
}
