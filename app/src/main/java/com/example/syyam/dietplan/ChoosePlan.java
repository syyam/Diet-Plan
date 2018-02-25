package com.example.syyam.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class ChoosePlan extends AppCompatActivity {


    private ImageButton mDiet;
    private ImageButton mExcercise;
    private ImageButton mLifestyle;
    private ImageButton mOverall;

    private Intent Sintent;
    private String suffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_plan);

        mDiet=(ImageButton) findViewById(R.id.diet);
        mExcercise=(ImageButton) findViewById(R.id.excercise);
        mLifestyle=(ImageButton) findViewById(R.id.lifestyle);
        mOverall=(ImageButton) findViewById(R.id.overal);


        Sintent = getIntent();
        suffer=Sintent.getStringExtra("suffering");

        mDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hay=new Intent(ChoosePlan.this,Schedule.class);
                hay.putExtra("suffering",suffer);
                hay.putExtra("plan","diet");
                startActivity(hay);
            }
        });
        mExcercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hay=new Intent(ChoosePlan.this,Schedule.class);
                hay.putExtra("plan","excercise");
                hay.putExtra("suffering",suffer);
                startActivity(hay);
            }
        });
        mLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hay=new Intent(ChoosePlan.this,Schedule.class);
                hay.putExtra("plan","lifestyle");
                hay.putExtra("suffering",suffer);
                startActivity(hay);
            }
        });
        mOverall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hay=new Intent(ChoosePlan.this,OverallSchedule.class);
                hay.putExtra("plan","lifestyle");
                hay.putExtra("suffering",suffer);
                startActivity(hay);
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
            Intent back=new Intent(ChoosePlan.this,MainActivity.class);
            startActivity(back);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
