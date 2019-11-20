package com.example.listviewexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    ArrayList<Player> list;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview);
        getPlayers();
        MyAdapter myAdapter = new MyAdapter(this, 0, list);
         gridView.setAdapter(myAdapter);
      /*   MenuInflater inflater = getMenuInflater();
         ContextMenu contextMenu = findViewById(R.id.menu1);
         inflater.inflate(R.menu.menu,contextMenu);
       */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.twocolumn:
                gridView.setNumColumns(2);
                gridView.setColumnWidth(GridView.AUTO_FIT);
                return true;
            case R.id.threecolumn:
                gridView.setNumColumns(3);
                gridView.setColumnWidth(GridView.AUTO_FIT);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void getPlayers(){
        String sport[] = new String[] {"Golf", "Tennis", "Badminton", "Soccer", "Football", "Basketball", "Gaming", "Hockey", "Swimming", "Track", "Cross Country", "Gymnastics", "Ice Hockey", "Figure Skating", "Volleyball"};
        String name[] = new String[] {"Mr. Miro", "Alan", "David", "Alex", "Jimmy", "Sunny", "Jesse", "Ronal", "Colin", "Jarvis", "Cindy", "Cathy", "Hedwig", "Quinn", "Philip"};
        String webpage[] = new String[] {"mirojurisic", "alandaboi", "firestix475", "LexingtonCV16-san", "JimmyRaven", "sunnnnny-cyber", "mgrddsj", "RonalYu", "ColinLiangWJ", "niceTimnice", "Cindy4869", "Cathy1399485071", "ASIA11793", "ZhangRunHui", "pilip11674"};
        int imageResource[] = new int[] {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o};
        int worth[] = new int[] {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int age[] = new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36};
        list   = new ArrayList<Player>();
        for(int i = 0; i < 15; i++){
            list.add(new Player(name[i],age[i],worth[i], sport[i], imageResource[i], webpage[i]));
        }

    }

}
