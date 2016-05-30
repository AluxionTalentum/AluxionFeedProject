package com.commonsware.android.mvp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        getActionBar().hide();
        listView = (ListView)findViewById(R.id.lista);

        String listaPaises[] = {"Nacional",
        "Internacional",
        "Deportes",
        "Entretenimiento",
        "Cultura",
        "Corazón",
        "Videojuegos",
        "Televisión",
        "Cine",
        "Música",
        "Tecnología",
        "Turismo",
        "Adultos"};

        final ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        listaPaises);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //parent, es el adaptador que estamos utilizando
            //view, es el componente que lanza el evento
            //position, es la posicion dentro de la listview que hemos pinchado
            //id, el id del elemento pichado
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                String s = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(FeedActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}