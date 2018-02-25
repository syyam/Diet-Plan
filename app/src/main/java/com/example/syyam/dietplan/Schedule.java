package com.example.syyam.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Schedule extends AppCompatActivity {


    private ImageButton mDaily;
    private ImageButton mWeekly;
    private ImageButton mMonthly;

    private Intent Sintent;
    private String suffer;
    private String plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        mDaily=(ImageButton) findViewById(R.id.diet);
        mWeekly=(ImageButton) findViewById(R.id.excercise);
        mMonthly=(ImageButton) findViewById(R.id.lifestyle);

        Sintent = getIntent();

        plan=Sintent.getStringExtra("plan");
        suffer=Sintent.getStringExtra("suffering");

        mDaily.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View view) {

                    Intent q=new Intent(Schedule.this,DailyAppContent.class);
                    q.putExtra("suffer",suffer);
                    q.putExtra("plan",plan);
                    startActivity(q);

            }
        });

        mWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent q=new Intent(Schedule.this,WeeklyDailyAppContent.class);
                    q.putExtra("suffer",suffer);
                    q.putExtra("plan",plan);
                    startActivity(q);

            }
        });

        mMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent q=new Intent(Schedule.this,MonthlyDailyAppContent.class);
                q.putExtra("suffer",suffer);
                q.putExtra("plan",plan);
                startActivity(q);

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.action_home)
        {
            Intent back=new Intent(Schedule.this,MainActivity.class);
            startActivity(back);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
