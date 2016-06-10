package com.example.sehwan.origami;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new OriSurfaceView(this));
        list = new ArrayList<String>();
        list.add("Airplane");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        setListAdapter(adapter);


    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String name = "Let's do origmai - "+list.get(position);
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplication(), OriSampleView.class);
        startActivity(intent);
    }
}
