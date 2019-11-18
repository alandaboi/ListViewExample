package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    ArrayList<Player> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        getPlayers();
        MyAdapter myAdapter = new MyAdapter(this, 0, list);
        listView.setAdapter(myAdapter);
    }

    public void getPlayers(){
        String sport[] = new String[] {"golf", "tennis", "badminton", "soccer", "football", "basketball", "competitive gaming", "hockey", "synchronized swimming", "track", "cross country", "gymnastics", "ice hockey", "figure skating", "volleyball"};
        String name[] = new String[] {"Mr. Miro", "Alan", "David", "Alex", "Jimmy", "Sunny", "Jesse", "Ronal", "Colin", "Jarvis", "Cindy", "Cathy", "Hedwig", "Quinn", "Philip"};
        int imageResource[] = new int[] {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o};
        int worth[] = new int[] {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int age[] = new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36};
             list   = new ArrayList<Player>();
        for(int i = 0; i < 15; i++){
            list.add(new Player(name[i],age[i],worth[i], sport[i], imageResource[i]));
        }

    }

}
