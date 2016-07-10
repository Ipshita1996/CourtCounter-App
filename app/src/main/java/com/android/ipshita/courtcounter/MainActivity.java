package com.android.ipshita.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    int scorea=0;
    public void plus3a(View v){
        scorea=scorea+3;
        displayForTeamA(scorea);
    }
    public void plus2a(View v){
        scorea=scorea+2;
        displayForTeamA(scorea);
    }
    public void freethrowa(View v){
        scorea=scorea+1;
        displayForTeamA(scorea);
    }

    int scoreb=0;
    public void plus3b(View v){
        scoreb=scoreb+3;
        displayForTeamB(scoreb);
    }
    public void plus2b(View v){
        scoreb=scoreb+2;
        displayForTeamB(scoreb);
    }
    public void freethrowb(View v){
        scoreb=scoreb+1;
        displayForTeamB(scoreb);
    }
    public void reset(View v){
        scorea=scoreb=0;
        displayForTeamB(scoreb);
        displayForTeamA(scorea);
    }
}
