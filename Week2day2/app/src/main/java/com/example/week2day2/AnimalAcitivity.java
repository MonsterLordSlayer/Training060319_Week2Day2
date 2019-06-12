package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.week2day2.model.Animal;

import java.util.ArrayList;

public class AnimalAcitivity extends AppCompatActivity {
    ArrayList<Animal> animalList = new ArrayList<>();
    RecyclerView rvAnimalRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_acitivity);
        String categrory=getIntent().getStringExtra("Categrory");
        Log.d("boiiiiiiii", "onCreate: "+categrory);
        populateAnimalList(categrory);
        initializeRecyclerView();
    }
    private void initializeRecyclerView() {

        rvAnimalRecyclerView=findViewById(R.id.rvAnimalRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        AnimalRecyclerViewAdapter animalRecyclerViewAdapter = new AnimalRecyclerViewAdapter(animalList);
        animalRecyclerViewAdapter.setInstance_of_animallist(this);
        rvAnimalRecyclerView.setLayoutManager(layoutManager);
        rvAnimalRecyclerView.setAdapter(animalRecyclerViewAdapter);
    }

    private void populateAnimalList(String categrory) {

        ArrayList<Animal> animalListtemp = new ArrayList<>();
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));
        animalListtemp.add(new Animal("tiger1","Cate1","kitty boi"));

        animalListtemp.add(new Animal("tiger2","Cate2","kitty boi"));
        animalListtemp.add(new Animal("tiger3","Cate3","kitty boi"));
        animalListtemp.add(new Animal("tiger4","Cate4","kitty boi"));
        animalListtemp.add(new Animal("tiger5","Cate5","kitty boi"));
        animalListtemp.add(new Animal("tiger6","Cate6","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));
        animalListtemp.add(new Animal("tiger7","Cate7","kitty boi"));

        animalListtemp.add(new Animal("tiger8","Cate8","kitty boi"));
        animalListtemp.add(new Animal("tiger9","Cate9","kitty boi"));

        for (Animal a:animalListtemp){
            Log.d("inpopulate start ", categrory+" "+a.getCategrory());


            if((a.getCategrory().equals(categrory))){
                animalList.add(a);
            }

        }


    }

}
