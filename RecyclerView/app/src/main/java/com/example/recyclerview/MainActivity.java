package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] dataSet = {
                "Élément 1",
                "Élément 2",
                "Élément 3",
                "Élément 4",
                "Élément 5",
                "Élément 6",
                "Élément 7",
                "Élément 8",
                "Élément 9",
                "Élément 10",
                "Élément 11",
                "Élément 12",
                "Élément 13",
                "Élément 14",
                "Élément 15",
                "Élément 16",
                "Élément 17",
                "Élément 18",
                "Élément 19",
                "Élément 20"
        };
        CustomAdapter customAdapter = new CustomAdapter(dataSet);
        recyclerView.setAdapter(customAdapter);
    }
}