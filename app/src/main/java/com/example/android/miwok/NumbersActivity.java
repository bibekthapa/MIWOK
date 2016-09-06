package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

class NumbersActivity extends AppCompatActivity  {
    int i;
//Adding the Array List member was not working over here. add() method was also not working over here







    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ArrayList implementation in the onCreate method
        ArrayList<String> words=new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight"); words.add("nine");
        words.add("ten");

        Log.i("Numbers Activity","The array is in "+words.get(0));
        Log.i("Numbers Activity","The array is in "+words.get(1));
        Log.i("Numbers Activity","The array is in "+words.get(2));
        Log.i("Numbers Activity","The array is in "+words.get(3));
        Log.i("Numbers Activity","The array is in "+words.get(4));
        Log.i("Numbers Activity","The array is in "+words.get(5)); Log.i("Numbers Activity","The array is in "+words.get(8));
        Log.i("Numbers Activity","The array is in "+words.get(6));
        Log.i("Numbers Activity","The array is in "+words.get(7));





    }
}