package com.example.syyam.dietplan;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.HashMap;

public class history extends AppCompatActivity {



    private RecyclerView mProfileList;

    String mPostKey;
    private LinearLayoutManager mLayoutManager;

    private DatabaseReference DatabaseComment;
    private DatabaseReference DatabaseCommenttttt;
    private DatabaseReference hDatabase;
    private DatabaseReference Idatabase;
    private FirebaseAuth mAuth;

    private Intent Sintent;
    private String code;

    private TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        message =(TextView) findViewById(R.id.message);

        mProfileList=(RecyclerView) findViewById(R.id.comment_list);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        mProfileList.setHasFixedSize(true);
        mProfileList.setLayoutManager(new LinearLayoutManager(this));
        mAuth = FirebaseAuth.getInstance();

        Sintent = getIntent();
        code= Sintent.getStringExtra("code");

        DatabaseCommenttttt= FirebaseDatabase.getInstance().getReference().child("userData").child(mAuth.getCurrentUser().getUid()).child(code);

        Query lastQuery = DatabaseCommenttttt.orderByKey().limitToLast(2);
        lastQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot child: dataSnapshot.getChildren()) {

                    final String oldValA=(String) child.child("alpha").getValue();
                    final String oldValB=(String) child.child("alpha").getValue();
                    final String oldValD=(String) child.child("alpha").getValue();
                    final String oldValT=(String) child.child("alpha").getValue();
                    final String oldValG=(String) child.child("alpha").getValue();

                    DatabaseCommenttttt.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String newValA= dataSnapshot.child("new change").child("alpha").getValue().toString();
                            String newValB= dataSnapshot.child("new change").child("beta").getValue().toString();
                            String newValD= dataSnapshot.child("new change").child("delta").getValue().toString();
                            String newValT= dataSnapshot.child("new change").child("gamma").getValue().toString();
                            String newValG= dataSnapshot.child("new change").child("theta").getValue().toString();


                            Float prevValueA=Float.parseFloat(oldValA);
                            Float prevValueB=Float.parseFloat(oldValB);
                            Float prevValueD=Float.parseFloat(oldValD);
                            Float prevValueT=Float.parseFloat(oldValT);
                            Float prevValueG=Float.parseFloat(oldValG);

                            Float newValueA=Float.parseFloat(newValA);
                            Float newValueB=Float.parseFloat(newValB);
                            Float newValueD=Float.parseFloat(newValD);
                            Float newValueT=Float.parseFloat(newValT);
                            Float newValueG=Float.parseFloat(newValG);


                            if (code.equals("ocd")){
                                if (newValueB<=prevValueB&& newValueB<= 0.85  && newValueD<=prevValueD&& newValueD<= 0.8 )
                                {
                                    message.setText("You need to work on your plans more.");
                                }
                                if (newValueB>=prevValueB && newValueB <= 0.85 && newValueD >= prevValueD&& newValueD <= 0.8)
                                {
                                    message.setText("Your condition is improving. Well done, keep it up.");
                                }
                                if (newValueB>=prevValueB && newValueB >= 0.86 && newValueD >= prevValueD&& newValueD >= 0.8)
                                {
                                    message.setText("Hurrah! You have done it.");
                                }
                            }
                            if (code.equals("panic"))
                            {
                                if  (newValueA >= prevValueA && newValueB <= prevValueB && newValueD >= prevValueD && newValueT >= prevValueT)
                                {
                                    message.setText("You need to work on your plans more.");
                                }
                                if (newValueA <= 1.25 && newValueB >= 1.08 && newValueD <= 1.28 && newValueT <= 1.1)
                                {
                                    message.setText("Your condition is improving. Well done, keep it up.");
                                }
                                else
                                {
                                    message.setText("Hurrah! You have done it.");
                                }
                            }

                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        DatabaseCommenttttt.keepSynced(true);
        mLayoutManager = new LinearLayoutManager(history.this);
        mLayoutManager.setReverseLayout(true);
        mLayoutManager.setStackFromEnd(true);


    }


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Profile,ProfileViewHolder> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<Profile, ProfileViewHolder>(

                Profile.class,
                R.layout.list_item_layout,
                ProfileViewHolder.class,
                DatabaseCommenttttt
        ){

            @Override
            protected void populateViewHolder(final ProfileViewHolder viewHolder, final Profile model, int position) {

                viewHolder.setComments(model.getAlpha(),model.getBeta(),model.getDelta(),model.getTheta(),model.getGamma());


            }

        };

        mProfileList.setLayoutManager(mLayoutManager);
        mProfileList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder
    {
        View mView;
        GraphView graph;

        public ProfileViewHolder(View itemView) {
            super(itemView);

            mView=itemView;

        }

        public void setComments(String alpha, String beta, String delta, String theta, String gamma)
        {
            graph =(GraphView) mView.findViewById(R.id.graph);
            BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[] {
                    new DataPoint(1, Float.parseFloat(alpha.toString())),
                    new DataPoint(2, Float.parseFloat(beta.toString())),
                    new DataPoint(3, Float.parseFloat(delta.toString())),
                    new DataPoint(4, Float.parseFloat(theta.toString())),
                    new DataPoint(5, Float.parseFloat(gamma.toString()))

            });
            graph.addSeries(series);

        }

    }

}
