package com.example.pizza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder>{

    ArrayList<PizzaRecipiItem> pizzaRecipiItems;
    public PizzaRecipeAdapter(ArrayList<PizzaRecipiItem>pizzaRecipiItems){
        this.pizzaRecipiItems = pizzaRecipiItems;
    }

    @NonNull
    @Override
    public PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_recipe_item,parent,false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {

        PizzaRecipiItem pizzaRecipiItem = pizzaRecipiItems.get(position);
        holder.pizzaImageView.setImageResource(pizzaRecipiItem.getImageResource());
        holder.title.setText(pizzaRecipiItem.getTitle());
        holder.description.setText(pizzaRecipiItem.getDescription());



    }

    @Override
    public int getItemCount() {
        return pizzaRecipiItems.size();
    }

    public static class PizzaRecipeViewHolder extends RecyclerView.ViewHolder{
        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;

        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}
