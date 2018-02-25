package com.example.syyam.dietplan;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    private EditText mLoginEmailField;
    private EditText mLoginPasswordField;
    private Button mLoginBtn;
    private FirebaseAuth mAuth;
    private TextView button;
    private ProgressDialog mProgress;
    private DatabaseReference mDatabaseUsers;
    private TextView mForgot;
    private EditText input;
    private String Femail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth=FirebaseAuth.getInstance();
        mDatabaseUsers= FirebaseDatabase.getInstance().getReference().child("Users");
        mLoginEmailField=(EditText) findViewById(R.id.loginEmailField);
        mLoginPasswordField=(EditText) findViewById(R.id.loginPasswordField);
        mLoginBtn=(Button) findViewById(R.id.loginBtn);
        button=(TextView) findViewById(R.id.button);
        mForgot=(TextView) findViewById(R.id.forgot);

        mProgress=new ProgressDialog(this);


        input = new EditText(this);

        mForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgetPass();
            }
        });


        mDatabaseUsers.keepSynced(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup=new Intent(LoginActivity.this,RegisterActivity.class);
                signup.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(signup);
            }
        });
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();

            }
        });
    }

    private void forgetPass() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Password Reset Form");
        alert.setMessage("Type your email in the box.");
        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

                // Do something with value!
                Femail=input.getText().toString().trim();

                FirebaseAuth.getInstance().sendPasswordResetEmail(Femail)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(LoginActivity.this,"A password reset code has been sent to "+Femail,Toast.LENGTH_LONG).show();
                                }
                            }
                        });

            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // Canceled.
                Toast.makeText(LoginActivity.this,"This email doesn't exist in our databases. "+Femail,Toast.LENGTH_LONG).show();
            }
        });

        alert.show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Are you sure?");
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                Process.killProcess(Process.myPid());
                                System.exit(1);
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    private void checkLogin() {
        String email=mLoginEmailField.getText().toString().trim();
        String password=mLoginPasswordField.getText().toString().trim();
        if (!TextUtils.isEmpty(email)&&!TextUtils.isEmpty(password))
        {
            mProgress.setMessage("Logging in");
            mProgress.show();
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful())
                    {
                        mProgress.dismiss();
                        checkUserExist();

                    }
                    else
                    {
                        mProgress.dismiss();
                        Toast.makeText(LoginActivity.this,"Incorrect Email or Password",Toast.LENGTH_LONG).show();
                    }
                }
            });

        }
        else {
            Toast.makeText(LoginActivity.this,"Incorrect Email or Password",Toast.LENGTH_LONG).show();
        }

    }

    private void checkUserExist() {
        if (mAuth.getCurrentUser()!=null) {
            final String user_id = mAuth.getCurrentUser().getUid();
            mDatabaseUsers.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.hasChild(user_id)) {

                        Intent login = new Intent(LoginActivity.this, MainActivity.class);
                        login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(login);
                        finish();
                    } else {
                        Intent setup = new Intent(LoginActivity.this, MainActivity.class);
                        setup.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(setup);
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }
}
