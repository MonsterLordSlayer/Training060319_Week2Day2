package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CategroryActivity extends AppCompatActivity {
    ArrayList<String> stringArrayList = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categrory);
        populateList();
        listView = findViewById(R.id.lvCate);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.categrory_item, stringArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String) adapterView.getItemAtPosition(i);
                Log.d("wwwwwwut", item);
                Intent intent=new Intent(CategroryActivity.this,AnimalAcitivity.class);
                intent.putExtra("Categrory",item);
                startActivity(intent);

            }
        });



    }
    private void populateList() {
        for(int i = 0 ; i < 10 ; i++) {
            stringArrayList.add("Cate" + i);
        }
    }
}
