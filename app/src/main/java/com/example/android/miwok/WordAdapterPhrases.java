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
public class WordAdapterPhrases extends ArrayAdapter<Word> {
    public WordAdapterPhrases(PhrasesActivity phrasesActivity, ArrayList<Word> words) {
        super(phrasesActivity,0,words);
    }

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
