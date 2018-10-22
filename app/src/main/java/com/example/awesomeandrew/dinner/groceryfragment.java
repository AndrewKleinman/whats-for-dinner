package com.example.awesomeandrew.dinner;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

@SuppressLint("ValidFragment")
    public class groceryfragment extends Fragment {
    int i = 0;
    String s;
    @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.groceryitem,container,false);
            return view;
            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        i++;
                        groceryfragment(s,i);
                }
            });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i<=0)
                    groceries.remove(this);
                else
                    groceryfragment(s,i);
            }
        });
        }
        @SuppressLint("ValidFragment")
        groceryfragment(String s, int i){
            TextView textView = (TextView) findViewById(R.id.textView);
            this.i = i;
            this.s = s;
            textView.setText(s+"        "+i+"pieces");

        }


    }
