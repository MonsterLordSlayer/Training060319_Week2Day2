package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.week2day2.model.Animal;

import java.util.ArrayList;

public class AnimalAcitivity extends AppCompatActivity {
    ArrayList<Animal> movieList = new ArrayList<>();
    RecyclerView rvMovieRecyclerView;
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


    }

    private void populateAnimalList(String categrory) {


    }

}
