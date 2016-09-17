package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class NumbersActivity extends AppCompatActivity {
    int i;
//Adding the Array List member was not working over here. add() method was also not working over here


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ArrayList implementation in the onCreate method
        List<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        TextView textView=(TextView)findViewById(R.id.tv1);

        int i=0;
        LinearLayout rootview = (LinearLayout) findViewById(R.id.rootView);

        while(i<words.size())
        {
            TextView tv=new TextView(this);
            tv.setText(words.get(i));
            rootview.addView(tv);
            i++;

        }


    }
}