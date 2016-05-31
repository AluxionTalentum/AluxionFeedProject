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

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends Activity implements AdapterView.OnItemClickListener {

    private GridView gridView;
    private AdaptadorDeCategorias adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MOKFeeds mokFeeds = new MOKFeeds();
        List<Categoria> categorias = mokFeeds.getCategorias();
        Sesion.getInstance().setCategorias(mokFeeds.getCategorias());


        setContentView(R.layout.activity_feed);
        getActionBar().hide();
        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new AdaptadorDeCategorias(this, Sesion.getInstance().getCategorias());
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Coche item = (Coche) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, MainActivity.class);
        //intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());

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