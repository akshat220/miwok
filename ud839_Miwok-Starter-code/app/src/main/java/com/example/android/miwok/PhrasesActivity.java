package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<com.example.android.miwok.Word>();
        words.add(new com.example.android.miwok.Word("Where are you going?", "minto wuksus"));
        words.add(new com.example.android.miwok.Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new com.example.android.miwok.Word("My name is...", "oyaaset..."));
        words.add(new com.example.android.miwok.Word("How are you feeling?", "michәksәs?"));
        words.add(new com.example.android.miwok.Word("I’m feeling good.", "kuchi achit"));
        words.add(new com.example.android.miwok.Word("Are you coming?", "әәnәs'aa?"));
        words.add(new com.example.android.miwok.Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new com.example.android.miwok.Word("I’m coming.", "әәnәm"));
        words.add(new com.example.android.miwok.Word("Let’s go.", "yoowutis"));
        words.add(new com.example.android.miwok.Word("Come here.", "әnni'nem"));

        // Create an {@link com.example.android.miwok.WordAdapter}, whose data source is a list of {@link com.example.android.miwok.Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new com.example.android.miwok.WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link com.example.android.miwok.WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link com.example.android.miwok.Word} in the list.
        listView.setAdapter(adapter);
    }
}
