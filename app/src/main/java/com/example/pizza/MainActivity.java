package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipiItem> pizzaRecipiItems = new ArrayList<>();
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_1,Until.PIZZA_1_TITLE,Until.PIZZA_1_DESCRIPTION,Until.PIZZA_1_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_2,Until.PIZZA_2_TITLE,Until.PIZZA_2_DESCRIPTION,Until.PIZZA_2_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_3,Until.PIZZA_3_TITLE,Until.PIZZA_3_DESCRIPTION,Until.PIZZA_3_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_4,Until.PIZZA_4_TITLE,Until.PIZZA_4_DESCRIPTION,Until.PIZZA_4_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_5,Until.PIZZA_5_TITLE,Until.PIZZA_5_DESCRIPTION,Until.PIZZA_5_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_6,Until.PIZZA_6_TITLE,Until.PIZZA_6_DESCRIPTION,Until.PIZZA_6_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_7,Until.PIZZA_7_TITLE,Until.PIZZA_7_DESCRIPTION,Until.PIZZA_7_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_8,Until.PIZZA_8_TITLE,Until.PIZZA_8_DESCRIPTION,Until.PIZZA_8_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_9,Until.PIZZA_9_TITLE,Until.PIZZA_9_DESCRIPTION,Until.PIZZA_9_RECIPE));
        pizzaRecipiItems.add(new PizzaRecipiItem(R.drawable.pizza_10,Until.PIZZA_10_TITLE,Until.PIZZA_10_DESCRIPTION,Until.PIZZA_10_RECIPE));


    }
}
