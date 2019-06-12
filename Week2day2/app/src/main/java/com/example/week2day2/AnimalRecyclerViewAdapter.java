package com.example.week2day2;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week2day2.model.Animal;

import java.util.ArrayList;
public class AnimalRecyclerViewAdapter extends RecyclerView.Adapter<AnimalRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Animal> animalList;
    private AnimalAcitivity instance_of_animallist;


    public void setInstance_of_animallist(AnimalAcitivity instance){
        this.instance_of_animallist=instance;
    }
    public AnimalRecyclerViewAdapter(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.animal_item, parent, false);
        //ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Animal itemsAnimal = animalList.get(position);
        holder.tvName.setText(itemsAnimal.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(instance_of_animallist,DetailActivity.class);
                intent.putExtra("Description",itemsAnimal.getName()+":    "+itemsAnimal.getDescription());
                instance_of_animallist.startActivity(intent);

            }
        });
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return animalList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);

        }
    }
}
