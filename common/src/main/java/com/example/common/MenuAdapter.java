package com.example.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private Context context;
    private ArrayList<MenuItem> menuItems;

    public MenuAdapter(Context context,ArrayList<MenuItem> menuItems){
        this.context = context;
        this.menuItems = menuItems;
    }


    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.menu_card,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {

        MenuItem menuItem = menuItems.get(position);
        Glide.with(context).load(menuItem.getImageUrl()).into(holder.imageView);
        holder.description.setText(menuItem.getName());

    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }



    public static class MenuViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private MaterialTextView description;


        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.Card_IMG);
            description = itemView.findViewById(R.id.Card_Description);
        }
    }
}
