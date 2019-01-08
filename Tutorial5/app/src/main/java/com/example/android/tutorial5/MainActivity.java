package com.example.android.tutorial5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"가","나","다라","마바사아","a","b","c","d","e","f","g"};
        ListAdapter adpater = new ImageAdapter(this,items);
        ListView listView  =(ListView) findViewById(R.id.listView);
        listView.setAdapter(adpater);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,item,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
