package com.example.android.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

/*      display1("This is Box 1.");
        display2("And this is Box 2.");
        display3("And look! Box 3!");*/

/*      int raspberryPrice = 5;
        display1("1 box: $" + raspberryPrice);
        raspberryPrice = 10;
        display2("2 boxes: $" + (raspberryPrice));
        display3("3 boxes: $" + (raspberryPrice * 3));*/

/*      int priceOfOneItem = 5;

        display1("One item costs $" + priceOfOneItem);
        priceOfOneItem = 10;
        display2("Two items cost $" + priceOfOneItem);
        display3("Three items cost $" + (3 * priceOfOneItem));

        display4(10);*/



       /* display1("My first text.");
        display2("And second.");
        display3("And third, finally.");

        int integer;
        int int;
        integer number;

        String currentPlaying = "Pinocchio -- Penguin Prison;
        string currentPlaying = "Fantasy -- Alina Baraz & Galimatias";
        String currentPlaying = "Call Me Up -- Chromeo"*/

        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        display((day1 + day2 + day3) / 3);







    }



    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText("This is an integer input: " + text + "");
    }

    public void display1(String text) {
        display(text);
    }

    public void display4(int text) {
        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }
}


