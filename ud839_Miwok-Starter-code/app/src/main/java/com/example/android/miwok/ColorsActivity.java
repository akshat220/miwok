package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<com.example.android.miwok.Word>();
        words.add(new com.example.android.miwok.Word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new com.example.android.miwok.Word("green", "chokokki", R.drawable.color_green));
        words.add(new com.example.android.miwok.Word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new com.example.android.miwok.Word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new com.example.android.miwok.Word("black", "kululli", R.drawable.color_black));
        words.add(new com.example.android.miwok.Word("white", "kelelli", R.drawable.color_white));
        words.add(new com.example.android.miwok.Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new com.example.android.miwok.Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        // Create an {@link com.example.android.miwok.WordAdapter}, whose data source is a list of {@link com.example.android.miwok.Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new com.example.android.miwok.WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link com.example.android.miwok.WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link com.example.android.miwok.Word} in the list.
        listView.setAdapter(adapter);
    }
}
