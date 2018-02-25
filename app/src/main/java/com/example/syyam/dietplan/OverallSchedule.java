package com.example.syyam.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OverallSchedule extends AppCompatActivity {

    private ImageButton mWeekly;
    private ImageButton mMonthly;

    private Intent Sintent;
    private String suffer;
    private String plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overall_schedule);

        mWeekly=(ImageButton) findViewById(R.id.weekly);
        mMonthly=(ImageButton) findViewById(R.id.monthly);

        Sintent = getIntent();

        plan=Sintent.getStringExtra("plan");
        suffer=Sintent.getStringExtra("suffering");


        mWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent q=new Intent(OverallSchedule.this,MonthlyAppContent.class);
                q.putExtra("suffer",suffer);
                q.putExtra("plan",plan);
                startActivity(q);

            }
        });

        mMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent q=new Intent(OverallSchedule.this,WeeklyAppContent.class);
                q.putExtra("suffer",suffer);
                q.putExtra("plan",plan);
                startActivity(q);

            }
        });
    }
}
