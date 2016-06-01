package com.commonsware.android.mvp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.textservice.SpellCheckerService;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//En esta actividad se muestra la home con un GridView que nos muestra 10 categorías.

public class FeedActivity extends Activity implements AdapterView.OnItemClickListener {

    private GridView gridView;
    private AdaptadorDeCategorias adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Con los siguientes métodos introduzco los datos que voy a necesitar en la clase MOKFeeds.
        MOKFeeds mokFeeds = new MOKFeeds(getResources());
        Sesion.getInstance().setCategorias(mokFeeds.getCategorias());
        Sesion.getInstance().setFeeds(mokFeeds.getArrayFeeds());

        setContentView(R.layout.activity_feed);

        //Con esto escondo la barra de título de la aplicación.
        getActionBar().hide();

        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new AdaptadorDeCategorias(this, Sesion.getInstance().getCategorias());
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Sesion.getInstance().setSelectedFeed(Sesion.getInstance().getFeeds().get(position));
        Intent intent = new Intent(this, MainActivity.class);

        //Con la siguiente condición consigo crear unos efectos diferentes para versiones superiores.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            new Pair<View, String>(view.findViewById(R.id.imagen_categoria),
                                    MainActivity.VIEW_NAME_HEADER_IMAGE)
                    );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
            startActivity(intent);
    }

}