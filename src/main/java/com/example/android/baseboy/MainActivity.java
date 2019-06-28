package com.example.android.baseboy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int run_A, run_B, out_A, out_B;

    TextView runTextA, runTextB, outTextA, outTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        run_A = 0;
        run_B = 0;
        out_A = 0;
        out_B = 0;

        runTextA = (TextView) findViewById(R.id.team_A_runs);
        runTextB = (TextView) findViewById(R.id.team_B_runs);
        outTextA = (TextView) findViewById(R.id.team_A_outs);
        outTextB = (TextView) findViewById(R.id.team_B_outs);
    }

    public void display_run_A(int run){
        runTextA.setText(String.valueOf(run));
    }

    public void display_run_B(int run){
        runTextB.setText(String.valueOf(run));
    }

    public void display_out_A(int run){
        outTextA.setText(String.valueOf(run));
    }

    public void display_out_B(int run){
        outTextB.setText(String.valueOf(run));
    }

    public void addRunTeamA(View view){
        run_A += 1;
        display_run_A(run_A);
    }
    public void subRunTeamA(View view){
        run_A -= 1;
        display_run_A(run_A);
    }

    public void addRunTeamB(View view){
        run_B += 1;
        display_run_B(run_B);
    }
    public void subRunTeamB(View view){
        run_B -= 1;
        display_run_B(run_B);
    }

    public void addOutTeamA(View view){
        out_A += 1;
        display_out_A(out_A);
    }
    public void subOutTeamA(View view){
        out_A -= 1;
        display_out_A(out_A);
    }

    public void addOutTeamB(View view){
        out_B += 1;
        display_out_B(out_B);
    }
    public void subOutTeamB(View view){
        out_B -= 1;
        display_out_B(out_B);
    }

    public void reset(View view){
        run_A = run_B = out_A = out_B = 0;

        display_run_A(run_A);
        display_run_B(run_B);
        display_out_A(out_A);
        display_out_B(out_B);
    }
}
