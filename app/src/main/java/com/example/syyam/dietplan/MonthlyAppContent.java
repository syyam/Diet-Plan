package com.example.syyam.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MonthlyAppContent extends AppCompatActivity {

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
        setContentView(R.layout.activity_monthly_app_content);
        
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

        //layout
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

        scoreGet=Day.getText().toString();
        finalValue=Integer.parseInt(scoreGet);

        doStuff();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalValue>=7)
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
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("schezo") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9 Hours\n" +
                    "1 cup");
            twoo.setText("Whole Wheat Bread\n" +
                    "Apple Milkshake\n" +
                    "Butter ");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Cranberry Juice");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked White Lentils\n" +
                    "Chapatti (6”)\n" +
                    "Yogurt");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Chess)\n");
            //fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("SChia seeds and Sale Smoothies");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Walking)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish\n" +
                    "Chapatti/Naan (6”)\n" +
                    "Fresh Salad\n");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("DahiBhalay\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Chanay\n" +
                    "Naan\n" +
                    "Lassi");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("CMint Margarita");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Brown Rice\n" +
                    "Cooked Red Beans Curry\n" +
                    "Yogurt");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Scrabble)");
            //fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Chicken Apple Salad");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Walking)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish Sandwich\n" +
                    "With Bran Bread\n" +
                    "Mayo");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Warm Halwa");
            //twelv.setText("¼ cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("schezo") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Granola Bars\n" +
                    "(nuts + oats)\n" +
                    "Milk");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Fresh Orange Juice");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Aloo Curry\n" +
                    "Chapatti (6”)\n" +
                    "Mint Dip");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "((Memory Game)");
            //fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Kiwi Smoothie");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("French Fries\n" +
                    "Baked Fish");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Walnuts\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15 ||finalValue==29) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("French Toast\n" +
                    "Sliced Apricots\n" +
                    "Strawberry");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Dark Chocolate Bar");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Mutton Palao\n" +
                    "Mint Raita\n" +
                    "Fresh Salad");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Puzzles)");
            //fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Lemonade");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Cycling)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Bhujia\n" +
                    "Chapatti\n");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Strawberry Flavored Milk\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Whole Wheat Cereal\n" +
                    "Cold milk\n" +
                    "Pear");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Vegetable Corn Salad");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Naan\n" +
                    "Yogurt");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Rubik’s Cube)");
            //fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Fruit Chaat");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Lady Finger Handi\n" +
                    "Chapatti");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Popcorns\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cheese Omelet\n" +
                    "Bran Bread\n" +
                    "Orange Juice");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Pumpkin Seeds and Yogurt Smoothie");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Naan\n" +
                    "Yogurt");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Bar B Q \n" +
                    "Chappatti\n" +
                    "Fresh Salad)");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Fresh Watermelon cubes");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Bitter Gourd Handi\n" +
                    "Chapatti");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Cold Coffee\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Paratha\n" +
                    "Minced Meat with Liver\n" +
                    "Sprite");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Chicken Corn Soup");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Fish Gravy \n" +
                    "Chapatti");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Chess)\n");
            //fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            //si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Fresh Grapes Juice");
            // seve.setText"1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Water/Iced Tea ");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            // nin.setText"1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Palao\n" +
                    "Yogurt\n" +
                    "Chapatti");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Walnuts + Cashew Nuts + Almonds\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }


        //------------------------------PANIC------------------------------//



        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Paratha \n" +
                    "Omelet\n" +
                    "Jam");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Cranberry Juice");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Whole Wheat\n" +
                    "Sandwich\n" +
                    "Mayo");


            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Gym)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Frozen Yougurt");
            //si.setText("1 Cup");

            seven.setText("5:00 – 6:00 P.M.");
            sevenn.setText("Activity Hour\n" +
                    "(Learn something new of choice)");
            // seve.setText"1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Rice\n" +
                    "Mint Dip\n" +
                    "Pickle");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Warm Milk");
            //twelv.setText("1 hour");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Tea (Dodh Pati)\n" +
                    "Rusk");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Fish & Lettuce Salad\n" +
                    "Olive Oil");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Mix Vegetables\n" +
                    "Chapatti \n" +
                    "Plain Yogurt");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Yoga)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Banana Milkshake");
            //si.setText("2 Cup");

            seven.setText("5:00 – 6:00 P.M.");
            sevenn.setText("Activity Hour\n" +
                    "(Learn something new of choice)");
            // seve.setText"1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Mix Lentils\n" +
                    "Chapatti\n" +
                    "Yogurt");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Chia seeds & Pistachio Mix");
            //twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("TCooked Porridge\n" +
                    "Milk\n" +
                    "Sliced Strawberries");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Brocolli & Avocado Salad");
            //thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Grilled Salmon\n" +
                    "Chapatti\n" +
                    "Fresh Salad");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Walk)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Applesauce");
            //si.setText("1 Cup");

            seven.setText("5:00 – 6:00 P.M.");
            sevenn.setText("Activity Hour\n" +
                    "(Learn something new of choice)");
            // seve.setText"1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Boiled Rice\n" +
                    "Cooked Kidney Beans");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Barley Malt");
            //twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15 ||finalValue==29) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Minced Meat\n" +
                    "Paratha\n" +
                    "Lassi ");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Ice cream");
            //thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Kichri\n" +
                    "Yogurt");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Bicycling)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Applesauce");
            //si.setText("1 Cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Lemonade\n" +
                    "Roasted Almonds");
            // seve.setText"1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(Learn something new of choice)\n");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Chicken Karahi\n" +
                    "Chapatti");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Mint water");
            //twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26 ||finalValue==31) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "Milk\n" +
                    "Nut Mix");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Dark Chocolate");
            //thre.setText("1 bar");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Mix Vegetables\n" +
                    "Chapatti \n" +
                    "Plain Yogurt");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Swimming)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Applesauce");
            //si.setText("1 Cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Coconut Water\n" +
                    "Whole wheat biscuits");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)\n");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish\n" +
                    "Mashed Peas & Potatoes");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Vegetable Soup");
            //twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23 ||finalValue==30) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("French Toast\n" +
                    "Milk\n" +
                    "Honey");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Orange Juice");
            //thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Spinach & Chicken \n" +
                    "Chapatti");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Cricket/Football)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Fresh Cream Salad");
            //si.setText("1 Cup");


            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)\n");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Black beans \n" +
                    "Boiled Rice");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Flavored Milk ");
            //twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           // on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Tea (Dodh Pati)\n" +
                    "Halwa ");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Grilled Kebab");
            //thre.setText("1 oz.");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Vegetable Palao\n" +
                    "Yogurt");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Yoga)");
            //fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Banana and Flax seeds Smoothie");
            //si.setText("1 Cup");


            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(Learn something new of choice)\n");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            // nin.setText"1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Fish in Gravy\n" +
                    "Chapatti");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            //eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Date Shake");
            //twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            ////thirtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        //-----------------------------------------OCD-----------------------------------------//

        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Whole Wheat Cereal\n" +
                    "Cold milk\n" +
                    "Banana");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Cheese Sandwich\n" +
                    "Fresh Orange Juice");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked Yellow Lentils\n" +
                    "Chapatti (6”)\n" +
                    "Yogurt");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Doing Artistic things)\n" +
                    "Water");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Cucumber & Corn Salad");
            // seve.setText"1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Water/Iced Tea ");
            //eigh.setText("1 Hour");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("GScreen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Grilled Fish\n" +
                    "Chapatti/Naan (6”)");


            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading (book/novel/magazine)\n" +
                    "Walnuts\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Corn Cereal\n" +
                    "Cold milk\n" +
                    "Peach");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Dark chocolate squares");
            //thre.setText("3");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Mix Vegetables Handi\n" +
                    "Chapatti (6”)\n" +
                    "Fresh Salad\n");


            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Intellectual Games)\n" +
                    "Water");
            //si.setText("1 Hour\n"+


            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Flaxseed and Yogurt Smoothie");
            // seve.setText"1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Jogging)\n" +
                    "Water/Iced Tea");


            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Chicken Rice\n" +
                    "Mint Dip");


            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading (book/novel/magazine)\n" +
                    "Dates\n" +
                    "Water (15 minutes before sleeping)");


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Fresh Mango Juice\n" +
                    "Toasted Bread\n" +
                    "Butter");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Grilled Chicken");
            //thre.setText("1 oz.");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Minced Meat Naan\n" +
                    "Mint Raita");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Do activities you are skilled at)\n" +
                    "Water");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Strawberry Milkshake");
            // seve.setText"1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Walking)\n" +
                    "Water/Iced Tea ");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Cooked Pumpkin \n" +
                    "Chapatti");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading time\n" +
                    "Warm Milk\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==21||finalValue==22||finalValue==15 || finalValue==29) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
           // on.setText("9 Hours\n" +

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Whole Wheat Biscuits\n" +
                    "Flavored Milk");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Coleslaw");
            //thre.setText("½ cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Fish Curry\n" +
                    "Chapatti (6”)");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Play with animals)\n" +
                    "Water");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Fresh Vegetable Salad\n" +
                    "Olive Oil (sprinkled on top)");
            // seve.setText"1 cup\n"+"1 tsp.");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Water/Iced Tea");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Rice with Peas\n" +
                    "Yogurt");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading time\n" +
                    "Flaxseed & Sunflower seeds\n" +
                    "Water (15 minutes before sleeping)");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26 || finalValue==31) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");


            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Boiled Egg (sliced)\n" +
                    "Toast\n" +
                    "Garlic Mayo");


            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Berries Smoothie");
            //thre.setText("1 cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Spinach & Meat Handi\n" +
                    "Chapatti (6”)");


            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Learn new stuff)\n" +
                    "Water");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Banana Bread Slice");
            // seve.setText"1");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Cycling)\n" +
                    "Water/Iced Tea");


            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Fish Cutlets \n" +
                    "Chapatti (6”)");


            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading\n" +
                    "Nuts Mix\n" +
                    "Water (15 minutes before sleeping)");


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23 || finalValue==30) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");


            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Omelet\n" +
                    "Paratha\n" +
                    "Jam");


            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Brussels Sprouts Salad");
            //thre.setText("1 cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked Chickpeas\n" +
                    "Chapatti");


            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Practice favorite hobbies)\n" +
                    "Water");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Whole Wheat Crackers");
            // seve.setText"2");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(meditation)\n" +
                    "Water/Iced Tea");


            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Spinach Rice ");


            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading time\n" +
                    "Firni\n" +
                    "Water (15 minutes before sleeping)");


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");


            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Almonds Shake\n" +
                    "Chocolate Syrup\n" +
                    "Crushed Almonds");


            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("French Toast");
            //thre.setText("1");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Beef Steak\n" +
                    "Mashed Potatoes");


            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Play intellectual games)\n" +
                    "Water");


            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Strawberry Yogurt");
            // seve.setText"1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Sports)\n" +
                    "Water/Iced Tea ");


            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            // nin.setText"");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            //te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Cooked Broccoli \n" +
                    "Chapatti");


            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading \n" +
                    "Ice-cream\n" +
                    "Water (15 minutes before sleeping");


            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        //---------------------------------depression----------------------------------//


        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");


            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cornflakes\n" +
                    "With Milk\n" +
                    "Berries (any)");


            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Orange Juice");
            //thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Mix Vegetables\n" +
                    "Chapatti \n" +
                    "Plain Yogurt");


            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade");


            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Cucumber & Corn Salad");
            // seve.setText"1 cup");

            eight.setText("5:00 P.M.");
            eightt.setText("Apple Pie");
            //eigh.setText("1 Cup");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(anything of interest");
            // nin.setText"1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            //te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Baked Chicken\n" +
                    "Chapatti \n" +
                    "Rooh Afza in Water");
            

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            //twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Ice-cream \n" +
                    "(any flavor)");
            

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            //fourtee.setText("½ Hour");

            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
         

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cheese Omelet (Egg+Cheese)\n" +
                    "Toasted Bread\n" +
                    "Milo in Milk");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Chicken Pineapple Salad");
            //thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Meat Curry\n" +
                    "Chapatti\n" +
                    "Fresh Vegetable Salad");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Tai Chi)\n" +
                    "Mint Water/Lemonade");
            

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Whole Wheat Biscuits");
            // seve.setText"1 cup");

            eight.setText("5:00 - 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            //eigh.setText("1 Hour");


            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            //te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Fish Curry\n" +
                    "Boiled Rice\n" +
                    "Mashed Potatoes");
            

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            //twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Walnuts & Pistachio Mix)");
            ////thirtee.setText("½ cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            //fourtee.setText("½ Hour");

            nineeee.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
           

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("French Toasts\n" +
                    "Milk");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Kiwi Smoothie");
            //thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Ginger Handi\n" +
                    "Chapatti (6”)\n" +
                    "Kale Salad ");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            //fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Mint Water/Lemonade");
            


            eight.setText("5:00 P.M.");
            eightt.setText("Flavored Yogurt");
            //eigh.setText("1 Cup");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(anything of interest");
            

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            //te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Cooked Lentils\n" +
                    "Chapatti (6”)\n" +
                    "Mint Dip");
           

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            //twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Apricots \n" +
                    "(Chopped)");
            ////thirtee.setText("1 cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            //fourtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
           

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Fried Egg\n" +
                    "Paratha (6”)\n" +
                    "Lassi");
        

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Raw Brocolli & Cucumber Salad");
            

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Chickpeas\n" +
                    "Chapatti (6”)\n" +
                    "Mint Raita");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade");
            


            eight.setText("5:00 P.M.");
            eightt.setText("Chia Seeds Drink");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(anything of interest");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Vegetable Rice\n" +
                    "Chicken Curry");
            

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Warm Milk");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "In Milk\n" +
                    "Apple Juice");


            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Nuts & Seeds Energy Bars");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Tikka\n" +
                    "Naan\n" +
                    "Frfou.esh Vegetables Salad\n" +
            "Yogurt");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Walking/runnging/jogging)\n" +
                    "Mint Water/Lemonade");


            eight.setText("5:00 P.M.");
            eightt.setText("Strawberry Milkshake");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(Listening to music)");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Grilled Fish\n" +
                    "Tartar Sauce\n" +
                    "Garlic Bread");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Almonds \n" +
                    "Dates");
            

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Toast\n" +
                    "Butter\n" +
                    "Jam\n" +
                    "Orange Juice");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Whole Wheat Biscuits\n" +
                    "Flavored Milk");
           
            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Spinach & Potato Handi\n" +
                    "Chapatti (6”)\n" +
                    "Mango Dip");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Skipping/Jumping)\n" +
                    "Mint Water/Lemonade");
            

            eight.setText("5:00 P.M.");
            eightt.setText("Whole Wheat Baked Crackers");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(Write a journal)");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends))");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Meat Stake\n" +
                    "Baked potatoes\n" +
                    "Baked Vegetables\n");
           

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Halwa (any)");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Milk Tea \n" +
                    "Rusk");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Baked Carrot & Potato Wedges");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Whole Wheat Chicken Pasta\n" +
                    "White Sauce\n" +
                    "Mint Margarita");
            
            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Mint Water/Lemonade");


            eight.setText("5:00 P.M.");
            eightt.setText("Yogurt");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(Practice favorite hobby");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends))");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Cooked Pulses\n" +
                    "Chapatti");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
           

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Rooh Afza in Milk");
            

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
           

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cornflakes\n" +
                    "With Milk\n" +
                    "Berries (any)");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Orange Juice");
            

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Mix Vegetables\n" +
                    "Chapatti \n" +
                    "Plain Yogurt");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade\n");
           

            seven.setText("5:00 P.M.");
            sevenn.setText("Apple Pie");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
           

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Baked Chicken\n" +
                    "Chapatti \n" +
                    "Rooh Afza in Water");
            
            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Ice-cream \n" +
                    "(any flavor)");
            
            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cornflakes\n" +
                    "With Milk\n" +
                    "Berries (any)");
           
            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Orange Juice");
            
            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Mix Vegetables\n" +
                    "Chapatti \n" +
                    "Plain Yogurt");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
           

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade\n");
            

            seven.setText("5:00 P.M.");
            sevenn.setText("Apple Pie");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Fish Curry\n" +
                    "Boiled Rice\n" +
                    "Mashed Potatoes");
            

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Walnuts & Pistachio Mix");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==8||finalValue==18||finalValue==28) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("French Toasts\n" +
                    "Milk");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Kiwi Smoothie");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Ginger Handi\n" +
                    "Chapatti (6”)\n" +
                    "Kale Salad ");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Mint Water/Lemonade\n");
            

            seven.setText("5:00 P.M.");
            sevenn.setText("Flavored Yogurt");
           
            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
           

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Lentils\n" +
                    "Chapatti (6”)\n" +
                    "Mint Dip");
            

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Apricots \n" +
                    "(Chopped)");
           
            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
           

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Fried Egg\n" +
                    "Paratha (6”)\n" +
                    "Lassi");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Raw Brocolli & Cucumber Salad");
           
            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Chickpeas\n" +
                    "Chapatti (6”)\n" +
                    "Mint Raita");
         
            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
           

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade\n");
            

            seven.setText("5:00 P.M.");
            sevenn.setText("Chia Seeds Drink");
           

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            
            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Rice\n" +
                    "Chicken Curry");
            

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Warm Milk");
            
            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
           

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "In Milk\n" +
                    "Apple Juice");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Nuts & Seeds Energy Bars");
            

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Tikka\n" +
                    "Naan\n" +
                    "Fresh Vegetables Salad\n" +
                    "Yogurt\n");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Walking/runnging/jogging)\n" +
                    "Mint Water/Lemonade");
            

            seven.setText("5:00 P.M.");
            sevenn.setText("Strawberry Milkshake");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
           

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            
            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish\n" +
                    "Tartar Sauce\n" +
                    "Garlic Bread");
            

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
           

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Almonds \n" +
                    "Dates");
          
            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Toast\n" +
                    "Butter\n" +
                    "Jam\n" +
                    "Orange Juice");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Whole Wheat Biscuits\n" +
                    "Flavored Milk");
            

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Spinach & Potato Handi\n" +
                    "Chapatti (6”)\n" +
                    "Mango Dip");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Skipping/Jumping)\n" +
                    "Mint Water/Lemonade");
           

            seven.setText("5:00 P.M.");
            sevenn.setText("Whole Wheat Baked Crackers");
           
            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
           

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Meat Stake\n" +
                    "Baked potatoes\n" +
                    "Baked Vegetables");
           

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Halwa (any)");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Milk Tea \n" +
                    "Rusk");
            

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Baked Carrot & Potato Wedges");
            

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Whole Wheat Chicken Pasta\n" +
                    "White Sauce\n" +
                    "Mint Margarita  ");
            

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Mint Water/Lemonade");
           

            seven.setText("5:00 P.M.");
            sevenn.setText("Yogurt");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Pulses\n" +
                    "Chapatti");
                  

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Rooh Afza in Milk");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Corn flakes\n" +
                    "Milk\n" +
                    "Strawberries/Cherries");
            
            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Chicken Sandwich\n" +
                    "Water");
            

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked spinach\n" +
                    "Chapatti (6”)\n" +
                    "Fresh salad");
            
            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Sketching/Crafting)\n" +
                    "Water");
           

            seven.setText("4:00 P.M.");
            sevenn.setText("Apple Milkshake");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Badminton/Skating)\n" +
                    "Water/Iced Tea ");
          

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
          

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Grilled Fish\n" +
                    "Chapatti/Naan (6”)");
            

            eleven.setText("10:00 P.M.");
            elevenn.setText("Melon\n" +
                    "Walnuts\n" +
                    "Water (15 minutes before sleeping)");
           
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            
            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Boiled Egg\n" +
                    "Toast\n" +
                    "Orange juice");
            

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Nuggets \n" +
                    "Milo");
            

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Boiled Rice\n" +
                    "Cooked Pulses\n" +
                    "Raw sliced vegatbles");
            

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Stamping/Gardening)\n" +
                    "Water");
            

            seven.setText("4:00 P.M.");
            sevenn.setText("Red Beans Soup\n" +
                    "Crackers");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Swimming/Cycling)\n" +
                    "Water/Lemonade");
            

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Beef steak \n" +
                    "Mashed potatoes\n" +
                    "Garlic bread");
            
            eleven.setText("10:00 P.M.");
            elevenn.setText("Dark chocolate\n" +
                    "Warm Milk\n" +
                    "Water (15 minutes before sleeping)");
           

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==8||finalValue==18||finalValue==28) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("French Toast\n" +
                    "Banana\n" +
                    "Chocolate Milk");
           

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Egg Paratha\n" +
                    "Juice");
            

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked Mix Vegetables (carrots/potato/peas)\n" +
                    "Chapatti (6”)\n" +
                    "Mint Yogurt");
            

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            
            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Pop Up Art)\n" +
                    "Water");
           

            seven.setText("4:00 P.M.");
            sevenn.setText("Spinach and Kale smoothie \n" +
                    "with berries");
           

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Karate/Self Defense)\n" +
                    "Water/Lemonade ");
           

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Whole wheat Chicken Pasta");
            

            eleven.setText("10:00 P.M.");
            elevenn.setText("Popcorn\n" +
                    "Water (15 minutes before sleeping)");
            
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Porridge\n" +
                    "Cooked in milk");
            

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Banana\n" +
                    "Apple\n" +
                    "Water");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Chicken Biryani \n" +
                    "Fresh Salad");
           

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Painting/Origami Arts)\n" +
                    "Water");
           

            seven.setText("4:00 P.M.");
            sevenn.setText("Flavored Yogurt \n" +
                    "(Strawberry/Raspberry)");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Football/Running)\n" +
                    "Water/Lemonade ");
            

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            
            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Cooked Pumpkin\n" +
                    "Chapatti ");
            

            eleven.setText("10:00 P.M.");
            elevenn.setText("Dates (small)\n" +
                    "Water (15 minutes before sleeping)");
            

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Paratha (6”)\n" +
                    "Egg Omelet\n" +
                    "Jam ");
            

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("French Toast\n" +
                    "Water");
            

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Chinese Chicken Gravy\n" +
                    "Chinese Rice");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Coloring/Baking)\n" +
                    "Water");
            

            seven.setText("4:00 P.M.");
            sevenn.setText("Freshly squeezed \n" +
                    "Orange Juice ");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Horse Riding/Cricket)\n" +
                    "Water/Lemonade");
            

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
           

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("WWater (15 minutes before dinner)\n" +
                    "Grilled Fish Cheese Sandwich \n" +
                    "Mayonnaise");
            

            eleven.setText("10:00 P.M.");
            elevenn.setText("Warm Milk\n" +
                    "Figs\n" +
                    "Water (15 minutes before sleeping)");
            

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "Topped with berries");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Carrot & Baked Potato Sticks \n" +
                    "Water");;

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Mutton Curry\n" +
                    "Chapatti (6”)");
            

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Beading Jewellry)\n" +
                    "Water");

            seven.setText("4:00 P.M.");
            sevenn.setText("Cranberries & Yogurt Smoothie");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Aerobics/Dancing)\n" +
                    "Water/Lemonade ");
            

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Cooked Eggplant\n" +
                    "Chapatti (6”)");

            eleven.setText("10:00 P.M.");
            elevenn.setText("Walnuts & Almonds\n" +
                    "Water (15 minutes before sleeping)");
            

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==16||finalValue==24||finalValue==12) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Paratha (6”)\n" +
                    "Fried egg\n" +
                    "Banana Milkshake");
           

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Sweet potato & fish cutlets (3”)\n" +
                    "Water");
           

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked lentils\n" +
                    "Chapatti (6”)\n" +
                    "Yogurt");
            
            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Drawing/Painting)\n" +
                    "Water");
            

            seven.setText("4:00 P.M.");
            sevenn.setText("Whole wheat biscuits\n" +
                    "Milk");
            

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Football/Basketball/Dancing)\n" +
                    "Water/Lemonade");
            
            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Chicken curry\n" +
                    "Chapatti (6”)");
           

            eleven.setText("10:00 P.M.");
            elevenn.setText("Apple (small)\n" +
                    "Almonds\n" +
                    "Water (15 minutes before sleeping)");
           

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
    }
}
