package com.example.syyam.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private ImageButton mADHD;
    private ImageButton mBipolar;
    private ImageButton mDepression;
    private ImageButton mOCD;
    private ImageButton mPersonality;
    private ImageButton mStress;
    private ImageButton mPanic;
    private ImageButton mSleep;
    private ImageButton mSchezo;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mADHD=(ImageButton) findViewById(R.id.adhd);
        mBipolar=(ImageButton) findViewById(R.id.bipolar);
        mDepression=(ImageButton) findViewById(R.id.depression);
        mOCD=(ImageButton) findViewById(R.id.ocd);
        mPersonality=(ImageButton) findViewById(R.id.personality);
        mStress=(ImageButton) findViewById(R.id.stress);
        mPanic=(ImageButton) findViewById(R.id.panic);
        mSleep=(ImageButton) findViewById(R.id.sleep);
        mSchezo=(ImageButton) findViewById(R.id.schezo);
        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in

                } else {
                    // User is signed out
                    Intent login=new Intent(MainActivity.this,LoginActivity.class);
                    login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(login);
                }
                // ...
            }
        };

        mADHD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","adhd");
                startActivity(ad);
            }
        });
        mBipolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","bipolar");
                startActivity(ad);
            }
        });
        mDepression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","depression");
                startActivity(ad);
            }
        });
        mPersonality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","personality");
                startActivity(ad);
            }
        });
        mStress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","stress");
                startActivity(ad);
            }
        });
        mPanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","panic");
                startActivity(ad);
            }
        });
        mSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","sleep");
                startActivity(ad);
            }
        });
        mSchezo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","schezo");
                startActivity(ad);
            }
        });
        mOCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad=new Intent(MainActivity.this,chooseTestType.class);
                ad.putExtra("code","ocd");
                startActivity(ad);
            }
        });


    }
    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }
    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.logout)
        {
            mAuth.signOut();
        }

        return super.onOptionsItemSelected(item);
    }
}
