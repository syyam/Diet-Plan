package com.example.syyam.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WeeklyAppContent extends AppCompatActivity {

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
        setContentView(R.layout.activity_weekly_app_content);

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
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("schezo") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Chess)\n");
            fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Chia seeds and Sale Smoothies");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Walking)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish\n" +
                    "Chapatti/Naan (6”)\n" +
                    "Fresh Salad\n");
            te.setText("1 oz.\n" +
                    "1\n" +
                    "½ cup\n");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("DahiBhalay\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("¼ cup\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

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
            threee.setText("CMint Margarita");
            thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Brown Rice\n" +
                    "Cooked Red Beans Curry\n" +
                    "Yogurt");
            fou.setText("1 cup\n" +
                    "½ cup\n" +
                    "½ cup");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Scrabble)");
            fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Chicken Apple Salad");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Walking)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish Sandwich\n" +
                    "With Bran Bread\n" +
                    "Mayo");
            te.setText("1 \n" +
                    "2 slices\n" +
                    "1 tsp.");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Warm Halwa");
            twelv.setText("¼ cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("schezo") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Granola Bars\n" +
                    "(nuts + oats)\n" +
                    "Milk");
            tw.setText("2\n" +
                    "\n" +
                    "1 cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Fresh Orange Juice");
            thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Aloo Curry\n" +
                    "Chapatti (6”)\n" +
                    "Mint Dip");
            fou.setText("1 cup\n" +
                    "2\n" +
                    "½ cup\n");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "((Memory Game)");
            fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Kiwi Smoothie");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("French Fries\n" +
                    "Baked Fish");
            te.setText("½  cup\n" +
                    "1 oz");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Walnuts\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15 ||finalValue==29) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("French Toast\n" +
                    "Sliced Apricots\n" +
                    "Strawberry");
            tw.setText("2\n" +
                    "1 cup\n" +
                    "3");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Dark Chocolate Bar");
            thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Mutton Palao\n" +
                    "Mint Raita\n" +
                    "Fresh Salad");
            fou.setText("1 cup\n" +
                    "½ cup\n" +
                    "½ cup");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Puzzles)");
            fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Lemonade");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Cycling)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n"+
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Bhujia\n" +
                    "Chapatti\n");
            te.setText("½  cup\n" +
                    "1");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Strawberry Flavored Milk\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Rubik’s Cube)");
            fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Fruit Chaat");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n"+
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Lady Finger Handi\n" +
                    "Chapatti");
            te.setText("½  cup\n" +
                    "1");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Popcorns\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup each");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("9:00 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cheese Omelet\n" +
                    "Bran Bread\n" +
                    "Orange Juice");
            tw.setText("2 eggs\n" +
                    "2 slices\n" +
                    "1 cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Pumpkin Seeds and Yogurt Smoothie");
            thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Naan\n" +
                    "Yogurt");
            fou.setText("2\n" +
                    "½ cup");

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Bar B Q \n" +
                    "Chappatti\n" +
                    "Fresh Salad)");
            fiv.setText("2 oz.\n" +
                    "2\n" +
                    "1 cup");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Fresh Watermelon cubes");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n"+
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Bitter Gourd Handi\n" +
                    "Chapatti");
            te.setText("½  cup\n" +
                    "1");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Cold Coffee\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup each");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("schezo"))
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)\n");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("2:00 – 3:00 P.M ");
            fivee.setText("Activity Hour\n" +
                    "(Chess)\n");
            fiv.setText("1 Hour");

            six.setText("3:30 – 4:30 P.M");
            sixx.setText("Nap");
            si.setText("1 Hour");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Fresh Grapes Juice");
            seve.setText("1 cup");

            eight.setText("6:00 – 7:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n"+
                    "2 cups");

            nine.setText("7:00 – 8:00 P.M");
            ninee.setText("Interaction Hour\n" +
                    "(Attend social meetings)");
            nin.setText("1½  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Palao\n" +
                    "Yogurt\n" +
                    "Chapatti");
            te.setText("½ cup\n" +
                    "½ cup\n" +
                    "1\n");

            eleven.setText("9:30-10:00 P.M.");
            elevenn.setText("Screen/Reading Time");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Walnuts + Cashew Nuts + Almonds\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("3 each\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }


        //------------------------------PANIC------------------------------//



        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Gym)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Frozen Yougurt");
            si.setText("1 Cup");

            seven.setText("5:00 – 6:00 P.M.");
            sevenn.setText("Activity Hour\n" +
                    "(Learn something new of choice)");
            seve.setText("1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:30 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Rice\n" +
                    "Mint Dip\n" +
                    "Pickle");
            te.setText("1 1/3 cup \n" +
                    "1 tsp.\n" +
                    "½ tsp");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Warm Milk");
            twelv.setText("1 hour");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Yoga)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Banana Milkshake");
            si.setText("2 Cup");

            seven.setText("5:00 – 6:00 P.M.");
            sevenn.setText("Activity Hour\n" +
                    "(Learn something new of choice)");
            seve.setText("1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Mix Lentils\n" +
                    "Chapatti\n" +
                    "Yogurt");
            te.setText("½ cup\n" +
                    "1\n" +
                    "½ cup");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Chia seeds & Pistachio Mix");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("TCooked Porridge\n" +
                    "Milk\n" +
                    "Sliced Strawberries");
            tw.setText("1 cup\n" +
                    "3");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Brocolli & Avocado Salad");
            thre.setText("1 cup");

            four.setText("2:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Grilled Salmon\n" +
                    "Chapatti\n" +
                    "Fresh Salad");
            fou.setText("2 oz.\n" +
                    "2\n" +
                    "½ cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Walk)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Applesauce");
            si.setText("1 Cup");

            seven.setText("5:00 – 6:00 P.M.");
            sevenn.setText("Activity Hour\n" +
                    "(Learn something new of choice)");
            seve.setText("1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Boiled Rice\n" +
                    "Cooked Kidney Beans");
            te.setText("1 cup\n" +
                    "½ cup");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Barley Malt");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15 ||finalValue==29) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Bicycling)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Applesauce");
            si.setText("1 Cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Lemonade\n" +
                    "Roasted Almonds");
            seve.setText("1 hour");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(Learn something new of choice)\n");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Chicken Karahi\n" +
                    "Chapatti");
            te.setText("½ cup\n" +
                    "1");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Mint water");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26 ||finalValue==31) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "Milk\n" +
                    "Nut Mix");
            tw.setText("1 cup\n" +
                    "1 cup\n" +
                    "½ cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Dark Chocolate");
            thre.setText("1 bar");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Cooked Mix Vegetables\n" +
                    "Chapatti \n" +
                    "Plain Yogurt");
            fou.setText("½ cup\n" +
                    "2\n" +
                    "¼ cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Swimming)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Applesauce");
            si.setText("1 Cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Coconut Water\n" +
                    "Whole wheat biscuits");
            seve.setText("1 cup\n" +
                    "2");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)\n");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish\n" +
                    "Mashed Peas & Potatoes");
            te.setText("½ cup\n" +
                    "1");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Vegetable Soup");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23 ||finalValue==30) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Cricket/Football)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Fresh Cream Salad");
            si.setText("1 Cup");


            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Screen Time\n" +
                    "(Watch a comedy series/movie)\n");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Black beans \n" +
                    "Boiled Rice");
            te.setText("½ cup\n" +
                    "1");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Flavored Milk ");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("panic") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Tea (Dodh Pati)\n" +
                    "Halwa ");
            tw.setText("1 cup\n" +
                    "½ cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Grilled Kebab");
            thre.setText("1 oz.");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Vegetable Palao\n" +
                    "Yogurt");
            fou.setText("1 ½ cup\n" +
                    "¼ cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Sports Hour\n" +
                    "(Yoga)");
            fiv.setText("1 Hour");

            six.setText("4:00 P.M Snack");
            sixx.setText("Banana and Flax seeds Smoothie");
            si.setText("1 Cup");


            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(Learn something new of choice)\n");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Fish in Gravy\n" +
                    "Chapatti");
            te.setText("1 cup\n"+
                    "1");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Self-Time\n" +
                    "(Spend some time alone)");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Date Shake");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading/Writing Time\n" +
                    "(Read a favorite book or keep a journal)");
            thirtee.setText("½ Hour");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Doing Artistic things)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Cucumber & Corn Salad");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("GScreen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

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
            twelvee.setText("Reading (book/novel/magazine)\n" +
                    "Walnuts\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Intellectual Games)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Flaxseed and Yogurt Smoothie");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Jogging)\n" +
                    "Water/Iced Tea");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

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
            twelvee.setText("Reading (book/novel/magazine)\n" +
                    "Dates\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("3\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Do activities you are skilled at)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Strawberry Milkshake");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Walking)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

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
            twelvee.setText("Reading time\n" +
                    "Warm Milk\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==21||finalValue==22||finalValue==15 || finalValue==29) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Whole Wheat Biscuits\n" +
                    "Flavored Milk");
            tw.setText("2\n" +
                    "1 cup");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Coleslaw");
            thre.setText("½ cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Fish Curry\n" +
                    "Chapatti (6”)");
            fou.setText("1 cup\n" +
                    "½ cup\n" +
                    "1");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Play with animals)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Fresh Vegetable Salad\n" +
                    "Olive Oil (sprinkled on top)");
            seve.setText("1 cup\n"+"1 tsp.");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Water/Iced Tea");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Rice with Peas\n" +
                    "Yogurt");
            eleve.setText("1 cup\n" +
                    "½ cup\n" +
                    "1");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading time\n" +
                    "Flaxseed & Sunflower seeds\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("6\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26 || finalValue==31) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Learn new stuff)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Banana Bread Slice");
            seve.setText("1");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Cycling)\n" +
                    "Water/Iced Tea");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Fish Cutlets \n" +
                    "Chapatti (6”)");
            eleve.setText("1 cup\n" +
                    "2 cup\n" +
                    "1");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading\n" +
                    "Nuts Mix\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("¼ cup\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23 || finalValue==30) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Omelet\n" +
                    "Paratha\n" +
                    "Jam");
            tw.setText("1 \n" +
                    "1\n" +
                    "1 tsp");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Brussels Sprouts Salad");
            thre.setText("1 cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked Chickpeas\n" +
                    "Chapatti");
            fou.setText("1 cup\n" +
                    "½ cup\n" +
                    "2");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Practice favorite hobbies)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Whole Wheat Crackers");
            seve.setText("2");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(meditation)\n" +
                    "Water/Iced Tea");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Spinach Rice ");
            eleve.setText("1 cup\n" +
                    "1 ½ cup");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading time\n" +
                    "Firni\n" +
                    "Water (15 minutes before sleeping)");
            twelv.setText("¼ cup\n" +
                    "1 cup");

            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("ocd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Almonds Shake\n" +
                    "Chocolate Syrup\n" +
                    "Crushed Almonds");
            tw.setText("1 cup\n" +
                    "2 tsp.\n" +
                    "1 tsp.");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("French Toast");
            thre.setText("1");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Beef Steak\n" +
                    "Mashed Potatoes");
            fou.setText("1 cup\n" +
                    "1 oz.\n" +
                    "¼ cup");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("2:30 – 3:30 P.M");
            sixx.setText("Activity Hour\n" +
                    "(Play intellectual games)\n" +
                    "Water");
            si.setText("1 Hour\n"+
                    "1 cup");

            seven.setText("4:00 P.M. Snack");
            sevenn.setText("Strawberry Yogurt");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Exercise Hour\n" +
                    "(Sports)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:00 – 6:30 P.M");
            ninee.setText("Closing eyes and resting ");
            nin.setText("");

            ten.setText("6:30 – 8:00 P.M");
            tenn.setText("Screen time\n" +
                    "(Watch favorite movie/documentary)");
            te.setText("1½  Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Water (15 minutes before dinner)\n" +
                    "Cooked Broccoli \n" +
                    "Chapatti");
            eleve.setText("1 cup\n" +
                    "1 ½ cup\n"+"1");

            twelve.setText("10:00 P.M.\n" +
                    "Snack");
            twelvee.setText("Reading \n" +
                    "Ice-cream\n" +
                            "Water (15 minutes before sleeping");
            twelv.setText("6\n" +
                    "1 cup");

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
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

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

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(anything of interest");
            nin.setText("1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Baked Chicken\n" +
                    "Chapatti \n" +
                    "Rooh Afza in Water");
            eleve.setText("3 oz.\n" +
                    "1\n" +
                    "1 cup");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Ice-cream \n" +
                    "(any flavor)");
            thirtee.setText("1 \n" +
                    "6");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

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
            fou.setText("½ cup\n" +
                    "2\n" +
                    "¼ cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Tai Chi)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n"+
                    "2 cups");

            seven.setText("5:00 P.M. Snack");
            sevenn.setText("Whole Wheat Biscuits");
            seve.setText("1 cup");

            eight.setText("5:00 - 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");


            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Fish Curry\n" +
                    "Boiled Rice\n" +
                    "Mashed Potatoes");
            eleve.setText("3 oz.\n" +
                    "1 ½ cup\n" +
                    "½ cup");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Walnuts & Pistachio Mix)");
            thirtee.setText("½ cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            nineeee.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        if ((finalValue==3||finalValue==9||finalValue==18||finalValue==28) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n"+
                    "2 cups");


            eight.setText("5:00 P.M.");
            eightt.setText("Flavored Yogurt");
            eigh.setText("1 Cup");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(anything of interest");
            nin.setText("1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Cooked Lentils\n" +
                    "Chapatti (6”)\n" +
                    "Mint Dip");
            eleve.setText("3 oz.\n" +
                    "1\n" +
                    "1 tsp.");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Apricots \n" +
                    "(Chopped)");
            thirtee.setText("1 cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n"+
                    "2 cups");


            eight.setText("5:00 P.M.");
            eightt.setText("Chia Seeds Drink");
            eigh.setText("1 Cup");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(anything of interest");
            nin.setText("1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Vegetable Rice\n" +
                    "Chicken Curry");
            eleve.setText("1 cup\n" +
                    "½ cup");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Warm Milk");
            thirtee.setText("1 cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "In Milk\n" +
                    "Apple Juice");
            tw.setText("½ cup\n" +
                    "1 cup\n" +
                    "1 cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Nuts & Seeds Energy Bars");
            thre.setText("2");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Tikka\n" +
                    "Naan\n" +
                    "Fresh Vegetables Salad\n" +
                    "Yogurt");
            fou.setText("1 oz.\n" +
                    "1\n" +
                    "¼ cup\n" +
                    "½ cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Walking/runnging/jogging)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n"+
                    "2 cups");


            eight.setText("5:00 P.M.");
            eightt.setText("Strawberry Milkshake");
            eigh.setText("1 Cup");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(Listening to music)");
            nin.setText("1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends)");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Grilled Fish\n" +
                    "Tartar Sauce\n" +
                    "Garlic Bread");
            eleve.setText("1 oz.\n" +
                    "1 tsp.\n" +
                    "1 Slice");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Almonds \n" +
                    "Dates");
            thirtee.setText("7-8\n" +
                    "2-3");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==8||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Toast\n" +
                    "Butter\n" +
                    "Jam\n" +
                    "Orange Juice");
            tw.setText("1\n" +
                    "½ tsp. \n" +
                    "½ tsp.\n" +
                    "1 cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Whole Wheat Biscuits\n" +
                    "Flavored Milk");
            thre.setText("2\n" +
                    "1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Spinach & Potato Handi\n" +
                    "Chapatti (6”)\n" +
                    "Mango Dip");
            fou.setText("½ cup\n" +
                    "2\n" +
                    "½ tsp.");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Skipping/Jumping)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n" +
                    "2 cups");


            eight.setText("5:00 P.M.");
            eightt.setText("Whole Wheat Baked Crackers");
            eigh.setText("3");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(Write a journal)");
            nin.setText("1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends))");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Meat Stake\n" +
                    "Baked potatoes\n" +
                    "Baked Vegetables\n");
            eleve.setText("2 oz.\n" +
                    "½ cup\n" +
                    "½ cup");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Halwa (any)");
            thirtee.setText("7¼  cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("depression") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n" +
                    "Water (right after waking up)");
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Milk Tea \n" +
                    "Rusk");
            tw.setText("1 cup\n" +
                    "2");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Baked Carrot & Potato Wedges");
            thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Whole Wheat Chicken Pasta\n" +
                    "White Sauce\n" +
                    "Mint Margarita");
            fou.setText("1 cup\n" +
                    "2 tsp.\n" +
                    "1 cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Nap");
            fiv.setText("1 Hour");

            six.setText("4:00 – 5:00 P.M");
            sixx.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n" +
                    "2 cups");


            eight.setText("5:00 P.M.");
            eightt.setText("Yogurt");
            eigh.setText("1 cup");

            nine.setText("5:00 – 6:00 P.M");
            ninee.setText("Activity Hour\n" +
                    "(Practice favorite hobby");
            nin.setText("1 Hour");

            ten.setText("6:00 – 7:00 P.M");
            tenn.setText("Interaction Hour\n" +
                    "(Interact with family members or friends))");
            te.setText("1 Hour");

            eleven.setText("8:00 P.M.\n" +
                    "Dinner");
            elevenn.setText("Cooked Pulses\n" +
                    "Chapatti");
            eleve.setText("½ cup\n" +
                    "1");

            twelve.setText("9:00 - 10:00 P.M.");
            twelvee.setText("Screen Time");
            twelv.setText("1 Hour");

            thirteen.setText("10:30 P.M.\n" +
                    "Snack");
            thirteenn.setText("Rooh Afza in Milk");
            thirtee.setText("1  cup");

            fourteen.setText("10:30 – 11:00 P.M");
            fourteenn.setText("Reading Time");
            fourtee.setText("½ Hour");

            sevennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }

        //*****************************bipolar*****************************//
        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade\n");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Apple Pie");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Baked Chicken\n" +
                    "Chapatti \n" +
                    "Rooh Afza in Water");
            te.setText("3 oz.\n" +
                    "1\n" +
                    "1 cup");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Ice-cream \n" +
                    "(any flavor)");
            twelv.setText("1 \n" +
                    "6");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade\n");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Apple Pie");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Fish Curry\n" +
                    "Boiled Rice\n" +
                    "Mashed Potatoes");
            te.setText("3 oz.\n" +
                    "1 ½ cup\n" +
                    "½ cup");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Walnuts & Pistachio Mix");
            twelv.setText("½ cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==8||finalValue==18||finalValue==28) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Gym)\n" +
                    "Mint Water/Lemonade\n");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Flavored Yogurt");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Lentils\n" +
                    "Chapatti (6”)\n" +
                    "Mint Dip");
            te.setText("3 oz.\n" +
                    "1\n" +
                    "1 tsp.\n");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Apricots \n" +
                    "(Chopped)");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Yoga)\n" +
                    "Mint Water/Lemonade\n");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Chia Seeds Drink");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Vegetable Rice\n" +
                    "Chicken Curry");
            te.setText("1 cup\n" +
                    "½ cup");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Warm Milk");
            twelv.setText("1 cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "In Milk\n" +
                            "Apple Juice");
            tw.setText("½ cup\n" +
                    "1 cup\n" +
                    "1 cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Nuts & Seeds Energy Bars");
            thre.setText("2");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Chicken Tikka\n" +
                    "Naan\n" +
                    "Fresh Vegetables Salad\n" +
                    "Yogurt\n");
            fou.setText("1 oz.\n" +
                    "1\n" +
                    "¼ cup\n" +
                    "½ cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Walking/runnging/jogging)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Strawberry Milkshake");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Grilled Fish\n" +
                    "Tartar Sauce\n" +
                    "Garlic Bread");
            te.setText("1 oz.\n" +
                    "1 tsp.\n" +
                    "1 Slice");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Almonds \n" +
                    "Dates");
            twelv.setText("7-8\n" +
                    "2-3");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Toast\n" +
                    "Butter\n" +
                    "Jam\n" +
                    "Orange Juice");
            tw.setText("1\n" +
                    "½ tsp. \n" +
                    "½ tsp.\n" +
                    "1 cup");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Whole Wheat Biscuits\n" +
                    "Flavored Milk");
            thre.setText("2\n" +
                    "1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Spinach & Potato Handi\n" +
                    "Chapatti (6”)\n" +
                    "Mango Dip");
            fou.setText("½ cup\n" +
                    "2\n" +
                    "½ tsp");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Skipping/Jumping)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Whole Wheat Baked Crackers");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Meat Stake\n" +
                    "Baked potatoes\n" +
                    "Baked Vegetables");
            te.setText("2 oz.\n" +
                    "½ cup\n" +
                    "½ cup");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Halwa (any)");
            twelv.setText("¼  cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==7||finalValue==12||finalValue==16||finalValue==24) &&suffer.equals("bipolar") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Milk Tea \n" +
                    "Rusk");
            tw.setText("1 cup\n" +
                    "2");

            three.setText("12:00 A.M. \n" +
                    "Snack");
            threee.setText("Baked Carrot & Potato Wedges");
            thre.setText("1 cup");

            four.setText("2:30 P.M. \n" +
                    "Lunch");
            fourr.setText("Whole Wheat Chicken Pasta\n" +
                    "White Sauce\n" +
                    "Mint Margarita  ");
            fou.setText("1 cup\n" +
                    "2 tsp.\n" +
                    "1 cup");

            five.setText("3:00 – 4:00 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("4:00 - 5:00 P.M.");
            sixx.setText("Exercise Hour\n" +
                    "(Swimming)\n" +
                    "Mint Water/Lemonade");
            si.setText("1 Hour\n" +
                    "2 cups");

            seven.setText("5:00 P.M.");
            sevenn.setText("Yogurt");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Activity Hour\n" +
                    "(anything of interest)");
            eigh.setText("1 Hour");

            nine.setText("6:00 – 7:00 P.M");
            ninee.setText("Family Time\n" +
                    "(Interact with family & friends)");
            nin.setText("1  Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Cooked Pulses\n" +
                    "Chapatti");
            te.setText("½ cup\n" +
                    "1");

            eleven.setText("9:00-10:00 P.M.");
            elevenn.setText("Screen Time");
            eleve.setText("1 Hour");

            twelve.setText("10:30 P.M.\n" +
                    "Snack");
            twelvee.setText("Rooh Afza in Milk");
            twelv.setText("1  cup");

            thirteen.setText("10:30 – 11:00 P.M.");
            thirteenn.setText("Reading Time");
            thirtee.setText("½ Hour");

            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        //************************adhd***************************//

        if ((finalValue==1||finalValue==9||finalValue==17||finalValue==25) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Sketching/Crafting)\n" +
                    "Water");
            si.setText("1 Hour\n" +
                    "1 cup");

            seven.setText("4:00 P.M.");
            sevenn.setText("Apple Milkshake");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Badminton/Skating)\n" +
                    "Water/Iced Tea ");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            nin.setText("1½ Hour");

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

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==2||finalValue==13||finalValue==21||finalValue==27) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Stamping/Gardening)\n" +
                    "Water");
            si.setText("1 Hour\n" +
                    "1 cup");

            seven.setText("4:00 P.M.");
            sevenn.setText("Red Beans Soup\n" +
                    "Crackers");
            seve.setText("1 cup\n"+"1-2");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Swimming/Cycling)\n" +
                    "Water/Lemonade");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            nin.setText("1½ Hour");

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

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==3||finalValue==8||finalValue==18||finalValue==28) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

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

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Karate/Self Defense)\n" +
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
                    "Whole wheat Chicken Pasta");
            te.setText("1 cup\n" +
                    "1 cup");

            eleven.setText("10:00 P.M.");
            elevenn.setText("Popcorn\n" +
                    "Water (15 minutes before sleeping)");
            eleve.setText("½ cup\n" +
                    "1 cup");

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==4||finalValue==11||finalValue==22||finalValue==15||finalValue==29) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

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

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==5||finalValue==14||finalValue==19||finalValue==26||finalValue==31) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("9 Hours");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Paratha (6”)\n" +
                    "Egg Omelet\n" +
                    "Jam ");
            tw.setText("1\n" +
                    "1\n" +
                    "1 Tbsp");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("French Toast\n" +
                    "Water");
            thre.setText("1\n" +
                    "1 cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Chinese Chicken Gravy\n" +
                    "Chinese Rice");
            fou.setText("1 cup\n" +
                    "1 cup\n" +
                    "¼ cup");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Coloring/Baking)\n" +
                    "Water");
            si.setText("1 Hour\n" +
                    "1 cup");

            seven.setText("4:00 P.M.");
            sevenn.setText("Freshly squeezed \n" +
                    "Orange Juice ");
            seve.setText("2\n" +
                    "1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Horse Riding/Cricket)\n" +
                    "Water/Lemonade");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            nin.setText("1½ Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("WWater (15 minutes before dinner)\n" +
                    "Grilled Fish Cheese Sandwich \n" +
                    "Mayonnaise");
            te.setText("1 cup\n" +
                    "1\n" +
                    "1 tsp");

            eleven.setText("10:00 P.M.");
            elevenn.setText("Warm Milk\n" +
                    "Figs\n" +
                    "Water (15 minutes before sleeping)");
            eleve.setText("1 cup\n" +
                    "6\n" +
                    "1 cup");

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
        if ((finalValue==6||finalValue==20||finalValue==23||finalValue==30) &&suffer.equals("adhd") )
        {
            one.setText("11:00 P.M – 8:00 A.M");
            onee.setText("Sound, distraction-free sleep\n");
            on.setText("1 cup\n" +
                    "¼ cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Cooked Oatmeal\n" +
                    "Topped with berries");
            tw.setText("1 cup\n" +
                    "¼ cup");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Carrot & Baked Potato Sticks \n" +
                    "Water");
            thre.setText("2\n" +
                    "1 cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Mutton Curry\n" +
                    "Chapatti (6”)");
            fou.setText("1 cup\n" +
                    "½ cup\n" +
                    "1\n" +
                    "¼ cup");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Beading Jewellry)\n" +
                    "Water");
            si.setText("1 Hour\n" +
                    "1 cup");

            seven.setText("4:00 P.M.");
            sevenn.setText("Cranberries & Yogurt Smoothie");
            seve.setText("1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Aerobics/Dancing)\n" +
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
                    "Cooked Eggplant\n" +
                    "Chapatti (6”)");
            te.setText("1 cup\n" +
                    "½ cup\n" +
                    "1");

            eleven.setText("10:00 P.M.");
            elevenn.setText("Walnuts & Almonds\n" +
                    "Water (15 minutes before sleeping)");
            eleve.setText("6 each\n" +
                    "1 cup");

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
            on.setText("9 Hours\n" +
                    "1 cup");

            two.setText("8:30 A.M. \n" +
                    "Breakfast");
            twoo.setText("Paratha (6”)\n" +
                    "Fried egg\n" +
                    "Banana Milkshake");
            tw.setText("1\n" +
                    "1\n" +
                    "1 cup");

            three.setText("11:00 A.M. \n" +
                    "Snack");
            threee.setText("Sweet potato & fish cutlets (3”)\n" +
                    "Water");
            thre.setText("2\n" +
                    "1 cup");

            four.setText("1:00 P.M. \n" +
                    "Lunch");
            fourr.setText("Water (15 minutes before lunch)\n" +
                    "Cooked lentils\n" +
                    "Chapatti (6”)\n" +
                    "Yogurt");
            fou.setText("1 cup\n" +
                    "½ cup\n" +
                    "1\n" +
                    "¼ cup");

            five.setText("1:30 – 2:30 P.M ");
            fivee.setText("Rest");
            fiv.setText("1 Hour");

            six.setText("2:30 - 3:30 P.M.");
            sixx.setText("Activity Hour\n" +
                    "(Drawing/Painting)\n" +
                    "Water");
            si.setText("1 Hour\n" +
                    "1 cup");

            seven.setText("4:00 P.M.");
            sevenn.setText("Whole wheat biscuits\n" +
                    "Milk");
            seve.setText("2\n" +
                    "1 cup");

            eight.setText("5:00 – 6:00 P.M.");
            eightt.setText("Sports Hour\n" +
                    "(Football/Basketball/Dancing)\n" +
                    "Water/Lemonade");
            eigh.setText("1 Hour\n" +
                    "2 cups");

            nine.setText("6:30 – 8:00 P.M");
            ninee.setText("Screen time\n" +
                    "(Play video games/Watch cartoons/Use tablet)");
            nin.setText("1½ Hour");

            ten.setText("8:00 P.M.\n" +
                    "Dinner");
            tenn.setText("Water (15 minutes before dinner)\n" +
                    "Chicken curry\n" +
                    "Chapatti (6”)");
            te.setText("1 cup\n" +
                    "½ cup\n" +
                    "1");

            eleven.setText("10:00 P.M.");
            elevenn.setText("Apple (small)\n" +
                    "Almonds\n" +
                    "Water (15 minutes before sleeping)");
            eleve.setText("6 each\n" +
                    "1 cup");

            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);
        }
    }
}
// 1,9,17,25
// 2,13,21,27
// 3,8,18,28
// 4,11,22,15,29
// 5,14,19,26,31
// 6,20,23,30
// 7,12,16,24
