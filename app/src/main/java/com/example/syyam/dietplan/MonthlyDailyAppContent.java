package com.example.syyam.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MonthlyDailyAppContent extends AppCompatActivity {

    private Intent Sintent;
    private String suffer;
    private String plan;

    //time
    private TextView one;
    private TextView two;
    private TextView three;
    private TextView four;
    private TextView five;
    private TextView six;
    private TextView seven;
    private TextView eight;
    private TextView nine;
    private TextView ten;
    private TextView eleven;
    private TextView twelve;
    private TextView thirteen;
    private TextView fourteen;
    private TextView fifteen;

    //activity
    private TextView onee;
    private TextView twoo;
    private TextView threee;
    private TextView fourr;
    private TextView fivee;
    private TextView sixx;
    private TextView sevenn;
    private TextView eightt;
    private TextView ninee;
    private TextView tenn;
    private TextView elevenn;
    private TextView twelvee;
    private TextView thirteenn;
    private TextView fourteenn;
    private TextView fifteenn;

    //amount
    private TextView on;
    private TextView tw;
    private TextView thre;
    private TextView fou;
    private TextView fiv;
    private TextView si;
    private TextView seve;
    private TextView eigh;
    private TextView nin;
    private TextView te;
    private TextView eleve;
    private TextView twelv;
    private TextView thirtee;
    private TextView fourtee;
    private TextView fiftee;

    private LinearLayout oneee;
    private LinearLayout twooo;
    private LinearLayout threeee;
    private LinearLayout fourrr;
    private LinearLayout fiveee;
    private LinearLayout sixxx;
    private LinearLayout sevennn;
    private LinearLayout eighttt;
    private LinearLayout nineeee;
    private LinearLayout tennn;
    private LinearLayout elevennn;
    private LinearLayout twelveee;
    private LinearLayout thirteennn;
    private LinearLayout fourteennn;
    private LinearLayout fifteennn;

    private TextView Day;
    private TextView prev;
    private TextView next;

    private int finalValue;
    private String scoreGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_daily_app_content);

        //time
        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        ten = (TextView) findViewById(R.id.ten);
        eleven = (TextView) findViewById(R.id.eleven);
        twelve = (TextView) findViewById(R.id.twelve);
        thirteen = (TextView) findViewById(R.id.thirteen);
        fourteen = (TextView) findViewById(R.id.fourteen);
        fifteen = (TextView) findViewById(R.id.fifteen);

        //activity
        onee = (TextView) findViewById(R.id.onee);
        twoo = (TextView) findViewById(R.id.twoo);
        threee = (TextView) findViewById(R.id.threee);
        fourr = (TextView) findViewById(R.id.fourr);
        fivee = (TextView) findViewById(R.id.fivee);
        sixx = (TextView) findViewById(R.id.sixx);
        sevenn = (TextView) findViewById(R.id.sevenn);
        eightt = (TextView) findViewById(R.id.eightt);
        ninee = (TextView) findViewById(R.id.ninee);
        tenn = (TextView) findViewById(R.id.tenn);
        elevenn = (TextView) findViewById(R.id.elevenn);
        twelvee = (TextView) findViewById(R.id.twelvee);
        thirteenn = (TextView) findViewById(R.id.thirteenn);
        fourteenn = (TextView) findViewById(R.id.fourteenn);
        fifteenn = (TextView) findViewById(R.id.fifteenn);

        //amount
        on = (TextView) findViewById(R.id.on);
        tw = (TextView) findViewById(R.id.tw);
        thre = (TextView) findViewById(R.id.thre);
        fou = (TextView) findViewById(R.id.fou);
        fiv = (TextView) findViewById(R.id.fiv);
        si = (TextView) findViewById(R.id.si);
        seve = (TextView) findViewById(R.id.seve);
        eigh = (TextView) findViewById(R.id.eigh);
        nin = (TextView) findViewById(R.id.nin);
        te = (TextView) findViewById(R.id.te);
        eleve = (TextView) findViewById(R.id.eleve);
        twelv = (TextView) findViewById(R.id.twelv);
        thirtee = (TextView) findViewById(R.id.thirtee);
        fourtee = (TextView) findViewById(R.id.fourtee);
        fiftee = (TextView) findViewById(R.id.fiftee);

        //layout
        oneee = (LinearLayout) findViewById(R.id.oneeee);
        twooo = (LinearLayout) findViewById(R.id.twooo);
        threeee = (LinearLayout) findViewById(R.id.threeee);
        fourrr = (LinearLayout) findViewById(R.id.fourrr);
        fiveee = (LinearLayout) findViewById(R.id.fiveee);
        sixxx = (LinearLayout) findViewById(R.id.sixxx);
        sevennn = (LinearLayout) findViewById(R.id.sevennn);
        eighttt = (LinearLayout) findViewById(R.id.eighttt);
        nineeee = (LinearLayout) findViewById(R.id.nineee);
        tennn = (LinearLayout) findViewById(R.id.tennn);
        elevennn = (LinearLayout) findViewById(R.id.elevennn);
        twelveee = (LinearLayout) findViewById(R.id.twelveee);
        thirteennn = (LinearLayout) findViewById(R.id.thirteennn);
        fourteennn = (LinearLayout) findViewById(R.id.fourteennn);
        fifteennn = (LinearLayout) findViewById(R.id.fifteennn);

        Day=(TextView)findViewById(R.id.day);
        prev=(TextView) findViewById(R.id.prev);
        next=(TextView) findViewById(R.id.next);

        Sintent = getIntent();
        suffer = Sintent.getStringExtra("suffer");
        plan=Sintent.getStringExtra("plan");

        scoreGet=Day.getText().toString();
        finalValue=Integer.parseInt(scoreGet);

        doStuff();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalValue>=31)
                {
                    return;
                }
                else
                {
                    finalValue++;
                    Day.setText(String.valueOf(finalValue));
                    doStuff();
                }
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (finalValue==1)
                {
                    return;
                }
                else
                {
                    finalValue--;
                    Day.setText(String.valueOf(finalValue));
                    doStuff();

                }
            }
        });
    }
    private void doStuff() {
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25||finalValue==22||finalValue==3 ||finalValue==28) && suffer.equals("schezo") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("1 cup");

                two.setText("11:30 P.M.");
                twoo.setText("Whole Wheat Bread\n" +
                        "Apple Milkshake\n" +
                        "Butter ");
                tw.setText("2 slices\n" +
                        "1 cup\n" +
                        "1 tsp.");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Cranberry Juice");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked White Lentils\n" +
                        "Chapatti (6”)\n" +
                        "Yogurt");
                fou.setText("½ cup\n" +
                        "1\n" +
                        "½ cup\n");

                seven.setText("5:00 P.M. Snack");
                sevenn.setText("Chia seeds and Sale Smoothies");
                seve.setText("1 cup");

                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Water/Iced Tea ");


                ten.setText("8:30 P.M.\n" +
                        "Dinner");
                tenn.setText("Grilled Fish\n" +
                        "Chapatti/Naan (6”)\n" +
                        "Fresh Salad\n");
                te.setText("1 oz.\n" +
                        "1\n" +
                        "½ cup\n");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("DahiBhalay\n" +
                        "Water (15 minutes before sleeping)");
                twelv.setText("¼ cup\n" +
                        "1 cup");

                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
                fifteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {


                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Walking)" );
                eigh.setText("1 Hour");


                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                oneee.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {

                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep" );
                on.setText("9 hours");

                five.setText("2:00 – 3:00 P.M ");
                fivee.setText("Activity Hour\n" +
                        "(Chess)\n");
                fiv.setText("1 Hour");

                six.setText("3:30 – 4:30 P.M");
                sixx.setText("Nap");
                si.setText("1 Hour");

                nine.setText("7:00 – 8:00 P.M");
                ninee.setText("Interaction Hour\n" +
                        "(Attend social meetings)");
                nin.setText("1½  Hour");

                eleven.setText("9:30-10:00 P.M.");
                elevenn.setText("Screen/Reading Time");
                eleve.setText("1 Hour");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);

            }
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==2 ||finalValue==11||finalValue==4||finalValue==13||finalValue==21||finalValue==27||finalValue==9||finalValue==18) &&suffer.equals("schezo"))
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("9 hourse");

                two.setText("9:00 A.M. \n" +
                        "Breakfast");
                twoo.setText("Cooked Chanay\n" +
                        "Naan\n" +
                        "Lassi");
                tw.setText("½ cup\n" +
                        "1 \n" +
                        "1 cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Mint Margarita");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Brown Rice\n" +
                        "Cooked Red Beans Curry\n" +
                        "Yogurt");
                fou.setText("1 cup\n" +
                        "½ cup\n" +
                        "½ cup");

                seven.setText("5:00 P.M. Snack");
                sevenn.setText("Chicken Apple Salad");
                seve.setText("1 cup");

                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Water/Iced Tea ");
                eigh.setText("1 Hour\n" +
                        "2 cups");

                ten.setText("8:30 P.M.\n" +
                        "Dinner");
                tenn.setText("Grilled Fish Sandwich\n" +
                        "With Bran Bread\n" +
                        "Mayo");
                te.setText("1 \n" +
                        "2 slices\n" +
                        "1 tsp.");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Warm Halwa");
                twelv.setText("¼ cup");

                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
                fifteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Exercise Hour");
                eigh.setText("1 hour");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                oneee.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");

                five.setText("2:00 – 3:00 P.M ");
                fivee.setText("Activity Hour\n" +
                        "(Scrabble)");
                fiv.setText("1 Hour");

                six.setText("3:30 – 4:30 P.M");
                sixx.setText("Nap");

                nine.setText("7:00 – 8:00 P.M");
                ninee.setText("Interaction Hour\n" +
                        "(Attend social meetings)");
                nin.setText("1 hour");

                eleven.setText("9:30-10:00 P.M.");
                elevenn.setText("Screen/Reading Time");
                eleve.setText("1 Hour");


                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        /*if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("schezo") )
        {

        }*/
        /*if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15 ||finalValue==29) &&suffer.equals("schezo"))
        {

        }*/
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==23||finalValue==26||finalValue==31||finalValue==15||finalValue==8||finalValue==29) &&suffer.equals("schezo"))
        {
            if (plan.equals("diet"))
            {
                if (plan.equals("diet"))
                    one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("9 hours");

                two.setText("9:00 A.M. \n" +
                        "Breakfast");
                twoo.setText("Whole Wheat Cereal\n" +
                        "Cold milk\n" +
                        "Pear");
                tw.setText("½ cup\n" +
                        "1 cup\n" +
                        "1");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Vegetable Corn Salad");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Chicken Naan\n" +
                        "Yogurt");
                fou.setText("2\n" +
                        "½ cup");

                seven.setText("5:00 P.M. Snack");
                sevenn.setText("Fruit Chaat");
                seve.setText("1 cup");

                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Water/Iced Tea ");
                eigh.setText("1 cup");

                ten.setText("8:30 P.M.\n" +
                        "Dinner");
                tenn.setText("Cooked Lady Finger Handi\n" +
                        "Chapatti");
                te.setText("½  cup\n" +
                        "1");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Popcorns\n" +
                        "Water (15 minutes before sleeping)");
                twelv.setText("6\n" +
                        "1 cup each");

                fiveee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Swimming)\n" +
                        "Water/Iced Tea ");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);

            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("1 hour");

                five.setText("2:00 – 3:00 P.M ");
                fivee.setText("Activity Hour\n" +
                        "(Rubik’s Cube)");
                fiv.setText("1 hour");

                six.setText("3:30 – 4:30 P.M");
                sixx.setText("Nap");
                si.setText("1 hour");

                nine.setText("7:00 – 8:00 P.M");
                ninee.setText("Interaction Hour\n" +
                        "(Attend social meetings)");
                nin.setText("1 hour");

                eleven.setText("9:30-10:00 P.M.");
                elevenn.setText("Screen/Reading Time");
                eleve.setText("1 hour");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);

            }


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("schezo"))
        {

        }*/
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24||finalValue==20||finalValue==30) &&suffer.equals("schezo"))
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)\n");
                on.setText("9 hours");

                two.setText("9:00 A.M. \n" +
                        "Breakfast");
                twoo.setText("Paratha\n" +
                        "Minced Meat with Liver\n" +
                        "Sprite");
                tw.setText("1 \n" +
                        "½ cup\n" +
                        "½ cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Chicken Corn Soup");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Fish Gravy \n" +
                        "Chapatti");
                fou.setText("½ cup\n" +
                        "2");

                seven.setText("5:00 P.M. Snack");
                sevenn.setText("Fresh Grapes Juice");
                seve.setText("1 cup");

                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Water/Iced Tea ");

                ten.setText("8:30 P.M.\n" +
                        "Dinner");
                tenn.setText("Vegetable Palao\n" +
                        "Yogurt\n" +
                        "Chapatti");
                te.setText("½ cup\n" +
                        "½ cup\n" +
                        "1\n");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Walnuts + Cashew Nuts + Almonds\n" +
                        "Water (15 minutes before sleeping)");
                twelv.setText("3 each\n" +
                        "1 cup");

                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                eight.setText("6:00 – 7:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Gym)");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("2:00 – 3:00 P.M ");
                fivee.setText("Activity Hour\n" +
                        "(Chess)\n");
                fiv.setText("1 hour");

                six.setText("3:30 – 4:30 P.M");
                sixx.setText("Nap");
                si.setText("1 hour");

                nine.setText("7:00 – 8:00 P.M");
                ninee.setText("Interaction Hour\n" +
                        "(Attend social meetings)");
                nin.setText("1 hour");

                eleven.setText("9:30-10:00 P.M.");
                elevenn.setText("Screen/Reading Time");
                eleve.setText("30 minutes");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);

            }



            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }


        //------------------------------PANIC------------------------------//



        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25||finalValue==28||finalValue==3||finalValue==14) &&suffer.equals("panic") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Paratha \n" +
                        "Omelet\n" +
                        "Jam");
                tw.setText("1\n" +
                        "1 egg\n" +
                        "1 tsp");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Cranberry Juice");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Chicken Whole Wheat\n" +
                        "Sandwich\n" +
                        "Mayo");
                fou.setText("2 oz.\n" +
                        "2 slices\n" +
                        "¼ tsp");

                six.setText("4:00 P.M Snack");
                sixx.setText("Frozen Yougurt");
                si.setText("1 Cup");


                ten.setText("8:30 P.M.\n" +
                        "Dinner");
                tenn.setText("Vegetable Rice\n" +
                        "Mint Dip\n" +
                        "Pickle");
                te.setText("1 1/3 cup \n" +
                        "1 tsp.\n" +
                        "½ tsp");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Warm Milk");
                twelv.setText("1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {


                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Sports Hour\n" +
                        "(Gym)");
                fiv.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);

            }
            if (plan.equals("lifestle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 Hours");

                seven.setText("5:00 – 6:00 P.M.");
                sevenn.setText("Activity Hour\n" +
                        "(Learn something new of choice)");
                seve.setText("1 hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Self-Time\n" +
                        "(Spend some time alone)");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading/Writing Time\n" +
                        "(Read a favorite book or keep a journal)");
                thirtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }


            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27||finalValue==9||finalValue==19||finalValue==5||finalValue==31) &&suffer.equals("panic") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Tea (Dodh Pati)\n" +
                        "Rusk");
                tw.setText("1 cup\n" +
                        "3");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Fish & Lettuce Salad\n" +
                        "Olive Oil");
                thre.setText("1 cup\n" +
                        "1 tsp.");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Mix Vegetables\n" +
                        "Chapatti \n" +
                        "Plain Yogurt");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 P.M Snack");
                sixx.setText("Banana Milkshake");
                si.setText("2 cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Cooked Mix Lentils\n" +
                        "Chapatti\n" +
                        "Yogurt");
                te.setText("½ cup\n" +
                        "1\n" +
                        "½ cup");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Chia seeds & Pistachio Mix");
                twelv.setText("1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Sports Hour\n" +
                        "(Yoga)");
                fiv.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                seven.setText("5:00 – 6:00 P.M.");
                sevenn.setText("Activity Hour\n" +
                        "(Learn something new of choice)");
                seve.setText("1 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Screen Time\n" +
                        "(Watch a comedy series/movie)");
                eigh.setText("1 hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Self-Time\n" +
                        "(Spend some time alone)");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading/Writing Time\n" +
                        "(Read a favorite book or keep a journal)");
                thirtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        /*if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("panic") )
        {

        }*/
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15 ||finalValue==29||finalValue==19 ||finalValue==7||finalValue==24) &&suffer.equals("panic") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Minced Meat\n" +
                        "Paratha\n" +
                        "Lassi ");
                tw.setText("½ cup\n" +
                        "1\n" +
                        "1 cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Ice cream");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Kichri\n" +
                        "Yogurt");
                fou.setText("1 cup\n" +
                        "¼ cup");

                six.setText("4:00 P.M Snack");
                sixx.setText("Applesauce");
                si.setText("1 Cup");

                seven.setText("4:00 P.M. Snack");
                sevenn.setText("Lemonade\n" +
                        "Roasted Almonds");
                seve.setText("1 hour");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Chicken Karahi\n" +
                        "Chapatti");
                te.setText("½ cup\n" +
                        "1");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Mint water");
                twelv.setText("1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Sports Hour\n" +
                        "(Bicycling)");
                fiv.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("1 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Activity Hour\n" +
                        "(Learn something new of choice)\n");
                eigh.setText("1 Hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1  Hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Self-Time\n" +
                        "(Spend some time alone)");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading/Writing Time\n" +
                        "(Read a favorite book or keep a journal)");
                thirtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26 ||finalValue==31) &&suffer.equals("panic") )
        {

        }*/

        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23 ||finalValue==30||finalValue==26||finalValue==12||finalValue==16) &&suffer.equals("panic") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("French Toast\n" +
                        "Milk\n" +
                        "Honey");
                tw.setText("2\n" +
                        "1 cup\n" +
                        "1 tsp.");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Orange Juice");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Spinach & Chicken \n" +
                        "Chapatti");
                fou.setText("½ cup\n" +
                        "2");

                six.setText("4:00 P.M Snack");
                sixx.setText("Fresh Cream Salad");
                si.setText("1 Cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Cooked Black beans \n" +
                        "Boiled Rice");
                te.setText("½ cup\n" +
                        "1");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Flavored Milk ");
                twelv.setText("1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }

            if (plan.equals("excercise"))
            {
                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Sports Hour\n" +
                        "(Cricket/Football)");
                fiv.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);

            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Screen Time\n" +
                        "(Watch a comedy series/movie)\n");
                eigh.setText("1 Hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Self-Time\n" +
                        "(Spend some time alone)");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading/Writing Time\n" +
                        "(Read a favorite book or keep a journal)");
                thirtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }

            sevennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("panic") )
        {

        }*/

        //-----------------------------------------OCD-----------------------------------------//

        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25||finalValue==23||finalValue==16) &&suffer.equals("ocd") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("9 Hours\n" +
                        "1 cup");

                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Whole Wheat Cereal\n" +
                        "Cold milk\n" +
                        "Banana");
                tw.setText("½ cup\n" +
                        "1 cup\n" +
                        "3");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Cheese Sandwich\n" +
                        "Fresh Orange Juice");
                thre.setText("1\n" +
                        "1 cup");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Cooked Yellow Lentils\n" +
                        "Chapatti (6”)\n" +
                        "Yogurt");
                fou.setText("1 cup\n" +
                        "½ cup\n" +
                        "1\n" +
                        "½ cup\n");

                seven.setText("4:00 P.M. Snack");
                sevenn.setText("Cucumber & Corn Salad");
                seve.setText("1 cup");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Water/Iced Tea ");
                eigh.setText("1 cup");


                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Water (15 minutes before dinner)\n" +
                        "Grilled Fish\n" +
                        "Chapatti/Naan (6”)");
                eleve.setText("1 cup\n" +
                        "1 oz.\n" +
                        "1");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Walnuts\n" +
                        "Water (15 minutes before sleeping)");
                twelv.setText("6\n" +
                        "1 cup");

                fiveee.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Yoga)\n" +
                        "Water/Iced Tea ");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 Hour");

                six.setText("2:30 – 3:30 P.M");
                sixx.setText("Activity Hour\n" +
                        "(Doing Artistic things)\n" +
                        "Water");
                si.setText("1 hour");

                nine.setText("6:00 – 6:30 P.M");
                ninee.setText("Closing eyes and resting ");
                nin.setText("30 mins");

                ten.setText("6:30 – 8:00 P.M");
                tenn.setText("Screen time\n" +
                        "(Watch favorite movie/documentary)");
                te.setText("1/2 hours");

                twelve.setText("10:00 P.M.");
                twelvee.setText("Reading (book/novel/magazine)\n" +
                        "Walnuts" );
                twelv.setText("1 hour");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27||finalValue==4||finalValue==24) &&suffer.equals("ocd") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Corn Cereal\n" +
                        "Cold milk\n" +
                        "Peach");
                tw.setText("½ cup\n" +
                        "1 cup\n" +
                        "3");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Dark chocolate squares");
                thre.setText("3");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Mix Vegetables Handi\n" +
                        "Chapatti (6”)\n" +
                        "Fresh Salad\n");
                fou.setText("1 cup\n" +
                        "½ cup\n" +
                        "1\n" +
                        "½ cup");

                seven.setText("4:00 P.M. Snack");
                sevenn.setText("Flaxseed and Yogurt Smoothie");
                seve.setText("1 cup");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Jogging)\n" +
                        "Water/Iced Tea");
                eigh.setText("1 cup");

                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Water (15 minutes before dinner)\n" +
                        "Chicken Rice\n" +
                        "Mint Dip");
                eleve.setText("1 cup\n" +
                        "1 ½ cup\n" +
                        "1 tsp.");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Water (15 minutes before sleeping)");
                twelv.setText("3\n" +
                        "1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
            }

            if (plan.equals("excercise"))
            {

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Jogging)\n" +
                        "Water/Iced Tea");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);

            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 Hour");

                six.setText("2:30 – 3:30 P.M");
                sixx.setText("Activity Hour\n" +
                        "(Intellectual Games)\n" +
                        "Water");

                si.setText("1 hour");

                nine.setText("6:00 – 6:30 P.M");
                ninee.setText("Closing eyes and resting ");
                nin.setText("30 mins");

                ten.setText("6:30 – 8:00 P.M");
                tenn.setText("Screen time\n" +
                        "(Watch favorite movie/documentary)");
                te.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28||finalValue==22||finalValue==15||finalValue==7||finalValue==12) &&suffer.equals("ocd") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("1 cup");

                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Fresh Mango Juice\n" +
                        "Toasted Bread\n" +
                        "Butter");
                tw.setText("1 cup\n" +
                        "2\n" +
                        "1 tsp.");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Grilled Chicken");
                thre.setText("1 oz.");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Minced Meat Naan\n" +
                        "Mint Raita");
                fou.setText("1 cup\n" +
                        "2\n" +
                        "¼ cup");

                seven.setText("4:00 P.M. Snack");
                sevenn.setText("Strawberry Milkshake");
                seve.setText("1 cup");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Walking)\n" +
                        "Water/Iced Tea ");

                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Water (15 minutes before dinner)\n" +
                        "Cooked Pumpkin \n" +
                        "Chapatti");
                eleve.setText("1 cup\n" +
                        "½ cup\n" +
                        "1");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Warm Milk\n" +
                        "Water (15 minutes before sleeping)");
                twelv.setText("6\n" +
                        "1 cup");

                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Walking)\n" +
                        "Water/Iced Tea ");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 Hour");

                six.setText("2:30 – 3:30 P.M");
                sixx.setText("Activity Hour\n" +
                        "(Do activities you are skilled at)\n" +
                        "Water");
                si.setText("1 hour");

                nine.setText("6:00 – 6:30 P.M");
                ninee.setText("Closing eyes and resting ");
                nin.setText("30 mins");

                ten.setText("6:30 – 8:00 P.M");
                tenn.setText("Screen time\n" +
                        "(Watch favorite movie/documentary)");
                te.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==4||finalValue==21||finalValue==22||finalValue==15 || finalValue==29) &&suffer.equals("ocd") )
        {

        }*/
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26 || finalValue==31 ||finalValue==29||finalValue==23||finalValue==8||finalValue==20) &&suffer.equals("ocd") )
        {
            if (plan.equals("diet")) {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("cup");


                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Boiled Egg (sliced)\n" +
                        "Toast\n" +
                        "Garlic Mayo");
                tw.setText("1 \n" +
                        "2\n" +
                        "1 tsp");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Berries Smoothie");
                thre.setText("1 cup");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Spinach & Meat Handi\n" +
                        "Chapatti (6”)");
                fou.setText("1 cup\n" +
                        "½ cup\n" +
                        "1");

                six.setText("2:30 – 3:30 P.M");
                sixx.setText("Activity Hour\n" +
                        "(Learn new stuff)\n" +
                        "Water");
                si.setText("1 Hour\n"+
                        "1 cup");

                seven.setText("4:00 P.M. Snack");
                sevenn.setText("Banana Bread Slice");
                seve.setText("1");

                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Water (15 minutes before dinner)\n" +
                        "Fish Cut" +
                        "lets \n" +
                        "Chapatti (6”)");
                eleve.setText("1 cup\n" +
                        "2 cup\n" +
                        "1");

                twelve.setText("10:00 P.M.\n" +
                        "Snack");
                twelvee.setText("Nuts Mix\n" +
                        "Water (15 minutes before sleeping)");
                twelv.setText("¼ cup\n" +
                        "1 cup");

                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
            }


            if (plan.equals("excercise"))
            {

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Exercise Hour\n" +
                        "(Cycling)\n" +
                        "Water/Iced Tea");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 Hour");

                six.setText("2:30 – 3:30 P.M");
                sixx.setText("Activity Hour\n" +
                        "(Learn new stuff)\n" +
                        "Water");
                si.setText("1 hour");


                nine.setText("6:00 – 6:30 P.M");
                ninee.setText("Closing eyes and resting ");
                nin.setText("90 mins");

                ten.setText("6:30 – 8:00 P.M");
                tenn.setText("Screen time\n" +
                        "(Watch favorite movie/documentary)");
                te.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }



            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23 || finalValue==30) &&suffer.equals("ocd") )
        {

        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("ocd") )
        {

        }*/

        //---------------------------------depression----------------------------------//


        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25|| finalValue==23||finalValue==30||finalValue==7||finalValue==12) &&suffer.equals("depression") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("1 cup");


                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Cornflakes\n" +
                        "With Milk\n" +
                        "Berries (any)");
                tw.setText("½ cup\n" +
                        "1 cup\n" +
                        "½ cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Orange Juice");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Mix Vegetables\n" +
                        "Chapatti \n" +
                        "Plain Yogurt");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");



                six.setText("4:00 – 5:00 P.M");
                sixx.setText("Exercise Hour\n" +
                        "(Yoga)\n" +
                        "Mint Water/Lemonade");
                si.setText("1 Hour\n"+
                        "2 cups");

                seven.setText("4:00 P.M. Snack");
                sevenn.setText("Cucumber & Corn Salad");
                seve.setText("1 cup");

                eight.setText("5:00 P.M.");
                eightt.setText("Apple Pie");
                eigh.setText("1 Cup");


                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Baked Chicken\n" +
                        "Chapatti \n" +
                        "Rooh Afza in Water");
                eleve.setText("3 oz.\n" +
                        "1\n" +
                        "1 cup");

                thirteen.setText("10:30 P.M.\n" +
                        "Snack");
                thirteenn.setText("Ice-cream \n" +
                        "(any flavor)");
                thirtee.setText("1 \n" +
                        "6");

                fiveee .setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                nine.setText("5:00 – 6:00 P.M");
                ninee.setText("Activity Hour\n" +
                        "(anything of interest");
                nin.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee .setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setShowDividers(View.GONE);

            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 Hour");

                ten.setText("6:00 – 7:00 P.M");
                tenn.setText("Interaction Hour\n" +
                        "(Interact with family members or friends)");
                te.setText("1 hour");

                twelve.setText("9:00 - 10:00 P.M.");
                twelvee.setText("Screen Time");
                twelv.setText("1 hour");

                fourteen.setText("10:30 – 11:00 P.M");
                fourteenn.setText("Reading Time");
                fourtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }

            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27||finalValue==6||finalValue==8||finalValue==20) &&suffer.equals("depression") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("9 hourd");

                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Cheese Omelet (Egg+Cheese)\n" +
                        "Toasted Bread\n" +
                        "Milo in Milk");
                tw.setText("1 + 1oz.\n" +
                        "2 slices\n" +
                        "1 cup");


                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Chicken Pineapple Salad");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Meat Curry\n" +
                        "Chapatti\n" +
                        "Fresh Vegetable Salad");

                six.setText("4:00 – 5:00 P.M");
                sixx.setText("(Tai Chi)\n" +
                        "Mint Water/Lemonade");
                si.setText("1 Hour\n"+
                        "2 cups");

                seven.setText("5:00 P.M. Snack");
                sevenn.setText("Whole Wheat Biscuits");
                seve.setText("1 cup");

                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Fish Curry\n" +
                        "Boiled Rice\n" +
                        "Mashed Potatoes");
                eleve.setText("3 oz.\n" +
                        "1 ½ cup\n" +
                        "½ cup");

                thirteen.setText("10:30 P.M.\n" +
                        "Snack");
                thirteenn.setText("Walnuts & Pistachio Mix)");
                thirtee.setText("½ cup");

                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);

            }
            if (plan.equals("excercise"))
            {
                six.setText("4:00 – 5:00 P.M");
                sixx.setText("Exercise Hour");
                si.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 Hour");

                eight.setText("5:00 - 6:00 P.M.");
                eightt.setText("Activity Hour\n" +
                        "(anything of interest)");
                eigh.setText("1 Hour");


                ten.setText("6:00 – 7:00 P.M");
                tenn.setText("Interaction Hour\n" +
                        "(Interact with family members or friends)");
                te.setText("1 hour");

                twelve.setText("9:00 - 10:00 P.M.");
                twelvee.setText("Screen Time");
                twelv.setText("1 hour");

                fourteen.setText("10:30 – 11:00 P.M");
                fourteenn.setText("Reading Time");
                fourtee.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            nineeee.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28||finalValue== 5||finalValue== 26||finalValue ==31||finalValue==12||finalValue==24||finalValue==16) &&suffer.equals("depression") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("1 cup");

                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("French Toasts\n" +
                        "Milk");
                tw.setText("2\n" +
                        "1 cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Kiwi Smoothie");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Chicken Ginger Handi\n" +
                        "Chapatti (6”)\n" +
                        "Kale Salad ");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 – 5:00 P.M");
                sixx.setText("Exercise Hour\n" +
                        "(Gym)\n" +
                        "Mint Water/Lemonade");
                si.setText("1 Hour\n"+
                        "2 cups");

                eight.setText("5:00 P.M.");
                eightt.setText("Flavored Yogurt");
                eigh.setText("1 Cup");

                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Cooked Lentils\n" +
                        "Chapatti (6”)\n" +
                        "Mint Dip");
                eleve.setText("3 oz.\n" +
                        "1\n" +
                        "1 tsp.");

                thirteen.setText("10:30 P.M.\n" +
                        "Snack");
                thirteenn.setText("Apricots \n" +
                        "(Chopped)");
                thirtee.setText("1 cup");

                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                nine.setText("5:00 – 6:00 P.M");
                ninee.setText("Activity Hour\n" +
                        "(anything of interest");
                nin.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 hour");

                nine.setText("5:00 – 6:00 P.M");
                ninee.setText("Activity Hour\n" +
                        "(anything of interest");
                nin.setText("1 hour");


                ten.setText("6:00 – 7:00 P.M");
                tenn.setText("Interaction Hour\n" +
                        "(Interact with family members or friends)");
                te.setText("1 hour");

                twelve.setText("9:00 - 10:00 P.M.");
                twelvee.setText("Screen Time");
                twelv.setText("1 hour");

                fourteen.setText("10:30 – 11:00 P.M");
                fourteenn.setText("Reading Time");
                fourtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29|| finalValue==14||finalValue== 19 ) &&suffer.equals("depression") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Water (right after waking up)");
                on.setText("1 cup");

                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Fried Egg\n" +
                        "Paratha (6”)\n" +
                        "Lassi");
                tw.setText("1\n" +
                        "1 \n" +
                        "1 cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Raw Brocolli & Cucumber Salad");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Chickpeas\n" +
                        "Chapatti (6”)\n" +
                        "Mint Raita");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 – 5:00 P.M");
                sixx.setText("Mint Water/Lemonade");
                si.setText("1 Hour\n"+
                        "2 cups");

                eight.setText("5:00 P.M.");
                eightt.setText("Chia Seeds Drink");
                eigh.setText("1 Cup");


                eleven.setText("8:00 P.M.\n" +
                        "Dinner");
                elevenn.setText("Vegetable Rice\n" +
                        "Chicken Curry");
                eleve.setText("1 cup\n" +
                        "½ cup");

                thirteen.setText("10:30 P.M.\n" +
                        "Snack");
                thirteenn.setText("Warm Milk");
                thirtee.setText("1 cup");

                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                six.setText("4:00 – 5:00 P.M");
                sixx.setText("Exercise Hour\n" +
                        "(Yoga)");
                si.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Nap");
                fiv.setText("1 hour");

                nine.setText("5:00 – 6:00 P.M");
                ninee.setText("Activity Hour\n" +
                        "(anything of interest");
                nin.setText("1 hour");

                ten.setText("6:00 – 7:00 P.M");
                tenn.setText("Interaction Hour\n" +
                        "(Interact with family members or friends)");
                te.setText("1 hour");

                twelve.setText("9:00 - 10:00 P.M.");
                twelvee.setText("Screen Time");
                twelv.setText("1 hour");

                fourteen.setText("10:30 – 11:00 P.M");
                fourteenn.setText("Reading Time");
                fourtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("depression") )
        {

        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("depression") )
        {

        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("depression") )
        {

        }*/

        //**************************************Bipolar********************************//

        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25||finalValue==12||finalValue==24) &&suffer.equals("bipolar") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Cornflakes\n" +
                        "With Milk\n" +
                        "Berries (any)");
                twoo.setText("Cornflakes\n" +
                        "With Milk\n" +
                        "Berries (any)");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Orange Juice");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Mix Vegetables\n" +
                        "Chapatti \n" +
                        "Plain Yogurt");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Mint Water/Lemonade");
                si.setText("1 Hour\n" +
                        "2 cups");

                seven.setText("5:00 P.M.");
                sevenn.setText("Apple Pie");
                seve.setText("1 cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Baked Chicken\n" +
                        "Chapatti \n" +
                        "Rooh Afza in Water");
                te.setText("3 oz.\n" +
                        "1\n" +
                        "1 cup");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Ice-cream \n" +
                        "(any flavor)");
                twelv.setText("1 \n" +
                        "6");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Exercise Hour\n" +
                        "(Yoga)");
                si.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 ours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Activity Hour\n" +
                        "(anything of interest)");
                eigh.setText(" hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Screen Time");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading Time");
                thirtee.setText("30 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27||finalValue==20||finalValue==30||finalValue==7||finalValue==16) &&suffer.equals("bipolar") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Cornflakes\n" +
                        "With Milk\n" +
                        "Berries (any)");
                tw.setText("½ cup\n" +
                        "1 cup\n" +
                        "½ cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Orange Juice");
                thre.setText("1 cup");

                four.setText("2:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Mix Vegetables\n" +
                        "Chapatti \n" +
                        "Plain Yogurt");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 - 5:00 P.M.");
                sixx.setText(
                        "Mint Water/Lemonade\n");
                si.setText("1 Hour\n" +
                        "2 cups");

                seven.setText("5:00 P.M.");
                sevenn.setText("Apple Pie");
                seve.setText("1 cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Fish Curry\n" +
                        "Boiled Rice\n" +
                        "Mashed Potatoes");
                te.setText("3 oz.\n" +
                        "1 ½ cup\n" +
                        "½ cup");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Walnuts & Pistachio Mix");
                twelv.setText("½ cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Exercise Hour\n" +
                        "(Yoga)");
                six.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle")) {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Activity Hour\n" +
                        "(anything of interest)");
                eigh.setText("1 hours");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Screen Time");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading Time");
                thirtee.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==8||finalValue==18||finalValue==28||finalValue==6||finalValue==23||finalValue==31) &&suffer.equals("bipolar") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("French Toasts\n" +
                        "Milk");
                tw.setText("2\n" +
                        "1 cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Kiwi Smoothie");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Chicken Ginger Handi\n" +
                        "Chapatti (6”)\n" +
                        "Kale Salad ");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Mint Water/Lemonade");
                si.setText("1 Hour\n" +
                        "2 cups");

                seven.setText("5:00 P.M.");
                sevenn.setText("Flavored Yogurt");
                seve.setText("1 cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Cooked Lentils\n" +
                        "Chapatti (6”)\n" +
                        "Mint Dip");
                te.setText("3 oz.\n" +
                        "1\n" +
                        "1 tsp.\n");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Apricots \n" +
                        "(Chopped)");
                twelv.setText("1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Exercise Hour\n" +
                        "(Gym)");
                si.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle")) {

                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Activity Hour\n" +
                        "(anything of interest)");
                eigh.setText("1 hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Screen Time");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading Time");
                thirtee.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);

            }
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29||finalValue==14||finalValue==19||finalValue==226) &&suffer.equals("bipolar") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Fried Egg\n" +
                        "Paratha (6”)\n" +
                        "Lassi");
                tw.setText("1\n" +
                        "1 \n" +
                        "1 cup");

                three.setText("12:00 A.M. \n" +
                        "Snack");
                threee.setText("Raw Brocolli & Cucumber Salad");
                thre.setText("1 cup");

                four.setText("2:30 P.M. \n" +
                        "Lunch");
                fourr.setText("Cooked Chickpeas\n" +
                        "Chapatti (6”)\n" +
                        "Mint Raita");
                fou.setText("½ cup\n" +
                        "2\n" +
                        "¼ cup");

                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Mint Water/Lemonade\n");
                si.setText("1 Hour\n" +
                        "2 cups");

                seven.setText("5:00 P.M.");
                sevenn.setText("Chia Seeds Drink");
                seve.setText("1 cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Vegetable Rice\n" +
                        "Chicken Curry");
                te.setText("1 cup\n" +
                        "½ cup");

                twelve.setText("10:30 P.M.\n" +
                        "Snack");
                twelvee.setText("Warm Milk");
                twelv.setText("1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
                fourteennn.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                six.setText("4:00 - 5:00 P.M.");
                sixx.setText("Exercise Hour\n" +
                        "(Yoga)");
                si.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
                thirteennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle")) {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                five.setText("3:00 – 4:00 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Activity Hour\n" +
                        "(anything of interest)");
                eigh.setText("1 hour");

                nine.setText("6:00 – 7:00 P.M");
                ninee.setText("Family Time\n" +
                        "(Interact with family & friends)");
                nin.setText("1 hour");

                eleven.setText("9:00-10:00 P.M.");
                elevenn.setText("Screen Time");
                eleve.setText("1 hour");

                thirteen.setText("10:30 – 11:00 P.M.");
                thirteenn.setText("Reading Time");
                thirtee.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                twelveee.setVisibility(View.GONE);
            }

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("bipolar") )
        {

        }
        if ((finalValue==6||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("bipolar") )
        {

        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("bipolar") )
        {

        }*/
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25||finalValue==22||finalValue==20) &&suffer.equals("adhd") )
        {
            if(plan.equals("diet"))
            {

                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Corn flakes\n" +
                        "Milk\n" +
                        "Strawberries/Cherries");
                tw.setText("½ cup\n" +
                        "1 cup\n" +
                        "3");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Chicken Sandwich\n" +
                        "Water");
                thre.setText("1\n" +
                        "1 cup");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Cooked spinach\n" +
                        "Chapatti (6”)\n" +
                        "Fresh salad");
                fou.setText("1 cup\n" +
                        "½ cup\n" +
                        "1\n" +
                        "½ cup");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Water");
                si.setText("1 Hour\n" +
                        "1 cup");

                seven.setText("4:00 P.M.");
                sevenn.setText("Apple Milkshake");
                seve.setText("1 cup");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText(
                        "Water/Iced Tea ");
                eigh.setText("1 Hour\n" +
                        "2 cups");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Water (15 minutes before dinner)\n" +
                        "Grilled Fish\n" +
                        "Chapatti/Naan (6”)");
                te.setText("1 cup\n" +
                        "1 oz.\n" +
                        "1");

                eleven.setText("10:00 P.M.");
                elevenn.setText("Melon\n" +
                        "Walnuts\n" +
                        "Water (15 minutes before sleeping)");
                eleve.setText("1 Hour");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);


            }
            if (plan.equals("excercise"))
            {
                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Sports Hour\n" +
                        "(Badminton/Skating)");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);


            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Activity Hour\n" +
                        "(Sketching/Crafting)\n" +
                        "Water");
                si.setText("1 hour");

                nine.setText("6:30 – 8:00 P.M");
                ninee.setText("Screen time\n" +
                        "(Play video games/Watch cartoons/Use tablet)");
                nin.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }


            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27||finalValue==5||finalValue==30||finalValue==16||finalValue==24) &&suffer.equals("adhd") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Boiled Egg\n" +
                        "Toast\n" +
                        "Orange juice");
                tw.setText("1\n" +
                        "2\n" +
                        "1 cup");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Nuggets \n" +
                        "Milo");
                thre.setText("6\n" +
                        "1 pack");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Boiled Rice\n" +
                        "Cooked Pulses\n" +
                        "Raw sliced vegatbles");
                fou.setText("1 cup\n" +
                        "1 cup\n" +
                        "½ cup\n" +
                        "¼ cup");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Water");
                si.setText("1 Hour\n" +
                        "1 cup");

                seven.setText("4:00 P.M.");
                sevenn.setText("Red Beans Soup\n" +
                        "Crackers");
                seve.setText("1 cup\n"+"1-2");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Water (15 minutes before dinner)\n" +
                        "Beef steak \n" +
                        "Mashed potatoes\n" +
                        "Garlic bread");
                te.setText("1 cup\n" +
                        "1 oz.\n" +
                        "¼ cup\n" +
                        "1 slice");

                eleven.setText("10:00 P.M.");
                elevenn.setText("Dark chocolate\n" +
                        "Warm Milk\n" +
                        "Water (15 minutes before sleeping)");
                eleve.setText("1 bar\n" +
                        "1 cup\n" +
                        "1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Sports Hour\n" +
                        "(Swimming/Cycling)");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle")) {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Activity Hour\n" +
                        "(Stamping/Gardening)");
                si.setText("1 hour");

                nine.setText("6:30 – 8:00 P.M");
                ninee.setText("Screen time\n" +
                        "(Play video games/Watch cartoons/Use tablet)");
                nin.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);

            }
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==8||finalValue==18||finalValue==28||finalValue==14||finalValue==23||finalValue==7) &&suffer.equals("adhd") )
        {
            if (plan.equals("diet"))
            {
                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("French Toast\n" +
                        "Banana\n" +
                        "Chocolate Milk");
                tw.setText("2\n" +
                        "1\n" +
                        "1 cup");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Egg Paratha\n" +
                        "Juice");
                thre.setText("1\n" +
                        "1 cup");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Cooked Mix Vegetables (carrots/potato/peas)\n" +
                        "Chapatti (6”)\n" +
                        "Mint Yogurt");
                fou.setText("\n" +
                        "1 cup\n" +
                        "½ cup\n" +
                        "1\n" +
                        "¼ cup");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Activity Hour\n" +
                        "(Pop Up Art)\n" +
                        "Water");
                si.setText("1 Hour\n" +
                        "1 cup");

                seven.setText("4:00 P.M.");
                sevenn.setText("Spinach and Kale smoothie \n" +
                        "with berries");
                seve.setText("2\n" +
                        "1 cup");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Water (15 minutes before dinner)\n" +
                        "Whole wheat Chicken Pasta");
                te.setText("1 cup\n" +
                        "1 cup");

                eleven.setText("10:00 P.M.");
                elevenn.setText("Popcorn\n" +
                        "Water (15 minutes before sleeping)");
                eleve.setText("½ cup\n" +
                        "1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Sports Hour\n" +
                        "(Karate/Self Defense)\n" +
                        "Water/Lemonade ");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Activity Hour\n" +
                        "(Pop Up Art)\n" +
                        "Water");
                si.setText("1 hour");

                nine.setText("6:30 – 8:00 P.M");
                ninee.setText("Screen time\n" +
                        "(Play video games/Watch cartoons/Use tablet)");
                nin.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);

            }

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("adhd") )
        {
            if (plan.equals("diet"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");


                two.setText("8:30 A.M. \n" +
                        "Breakfast");
                twoo.setText("Porridge\n" +
                        "Cooked in milk");
                tw.setText("½ cup\n" +
                        "1 cup");

                three.setText("11:00 A.M. \n" +
                        "Snack");
                threee.setText("Banana\n" +
                        "Apple\n" +
                        "Water");
                thre.setText("1\n" +
                        "1\n" +
                        "1 cup");

                four.setText("1:00 P.M. \n" +
                        "Lunch");
                fourr.setText("Water (15 minutes before lunch)\n" +
                        "Chicken Biryani \n" +
                        "Fresh Salad");
                fou.setText("1 cup\n" +
                        "1 cup\n" +
                        "¼ cup");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 Hour");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Activity Hour\n" +
                        "(Painting/Origami Arts)\n" +
                        "Water");
                si.setText("1 Hour\n" +
                        "1 cup");

                seven.setText("4:00 P.M.");
                sevenn.setText("Flavored Yogurt \n" +
                        "(Strawberry/Raspberry)");
                seve.setText("1 cup");

                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Sports Hour\n" +
                        "(Football/Running)\n" +
                        "Water/Lemonade ");
                eigh.setText("1 Hour\n" +
                        "2 cups");

                nine.setText("6:30 – 8:00 P.M");
                ninee.setText("Screen time\n" +
                        "(Play video games/Watch cartoons/Use tablet)");
                nin.setText("1½ Hour");

                ten.setText("8:00 P.M.\n" +
                        "Dinner");
                tenn.setText("Water (15 minutes before dinner)\n" +
                        "Cooked Pumpkin\n" +
                        "Chapatti ");
                te.setText("1 cup\n" +
                        "½ cup\n" +
                        "1");

                eleven.setText("10:00 P.M.");
                elevenn.setText("Dates (small)\n" +
                        "Water (15 minutes before sleeping)");
                eleve.setText("6\n" +
                        "1 cup");

                oneee.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
            }
            if (plan.equals("excercise"))
            {
                eight.setText("5:00 – 6:00 P.M.");
                eightt.setText("Sports Hour\n" +
                        "(Football/Running)\n" +
                        "Water/Lemonade ");
                eigh.setText("1 hour");

                oneee.setVisibility(View.GONE);
                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                fiveee.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                sixxx.setVisibility(View.GONE);
                nineeee.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }
            if (plan.equals("lifestyle"))
            {
                one.setText("11:00 P.M – 8:00 A.M");
                onee.setText("Sound, distraction-free sleep\n");
                on.setText("9 hours");

                five.setText("1:30 – 2:30 P.M ");
                fivee.setText("Rest");
                fiv.setText("1 hour");

                six.setText("2:30 - 3:30 P.M.");
                sixx.setText("Activity Hour\n" +
                        "(Painting/Origami Arts)\n" +
                        "Water");
                six.setText("1 hour");

                nine.setText("6:30 – 8:00 P.M");
                ninee.setText("Screen time\n" +
                        "(Play video games/Watch cartoons/Use tablet)");
                nin.setText("90 mins");

                twooo.setVisibility(View.GONE);
                threeee.setVisibility(View.GONE);
                fourrr.setVisibility(View.GONE);
                sevennn.setVisibility(View.GONE);
                eighttt.setVisibility(View.GONE);
                tennn.setVisibility(View.GONE);
                elevennn.setVisibility(View.GONE);
            }

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        /*if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("adhd") )
        {

        }
        if ((finalValue==6||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("adhd") )
        {

        }
        if ((finalValue==7||finalValue==16||finalValue==24||finalValue==12) &&suffer.equals("adhd") )
        {

        }*/

    }
}
