package com.example.awesomeandrew.dinner;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class groceries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);

        ArrayList<String> thisList = new ArrayList<>();
        ArrayList<Integer> thisListCount = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        //when new dish sends list of ingredients
        for(String s: list){
            if(thisList.contains(s))
                increment(thisListCount.get((thisList.indexOf(s))));
            else
                thisList.add(s);
        }
        ListView listView = (ListView) findViewById(R.id.listView);
        for(int i = 0; i<list.size();i++)
        {
            groceryfragment g = new groceryfragment(list.get(i), thisListCount.get(i));
            listView.addView((Fragment) g);
        }
    }
    void increment(int i){i++;}

}
