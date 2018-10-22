package com.example.awesomeandrew.dinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton addButton = (ImageButton) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNewDish = new Intent(getApplicationContext(),newDish.class);
                startActivity(toNewDish);
            }
        });
        ImageButton recipeButton = (ImageButton) findViewById(R.id.recipeButton);
        recipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRecipe = new Intent(getApplicationContext(),recipe.class);
                startActivity(toRecipe);
            }
        });
        ImageButton nutrition = (ImageButton) findViewById(R.id.nutritionButton);
        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNutrition = new Intent(getApplicationContext(),nutrition.class);
                startActivity(toNutrition);
            }
        });
        ImageButton groceriesButton = (ImageButton) findViewById(R.id.groceriesButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGroceries = new Intent(getApplicationContext(),groceries.class);
                startActivity(toGroceries);
            }
        });
        ImageButton mealButton = (ImageButton) findViewById(R.id.mealsButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMeals = new Intent(getApplicationContext(),meals.class);
                startActivity(toMeals);
            }
        });
        ImageButton WFDButton = (ImageButton) findViewById(R.id.WFDButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWFD = new Intent(getApplicationContext(),WFD.class);
                startActivity(toWFD);
            }
        });
    }
}
