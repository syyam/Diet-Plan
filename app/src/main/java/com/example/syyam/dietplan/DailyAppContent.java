package com.example.syyam.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DailyAppContent extends AppCompatActivity {

    private Intent Sintent;
    private String suffer;
    private String plan;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_app_content);

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

        Sintent = getIntent();
        suffer = Sintent.getStringExtra("suffer");
        plan = Sintent.getStringExtra("plan");

        if (suffer.equals("adhd") && plan.equals("diet")) {
            one.setText("8:05 AM");
            onee.setText("Water");
            two.setText("8:30 AM");
            twoo.setText("Breakfast (Eggs/cornflakes/toasts etc with milk/juices) ");
            three.setText("10:30 AM");
            threee.setText("Water");
            four.setText("11:30 AM");
            fourr.setText("Snacks ( light foods such as sandwiches /fruits/nuggets etc with water/juices/milkshakes)");
            five.setText("1:00 PM");
            fivee.setText("Lunch (vegetables esp. folic rich vegetables e.g.  spinach etc or protein rich foods such as eggs, chicken, beef etc)\n" +
                    "Water");
            six.setText("3:45 PM");
            sixx.setText("Water");
            seven.setText("4:00 PM");
            sevenn.setText("Snacks (Juices/milkshakes/fruits or light food)");
            eight.setText("8:30 PM");
            eightt.setText("Water (15 minutes before dinner)\n" +
                    "Dinner (vegetables esp. folic rich vegetables e.g.  spinach etc or protein rich foods such as eggs, chicken, beef etc)\n" +
                    "Water");

            nine.setText("10:00 PM");
            ninee.setText("Snacks ( fruits or add-ons like almonds, chocolate etc )");
            ten.setText("10:45 PM");
            tenn.setText("Water");

            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }

        if (suffer.equals("bipolar") && plan.equals("diet")) {
            one.setText("8:35 AM");
            onee.setText("Water");
            two.setText("9:30 AM");
            twoo.setText("Breakfast (Eggs/cornflakes/toasts etc with milk/juices) ");
            three.setText("10:30 AM");
            threee.setText("Water");
            four.setText("12:00 PM");
            fourr.setText("Snacks ( light foods such as sandwich/fruits/peanuts/walnuts/salads)");
            five.setText("2:00 PM");
            fivee.setText("Lunch (vegetables/lentils/ chicken/ fish etc )\n" +
                    "Water");
            six.setText("4:30 PM");
            sixx.setText("Snacks ");
            seven.setText("9:00 PM");
            sevenn.setText("Water (15 minutes before dinner)\n" +
                    "Dinner (vegetables/lentils/chicken/beef/ fish etc )\n" +
                    "Water");
            eight.setText("11:00 PM");
            eightt.setText("Snacks ( fruits/ice-creams/chocolates etc)");
            nine.setText("10:45 PM");
            ninee.setText("Water");


            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("depression") && plan.equals("diet")) {
            one.setText("8:05 AM");
            onee.setText("Water");
            two.setText("9:30 AM");
            twoo.setText("Breakfast (Eggs/milk/juice/butter etc) ");
            three.setText("10:30 AM");
            threee.setText("Water");
            four.setText("12:00 PM");
            fourr.setText("Snacks ( juice/milkshake/smoothie/salad/green tea etc)");
            five.setText("2:30 PM");
            fivee.setText("Lunch (vegetables/lentils/ chicken/ fish, vitamin C and D rich foods etc )\n" +
                    "Water");
            six.setText("5:30 PM");
            sixx.setText("Snacks ( juice/milkshake/smoothie/salad/green tea etc) ");
            seven.setText("8:00 PM");
            sevenn.setText("Dinner (vegetables/lentils/ chicken/ fish, vitamin C and D rich foods etc )\n" +
                    "Water");
            eight.setText("10:30 PM");
            eightt.setText("Snacks ( juice/milkshake/smoothie/salad/green tea etc)");

            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("ocd") && plan.equals("diet")) {
            one.setText("8:00 AM");
            onee.setText("Water");
            two.setText("8:30 AM");
            twoo.setText("Breakfast (cereals/yoghurt/milk/cheese/butter etc) ");
            three.setText("11:00 AM");
            threee.setText("Snacks(light foods/fruits/salads/juices/milk shakes)");
            four.setText("1:00 PM");
            fourr.setText("Lunch (lentils/pulses/green leafy vegetables/sea vegetables/chicken/beef/fish)");
            five.setText("8:30 PM");
            fivee.setText("Dinner (lentils/pulses/green leafy vegetables/sea vegetables/chicken/beef/fish)");
            six.setText("5:30 PM");
            sixx.setText("Snacks ( juice/milkshake/smoothie/salad/green tea etc) ");
            seven.setText("10:30 PM");
            sevenn.setText("Dinner (vegetables/lentils/ chicken/ fish, vitamin C and D rich foods etc )\n" +
                    "Water");

            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("panic") && plan.equals("diet")) {
            one.setText("8:30 A.M.");
            onee.setText("Barley products/cereals/cheese/yoghurt/milk/");
            two.setText("12:00 A.M.");
            twoo.setText("Milk/Juice/milkshakes/tea/fruits(esp. berries)/nuts ");
            three.setText("2:30 P.M.");
            threee.setText("Fish/meet/brown rice/cooked vegetables/baked potatoes ");
            four.setText("4:00 P.M.");
            fourr.setText("Milk/Juice/milkshakes/tea(esp. green and ginger)/fruits(esp. berries)/nuts");
            five.setText("8:00 P.M.");
            fivee.setText("Fish/meet/brown rice/cooked vegetables/baked potatoes ");
            six.setText("10:30 P.M.");
            sixx.setText("Milk/Juice/milkshakes/tea(esp. green and ginger)/fruits(esp. berries)/nuts ");

            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("schezo") && plan.equals("diet")) {
            one.setText("8:00 AM");
            onee.setText("Water");
            two.setText("9:00 AM");
            twoo.setText("Normal breakfast (including egg/smilk/yoghurt/cheese/cereals etc)");
            three.setText("12:00 AM");
            threee.setText("Light food such as Fruit juices/fruits/nuts");
            four.setText("2:00 PM");
            fourr.setText("Meat/seafood/leafy vegetables/niacin rich food/bean etc");
            five.setText("5:00 PM");
            fivee.setText("Light food such as Fruit juices/fruits/nuts");
            six.setText("8:30 PM");
            sixx.setText("Meat/seafood/leafy vegetables/niacin rich food/bean etc ");
            seven.setText("10:00 PM");
            sevenn.setText("Fruit juices/fruits/nuts \n" +
                    "Water (15 minutes before sleeping)");

            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }

        if (suffer.equals("adhd") && plan.equals("excercise")) {
            one.setText("5:00 - 6:00 PM");
            onee.setText("Exercise/Sports Hour  (go to" +
                    " gym or do light exercises" +
                    " at home or play any sports \n" +
                    "Water/juice/milkshakes");

            twooo.setVisibility(View.GONE);
            threeee.setVisibility(View.GONE);
            fourrr.setVisibility(View.GONE);
            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("bipolar") && plan.equals("excercise")) {
            one.setText("5:00 - 6:30 PM");
            onee.setText("Exercise/Sports Hour \nWater/juice/milkshakes");


            twooo.setVisibility(View.GONE);
            threeee.setVisibility(View.GONE);
            fourrr.setVisibility(View.GONE);
            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("depression") && plan.equals("excercise")) {
            one.setText("4:00 - 5:00 PM");
            onee.setText("Exercise Hour(gym/meditation etc)\n" +
                    "Mint/juice/milkshake/water");

            twooo.setVisibility(View.GONE);
            threeee.setVisibility(View.GONE);
            fourrr.setVisibility(View.GONE);
            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }

        if (suffer.equals("ocd") && plan.equals("excercise")) {
            one.setText("5:00 - 6:00 PM");
            onee.setText("Exercise/Sports Hour");


            twooo.setVisibility(View.GONE);
            threeee.setVisibility(View.GONE);
            fourrr.setVisibility(View.GONE);
            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("panic") && plan.equals("excercise")) {
            one.setText("3:00 - 4:00 PM");
            onee.setText("Exercise Hour \n(Gym/yoga/walking/cycling etc)");
            two.setText("9:00 PM");
            twoo.setText("Breathing Excercise");

            threeee.setVisibility(View.GONE);
            fourrr.setVisibility(View.GONE);
            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("schezo") && plan.equals("excercise")) {
            one.setText("6:00 - 7:00 PM");
            onee.setText("Exercise/sports Hour\n" +
                    "Water/Tea ");

            twooo.setVisibility(View.GONE);
            threeee.setVisibility(View.GONE);
            fourrr.setVisibility(View.GONE);
            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }

        if (suffer.equals("adhd") && plan.equals("lifestyle")) {
            one.setText("11:00 PM - 8 AM");
            onee.setText("Sleep (8-9 hours)");
            two.setText("1:30 PM - 2:30 PM");
            twoo.setText("Nap");
            three.setText("2:30 PM - 3:30 PM");
            threee.setText("Nap");
            four.setText("6:30 PM - 8:00 PM");
            fourr.setText("Learn new stuff (e.g. read, try a new app\n, learn programming etc of your interest)");

            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);


        }
        if (suffer.equals("bipolar") && plan.equals("lifestyle")) {
            one.setText("11:30 PM - 8:30 AM");
            onee.setText("Sleep (8-9 hours)");
            two.setText("2:30 PM - 3:30 PM");
            twoo.setText("Apps and games designed specially to reduce disorder ");
            three.setText("3:30 PM - 4:30 PM ");
            threee.setText("Activity Hour (Activities of interest e.g. painting/sketching/reading/writing etc)\n");
            four.setText("6:30 PM - 7:30 PM");
            fourr.setText("Family Interaction Hour");

            fiveee.setVisibility(View.GONE);
            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("depression")&&plan.equals("lifestyle"))
        {
            one.setText("11:30 PM - 8:30 AM");
            onee.setText("Sleep (8-9 hours)");
            two.setText("3:00 PM - 4:00 PM");
            twoo.setText("Rest");
            three.setText("5:00 PM - 6:30 PM");
            threee.setText("Depression alleviating hour ( listen to music/ watch comedy shows, write a journal etc)");
            four.setText("6:30 PM - 7:30 PM");
            fourr.setText("Family Interaction Hour");
            five.setText("9:00 PM - 10:00 PM");
            fivee.setText("Depression alleviating hour ( listen to music/ watch comedy shows, write a journal etc)");
            six.setText("10:30 PM - 11:00 PM");
            sixx.setText("Reading time");

            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("ocd")&&plan.equals("lifestyle"))
        {
            one.setText("11:00 PM - 8:00 AM");
            onee.setText("Sleep (8-9 hours)");
            two.setText("2:30 PM - 3:30 PM");
            twoo.setText("Activity Hour (doing activities of interest)");
            three.setText("4:00 PM");
            threee.setText("Snacks(light foods/fruits/salads/juices/milk shakes) ");
            four.setText("6:30 PM - 8:30 PM");
            fourr.setText("Intellectual games time");
            five.setText("9:00 PM - 10:00 PM");
            fivee.setText("Family Interaction Hour");
            six.setText("10:30 PM - 11:00 PM");
            sixx.setText("Reading time");

            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("panic")&&plan.equals("lifestyle"))
        {
            one.setText("11:00 PM - 8:00 AM");
            onee.setText("Sound, distraction-free sleep");
            two.setText("5:00 PM - 6:00 PM");
            twoo.setText("Activity Hour (Learn something new of choice)");
            three.setText("5:00 PM - 6:00 PM");
            threee.setText("Laughing Time (Watch a comedy series/movies/read jokes etc)");
            four.setText("6:30 PM - 8:30 PM");
            fourr.setText("Intellectual games time");
            five.setText("6:00 PM - 7:00 PM");
            fivee.setText("Family Time (Interact with family & friends)");
            six.setText("10:30 PM - 11:00 PM");
            sixx.setText("Reading/Writing Time (Read a favorite book or keep a journal)");

            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
        if (suffer.equals("schezo")&&plan.equals("lifestyle"))
        {
            one.setText("11:00 PM - 8:00 AM");
            onee.setText("Sound, distraction-free sleep");
            two.setText("2:00 PM – 3:00 PM");
            twoo.setText("Activity Hour (Chess)");
            three.setText("3:30 PM - 4:30 PM");
            threee.setText("Nap");
            four.setText("7:00 PM - 8:00 PM");
            fourr.setText("Interaction time");
            five.setText("9:30 PM - 10:00 PM");
            fivee.setText("Reading Time)");

            sixxx.setVisibility(View.GONE);
            sevennn.setVisibility(View.GONE);
            eighttt.setVisibility(View.GONE);
            nineeee.setVisibility(View.GONE);
            tennn.setVisibility(View.GONE);
            elevennn.setVisibility(View.GONE);
            twelveee.setVisibility(View.GONE);
            thirteennn.setVisibility(View.GONE);
            fourteennn.setVisibility(View.GONE);
            fifteennn.setVisibility(View.GONE);

        }
    }
}
