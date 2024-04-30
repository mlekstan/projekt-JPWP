package com.example.shop_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyNewAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<CarModel> items;

    public MyNewAdapter(Context context, List<CarModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.model.setText(items.get(position).getModel() + " " + items.get(position).getBrand());
        holder.yearOfProduction.setText(items.get(position).getYearOfProduction());
        holder.price.setText(items.get(position).getPrice());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
