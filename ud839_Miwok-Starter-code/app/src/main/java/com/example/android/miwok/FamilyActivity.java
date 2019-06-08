package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<com.example.android.miwok.Word>();
        words.add(new com.example.android.miwok.Word("father", "әpә", R.drawable.family_father));
        words.add(new com.example.android.miwok.Word("mother", "әṭa", R.drawable.family_mother));
        words.add(new com.example.android.miwok.Word("son", "angsi", R.drawable.family_son));
        words.add(new com.example.android.miwok.Word("daughter", "tune", R.drawable.family_daughter));
        words.add(new com.example.android.miwok.Word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new com.example.android.miwok.Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new com.example.android.miwok.Word("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new com.example.android.miwok.Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new com.example.android.miwok.Word("grandmother", "ama", R.drawable.family_grandmother));
        words.add(new com.example.android.miwok.Word("grandfather", "paapa", R.drawable.family_grandfather));

        // Create an {@link com.example.android.miwok.WordAdapter}, whose data source is a list of {@link com.example.android.miwok.Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new com.example.android.miwok.WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link com.example.android.miwok.WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link com.example.android.miwok.Word} in the list.
        listView.setAdapter(adapter);
    }
}
