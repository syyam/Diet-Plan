package com.example.syyam.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Suffering extends AppCompatActivity {

    private String code;
    private Intent Sintent;

    private String scoreGet;
    private Button msubmit;
    private EditText mScore;
    private TextView mCaller;
    private int finalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suffering);

        msubmit=(Button) findViewById(R.id.submit);
        mScore=(EditText) findViewById(R.id.score);
        mCaller=(TextView) findViewById(R.id.caller);



        Sintent = getIntent();
        code= Sintent.getStringExtra("code");

        msubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreGet=mScore.getText().toString();
                if (scoreGet.length()>0)
                    finalValue=Integer.parseInt(scoreGet);
                if (code.equals("adhd")) {
                    if (finalValue > 14) {
                        Intent ad = new Intent(Suffering.this, ChoosePlan.class);
                        ad.putExtra("suffering", code);
                        startActivity(ad);
                    } else
                        Toast.makeText(Suffering.this, "No ADHD Likely", Toast.LENGTH_LONG).show();
                }
                else if (code.equals("bipolar")) {
                    if (finalValue > 14) {
                        Intent ad = new Intent(Suffering.this, ChoosePlan.class);
                        ad.putExtra("suffering", code);
                        startActivity(ad);
                    } else
                        Toast.makeText(Suffering.this, "No Bipolar Disorder Likely", Toast.LENGTH_LONG).show();

                }
                else if (code.equals("depression")) {

                    if (finalValue > 9) {
                        Intent ad = new Intent(Suffering.this, ChoosePlan.class);
                        ad.putExtra("suffering", code);
                        startActivity(ad);
                    } else
                        Toast.makeText(Suffering.this, "No Depression Likely", Toast.LENGTH_LONG).show();

                }
                else if (code.equals("panic")) {

                    if (finalValue > 5) {
                        Intent ad = new Intent(Suffering.this, ChoosePlan.class);
                        ad.putExtra("suffering", code);
                        startActivity(ad);
                    } else
                        Toast.makeText(Suffering.this, "No Panic Disorder Likely", Toast.LENGTH_LONG).show();

                }
                else if (code.equals("schezo")) {

                    if (finalValue > 9) {
                        Intent ad = new Intent(Suffering.this, ChoosePlan.class);
                        ad.putExtra("suffering", code);
                        startActivity(ad);
                    } else
                        Toast.makeText(Suffering.this, "No Schizophrenia Likely", Toast.LENGTH_LONG).show();

                }
                else if (code.equals("ocd")) {

                    if (finalValue > 7) {
                        Intent ad = new Intent(Suffering.this, ChoosePlan.class);
                        ad.putExtra("suffering", code);
                        startActivity(ad);
                    } else
                        Toast.makeText(Suffering.this, "No OCD Likely", Toast.LENGTH_LONG).show();

                }
                else if (code.equals("personality"))
                {

                        Intent ad=new Intent(Suffering.this,ChoosePlan.class);
                        ad.putExtra("suffering",code);
                        startActivity(ad);

                }

                else if (code.equals("stress"))
                {

                            Intent ad=new Intent(Suffering.this,ChoosePlan.class);
                            ad.putExtra("stress",code);
                            startActivity(ad);

                }
                else if (code.equals("sleep"))
                {
                            Intent ad=new Intent(Suffering.this,ChoosePlan.class);
                            ad.putExtra("suffering",code);
                            startActivity(ad);

                }
            }
        });



        mCaller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (code.equals("adhd")) {

                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/cork-adhd-quiz.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);

                }
                if (code.equals("bipolar")) {

                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/bipolar-test.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);

                }
                if (code.equals("depression")) {

                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/depression-quiz.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);

                }
                if (code.equals("panic")) {

                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/anxiety.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);

                }
                if (code.equals("schezo")) {

                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/schizophrenia.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);

                }
                if (code.equals("ocd")) {

                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/ocdquiz.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);

                }


                if (code.equals("stress"))
                {
                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/stress-test.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);
                }
                if (code.equals("sleep"))
                {
                    Intent ad=new Intent(Suffering.this,DisorederWebView.class);
                    ad.putExtra("url","https://psychcentral.com/quizzes/sleep-quiz.htm");
                    ad.putExtra("suffering",code);
                    startActivity(ad);
                }
            }
        });

    }
}
