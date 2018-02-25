package com.example.syyam.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseTestType extends AppCompatActivity {

    private Button onlineBtn;
    private Button eegButton;
    private Button history;
    private Intent Sintent;
    private String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_test_type);

        onlineBtn=(Button) findViewById(R.id.onlineTestBtn);
        eegButton=(Button) findViewById(R.id.eegTestBtn);
        history=(Button) findViewById(R.id.history);

        Sintent = getIntent();
        code= Sintent.getStringExtra("code");

        onlineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent L = new Intent(chooseTestType.this,Suffering.class);
                L.putExtra("code",code);
                startActivity(L);
            }
        });
        eegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent P = new Intent(chooseTestType.this,EEG.class);
                P.putExtra("code",code);
                startActivity(P);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q = new Intent(chooseTestType.this,history.class);
                Q.putExtra("code",code);
                startActivity(Q);
            }
        });

    }
}
