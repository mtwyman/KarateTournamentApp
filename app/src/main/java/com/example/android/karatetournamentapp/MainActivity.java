package com.example.android.karatetournamentapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.karatetournamentapp.R.id.combatant_one_score;
import static com.example.android.karatetournamentapp.R.id.combatant_two_score;

public class MainActivity extends AppCompatActivity {

    int combatantOneScore = 0;

    int combatantTwoScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Combatant 1.
     */
    public void displayForCombatantOne(int score) {
        TextView scoreView = (TextView) findViewById(combatant_one_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Combatant 2.
     */
    public void displayForCombatantTwo(int score) {
        TextView scoreView = (TextView) findViewById(combatant_two_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets score to 0.
     */

    public void resetScore(View v) {
        combatantOneScore = 0;
        combatantTwoScore = 0;
        displayForCombatantOne(combatantOneScore);
        displayForCombatantTwo(combatantTwoScore);
    }

    /**
     * Increases score for Combatant 1 by 1 point.
     */
    public void addOneCombatantOne(View v) {
        combatantOneScore = combatantOneScore + 1;
        displayForCombatantOne(combatantOneScore);
    }

    /**
     * Increases score for Combatant 1 by 2 points.
     */

    public void addTwoCombatantOne(View v) {
        combatantOneScore = combatantOneScore + 2;
        displayForCombatantOne(combatantOneScore);
    }

    /**
     * Decreases score for Combatant 1 by 1 point.
     */
    public void minusOneCombatantOne(View v) {
        combatantOneScore = combatantOneScore - 1;
        displayForCombatantOne(combatantOneScore);
    }

    /**
     * Increases score for Combatant 2 by 1 point.
     */

    public void addOneCombatantTwo(View v) {
        combatantTwoScore = combatantTwoScore + 1;
        displayForCombatantTwo(combatantTwoScore);
    }

    /**
     * Increases score for Combatant 2 by 2 points.
     */
    public void addTwoCombatantTwo(View v) {
        combatantTwoScore = combatantTwoScore + 2;
        displayForCombatantTwo(combatantTwoScore);
    }

    /**
     * Decreases score for Combatant 2 by 1 point.
     */

    public void minusOneCombatantTwo(View v) {
        combatantTwoScore = combatantTwoScore - 1;
        displayForCombatantTwo(combatantTwoScore);
    }

}
