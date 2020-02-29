package com.example.currentshows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] shows = {"The Mandalorian", "The Good Place", "South Park", "Silicon Valley", "Barry"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> showAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_expandable_list_item_1, shows);

        listView.setAdapter(showAdapter);

        listView.setOnItemClickListener(this);

        //github commit check1234
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToDetailIntent = new Intent(getBaseContext(), ShowDetailActivity.class);
        moveToDetailIntent.putExtra("showName", shows[position]);
        startActivity(moveToDetailIntent);
    }
}
