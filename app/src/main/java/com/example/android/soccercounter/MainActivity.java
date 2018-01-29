package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Teams.
     */
    public void displayScore(String score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 1 point for team A
     */
    public void goalForTeamA(View v) {
        teamA = teamA + 1;
        displayScore(teamA + ":" + teamB);
    }

    /**
     * Adds 1 point for team B
     */
    public void goalForTeamB(View v) {
        teamB = teamB + 1;
        displayScore(teamA + ":" + teamB);
    }

    /**
     * Resets score
     */
    public void resetScore(View v) {
        teamA = 0;
        teamB = 0;
        displayScore(teamA + ":" + teamB);
    }
}
