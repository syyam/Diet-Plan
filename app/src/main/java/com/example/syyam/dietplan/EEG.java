package com.example.syyam.dietplan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class EEG extends AppCompatActivity {

    private ProgressDialog mProgress;

    private SeekBar aSeekBar;
    private SeekBar bSeekBar;
    private SeekBar dSeekBar;
    private SeekBar tSeekBar;
    private SeekBar gSeekBar;

    private TextView aCount;
    private TextView bCount;
    private TextView dCount;
    private TextView tCount;
    private TextView gCount;

    private Button submitBtn;

    private Intent Sintent;
    private String code;

    private FirebaseAuth mAuth;
    private DatabaseReference mmDatabase;

    float avalue, bvalue, dvalue, tvalue, gvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeg);

        mAuth=FirebaseAuth.getInstance();
        FirebaseUser current_user=FirebaseAuth.getInstance().getCurrentUser();
        String uid = current_user.getUid();
        mmDatabase=FirebaseDatabase.getInstance().getReference().child("userData").child(mAuth.getCurrentUser().getUid());

        aSeekBar=(SeekBar) findViewById(R.id.mSeekAlpha);
        bSeekBar=(SeekBar) findViewById(R.id.mSeekBeta);
        dSeekBar=(SeekBar) findViewById(R.id.mSeekDelta);
        tSeekBar=(SeekBar) findViewById(R.id.mSeekTheta);
        gSeekBar=(SeekBar) findViewById(R.id.mSeekGamma);

        aCount=(TextView) findViewById(R.id.alphaCount);
        bCount=(TextView) findViewById(R.id.betaCount);
        dCount=(TextView) findViewById(R.id.deltaCount);
        tCount=(TextView) findViewById(R.id.thetaCount);
        gCount=(TextView) findViewById(R.id.gammaCount);

        submitBtn=(Button) findViewById(R.id.subBtn);

        mProgress=new ProgressDialog(this);

        Sintent = getIntent();
        code= Sintent.getStringExtra("code");

        aSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                avalue = (float) (i / 33.3);
                aCount.setText(avalue+"");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bvalue = (float) (i / 33.3);
                bCount.setText(bvalue+"");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        dSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                dvalue = (float) (i / 33.3);
                dCount.setText(dvalue+"");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        tSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvalue = (float) (i / 33.3);
                tCount.setText(tvalue+"");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        gSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                gvalue = (float) (i / 33.3);
                gCount.setText(gvalue+"");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int msg=0;
                mProgress.setMessage("Submiting...");
                mProgress.show();
                if (code.equals("panic")) {
                    if (avalue >1.25 && bvalue < 1.08 && dvalue >1.2 && tvalue > 1.1) {
                        sentDataToDB(code,avalue,bvalue, dvalue, tvalue, gvalue, msg);
                        Toast.makeText(EEG.this, "You are suffering from panic disorder.", Toast.LENGTH_LONG).show();

                    } else {
                        msg=1;
                        sentDataToDB(code,avalue,bvalue, dvalue, tvalue, gvalue, msg);
                        Toast.makeText(EEG.this, "No problem found.", Toast.LENGTH_LONG).show();

                    }
                }
                else if (code.equals("ocd")) {

                    if (bvalue < 0.85 && dvalue <0.8) {
                        sentDataToDB(code,avalue,bvalue, dvalue, tvalue, gvalue, msg);
                        Toast.makeText(EEG.this, "You are suffering from OCD.", Toast.LENGTH_LONG).show();

                    } else {
                        msg=1;
                        sentDataToDB(code,avalue,bvalue, dvalue, tvalue, gvalue, msg);
                        Toast.makeText(EEG.this, "No problem found.", Toast.LENGTH_LONG).show();

                    }
                }
                else
                {
                    Intent ad = new Intent(EEG.this, ChoosePlan.class);
                    ad.putExtra("suffering", code);
                    startActivity(ad);
                    finish();
                }
            }

            private void sentDataToDB(final String code, final float avalue, final float bvalue, final float dvalue, final float tvalue, final float gvalue, final int msg)
            {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference().child("userData").child(mAuth.getCurrentUser().getUid()).child(code);


                HashMap<String,String> userMap=new HashMap<>();
                userMap.put("alpha", "" +avalue);
                userMap.put("beta", ""+bvalue );
                userMap.put("delta", ""+dvalue);
                userMap.put("theta", ""+tvalue);
                userMap.put("gamma",""+gvalue);
                mmDatabase.child(code).child("new change").setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                    }
                });

                myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot snap: dataSnapshot.getChildren()) {


                            HashMap<String,String> userMap=new HashMap<>();
                            userMap.put("alpha", "" +avalue);
                            userMap.put("beta", ""+bvalue );
                            userMap.put("delta", ""+dvalue);
                            userMap.put("theta", ""+tvalue);
                            userMap.put("gamma",""+gvalue);
                            mmDatabase.child(code).child("no "+dataSnapshot.getChildrenCount()).setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful())
                                    {
                                        mProgress.dismiss();
                                        if (msg==0) {
                                            Intent ad = new Intent(EEG.this, ChoosePlan.class);
                                            ad.putExtra("suffering", code);
                                            startActivity(ad);
                                            finish();
                                        }
                                        else{
                                            Intent ad = new Intent(EEG.this, MainActivity.class);
                                            ad.putExtra("suffering", code);
                                            startActivity(ad);
                                            finish();
                                        }
                                    }
                                }
                            });

                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
    }

}
