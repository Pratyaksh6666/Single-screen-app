package com.example.scorekeeperapppratyaksh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreTextViewTeamA,scoreTextViewTeamB,outTextViewTeamA,outTextViewTeamB, overTextViewTeamA,overTextViewTeamB;
    private int outNoTeamA=0;
    private int outNoTeamB=0;
    private int scoreTeamA=0;
    private int scoreTeamB=0;
    private int overTeamA=0;
    private int overTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTextViewTeamA=findViewById(R.id.team_a_score_text_view);
        scoreTextViewTeamB=findViewById(R.id.team_b_score_text_view);
        outTextViewTeamA=findViewById(R.id.team_a_out_text_view);
        outTextViewTeamB=findViewById(R.id.team_b_out_text_view);
        overTextViewTeamA=findViewById(R.id.team_a_over_text_view);
        overTextViewTeamB=findViewById(R.id.team_b_over_text_view);


    }
    public void sixRunIncrementTeamA(View view) {
        scoreTeamA+=6;
        displayDetailTeamA();
    }
    public void fourRunIncrementTeamA(View view) {
        scoreTeamA+=4;
        displayDetailTeamA();
    }
    public void oneRunIncrementTeamA(View view) {
        scoreTeamA+=1;
        displayDetailTeamA();
    }
    public void outIncrementTeamA(View view) {
        if(outNoTeamA<10)
            outNoTeamA+=1;
        displayDetailTeamA();
    }
    public void overIncrementTeamA(View view) {
        if (overTeamA<20)
            overTeamA+=1;
        displayDetailTeamA();
    }
    private void displayDetailTeamA(){
        scoreTextViewTeamA.setText("SCORE: "+scoreTeamA);
        outTextViewTeamA.setText("OUT: "+outNoTeamA+"/10");
        overTextViewTeamA.setText("OVER: "+overTeamA+"/20");
    }
    public void resetButton(View view) {
        scoreTeamA=0;
        outNoTeamA=0;
        scoreTeamB=0;
        outNoTeamB=0;
        overTeamB=0;
        overTeamA=0;
        displayDetailTeamA();
        displayDetailTeamB();
    }
    public void sixRunIncrementTeamB(View view) {
        scoreTeamB+=6;
        displayDetailTeamB();
    }
    public void fourRunIncrementTeamB(View view) {
        scoreTeamB+=4;
        displayDetailTeamB();
    }
    public void oneRunIncrementTeamB(View view) {
        scoreTeamB+=1;
        displayDetailTeamB();
    }
    public void outIncrementTeamB(View view) {
        if (outNoTeamB<10)
            outNoTeamB+=1;
        displayDetailTeamB();
    }
    public void overIncrementTeamB(View view) {
        if (overTeamB<20)
            overTeamB+=1;
        displayDetailTeamB();
    }
    private void displayDetailTeamB() {
        scoreTextViewTeamB.setText("SCORE: "+scoreTeamB);
        outTextViewTeamB.setText("OUT: "+outNoTeamB+"/10");
        overTextViewTeamB.setText("OVER: "+overTeamB+"/20");
    }
}
