package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HOME on 9/17/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words); //0 in middle because the getView will work for us and we donot need resources from ArrayAdapter
        mColorResourceId=colorResourceId;
    }

    //convertView is known as recyclable view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentword = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_madelist, parent, false);


        }


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentword.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentword.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image1);
        //imageView.setImageResource(currentword.getImageResourceId());  // i was forgeeting to associate with currentword; only used getImageResourceId
        // Check if an image is provided for this word or not
        if (currentword.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentword.getImageResourceId());
            // Make sure the view is visible
            //  imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
// Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
