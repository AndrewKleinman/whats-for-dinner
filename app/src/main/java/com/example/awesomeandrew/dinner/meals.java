package com.example.awesomeandrew.dinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class meals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        ArrayList<Spinner> spinners = new ArrayList<>();
        Spinner s1 = (Spinner) findViewById(R.id.spinner);
        Spinner s2 = (Spinner) findViewById(R.id.spinner3);
        Spinner s3 = (Spinner) findViewById(R.id.spinner4);
        Spinner s4 = (Spinner) findViewById(R.id.spinner5);
        Spinner s5 = (Spinner) findViewById(R.id.spinner6);
        Spinner s6 = (Spinner) findViewById(R.id.spinner7);
        Spinner s7 = (Spinner) findViewById(R.id.spinner8);
        Spinner s8 = (Spinner) findViewById(R.id.spinner9);
        Spinner s9 = (Spinner) findViewById(R.id.spinner10);
        Spinner s10 = (Spinner) findViewById(R.id.spinner11);
        Spinner s11= (Spinner) findViewById(R.id.spinner12);
        Spinner s12= (Spinner) findViewById(R.id.spinner13);
        Spinner s13= (Spinner) findViewById(R.id.spinner14);
        Spinner s14= (Spinner) findViewById(R.id.spinner15);
        Spinner s15= (Spinner) findViewById(R.id.spinner16);
        Spinner s16= (Spinner) findViewById(R.id.spinner17);
        Spinner s17= (Spinner) findViewById(R.id.spinner18);
        Spinner s18= (Spinner) findViewById(R.id.spinner19);
        Spinner s19= (Spinner) findViewById(R.id.spinner20);
        Spinner s20= (Spinner) findViewById(R.id.spinner21);
        Spinner s21= (Spinner) findViewById(R.id.spinner22);
        spinners.add(s1);
        spinners.add(s2);
        spinners.add(s3);
        spinners.add(s4);
        spinners.add(s5);
        spinners.add(s6);
        spinners.add(s7);
        spinners.add(s8);
        spinners.add(s9);
        spinners.add(s10);spinners.add(s20);
        spinners.add(s11);
        spinners.add(s12);
        spinners.add(s13);spinners.add(s21);
        spinners.add(s14);
        spinners.add(s15);
        spinners.add(s16);
        spinners.add(s17);
        spinners.add(s18);
        spinners.add(s19);



int position = 0;
        Bundle extras = getIntent().getExtras();
        if(extras != null)
            position = extras.getInt("position");
       final ArrayList<String> spin = new ArrayList<>();
        do {
           spin.add(handleSendText(getIntent()));
        }while(getIntent()!=null);

        final ArrayAdapter<String> adapt = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                spin
        );
        while(adapt.getItem(position)!=null)
            adapt.getItem(position);

        for(Spinner s: spinners)
        {
            s.setAdapter(adapt);
        }
        for(final Spinner s: spinners)
            s.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v,boolean b) {
                    if(s.getSelectedItem()!=null&&b == false)
                        adapt.remove((String)s.getSelectedItem());
                }
            });
    }

    @Override
    public Intent getIntent() {
        return super.getIntent();
    }

    private String handleSendText(Intent intent) {
        return intent.getStringExtra(Intent.EXTRA_TEXT);
            // Update UI to reflect text being shared
    }
}
