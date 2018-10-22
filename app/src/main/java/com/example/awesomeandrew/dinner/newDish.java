package com.example.awesomeandrew.dinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class newDish extends AppCompatActivity {
int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dish);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
            position = extras.getInt("position");

        final ArrayList spin = new ArrayList();
        ArrayList list = new ArrayList();
        spin.add("milk");
        spin.add("eggs");
        spin.add("bacon");
        spin.add("buns");
        spin.add("meat");

        final TextView ingredient1 = (TextView) findViewById(R.id.editText3);
        final Spinner ingredient2 = (Spinner) findViewById(R.id.editText4);
        final Spinner ingredient3 = (Spinner) findViewById(R.id.editText5);
        final Spinner ingredient4 = (Spinner) findViewById(R.id.editText6);
        final Spinner ingredient5 = (Spinner) findViewById(R.id.editText7);
        final Spinner ingredient6 = (Spinner) findViewById(R.id.editText8);
        final Spinner ingredient7 = (Spinner) findViewById(R.id.editText9);
        final Spinner ingredient8 = (Spinner) findViewById(R.id.editText10);
        final Spinner ingredient9 = (Spinner) findViewById(R.id.editText11);
        final Spinner ingredient10 = (Spinner) findViewById(R.id.editText12);
        if(ingredient1 != null)
            list.add(ingredient1.getText());
        if(ingredient2 != null)
            list.add(ingredient2.getSelectedItem());
        if(ingredient3 != null)
            list.add(ingredient3.getSelectedItem());
        if(ingredient4 != null)
            list.add(ingredient4.getSelectedItem());
        if(ingredient5 != null)
            list.add(ingredient5.getSelectedItem());
        if(ingredient6 != null)
            list.add(ingredient6.getSelectedItem());
        if(ingredient7 != null)
            list.add(ingredient7.getSelectedItem());
        if(ingredient8 != null)
            list.add(ingredient8.getSelectedItem());
        if(ingredient9 != null)
            list.add(ingredient9.getSelectedItem());
        if(ingredient10 != null)
            list.add(ingredient10.getSelectedItem());

        final ArrayList previousRecipes = new ArrayList();

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dishimageintent = new Intent();
                dishimageintent.setType("image/*");
                dishimageintent.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(
                        Intent.createChooser(dishimageintent, "Select Dish Image"), 1);
            }
        });

        final EditText dishName = (EditText) findViewById(R.id.dishName);
        dishName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if(previousRecipes.contains(dishName.getText())){
                dishName.setError("Already exists");
            }
        }});
        ingredient1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(ingredient1.getText()!=null){
                    spin.add(ingredient1.getText());
                }
            }});
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                spin
        );
        ingredient2.setAdapter(adapt);
        ingredient3.setAdapter(adapt);
        ingredient4.setAdapter(adapt);
        ingredient5.setAdapter(adapt);
        ingredient6.setAdapter(adapt);
        ingredient7.setAdapter(adapt);
        ingredient8.setAdapter(adapt);
        ingredient9.setAdapter(adapt);
        ingredient10.setAdapter(adapt);

        Button save =  (Button) findViewById(R.id.saveButton);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView nutritionvalue = (TextView) findViewById(R.id.editText2);
                Intent intent = new Intent(getApplicationContext(),recipe.class);
                intent.putExtra("1",dishName.getText());
                intent.putExtra("2", ingredient1.getText());
                intent.putExtra("3",(String) ingredient2.getSelectedItem());
                intent.putExtra("4", (String)ingredient3.getSelectedItem());
                intent.putExtra("5", (String)ingredient4.getSelectedItem());
                intent.putExtra("6",(String) ingredient5.getSelectedItem());
                intent.putExtra("7",(String) ingredient6.getSelectedItem());
                intent.putExtra("8", (String)ingredient7.getSelectedItem());
                intent.putExtra("9",(String) ingredient8.getSelectedItem());
                intent.putExtra("10",(String) ingredient9.getSelectedItem());
                intent.putExtra("11",(String) ingredient10.getSelectedItem());
                intent.putExtra("12",(String)nutritionvalue.getText());

            }
        });


    }

}
