package com.example.android.miwok;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HOME on 9/18/2016.
 */
public class WordAdapterColors extends ArrayAdapter<Word> {





        public WordAdapterColors(ColorsActivity colorsActivity, ArrayList<Word> words) {
            super(colorsActivity,0,words); //0 in middle because the getView will work for us and we donot need resources from ArrayAdapter

        }
        //convertView is known as recyclable view
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Word currentword=getItem(position);
            View listItemView=convertView;

            if(listItemView==null)
            {
                listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);


            }


            TextView defaultTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
            defaultTextView.setText(currentword.getDefaultTranslation());

            TextView miwokTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
            miwokTextView.setText(currentword.getMiwokTranslation());

           
            return listItemView;
        }
    }


