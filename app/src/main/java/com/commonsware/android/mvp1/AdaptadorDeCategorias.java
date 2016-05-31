package com.commonsware.android.mvp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * {@link BaseAdapter} para poblar coches en un grid view
 */

public class AdaptadorDeCategorias extends BaseAdapter {
    private List<Categoria> categorias;
    private Context context;
    public AdaptadorDeCategorias(Context context, List<Categoria> categorias) {
        this.context = context;
        this.categorias = categorias;
    }

    @Override
    public int getCount() {
        return categorias.size();
    }

    @Override
    public Categoria getItem(int position) {
        return categorias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenCategoria = (ImageView) view.findViewById(R.id.imagen_categoria);
        TextView nombreCategoria = (TextView) view.findViewById(R.id.nombre_categoria);
        TextView titularCategoria = (TextView) view.findViewById(R.id.titular_categoria);


        final Categoria item = getItem(position);
        Glide.with(imagenCategoria.getContext())
                .load(item.getIdDrawable())
                .into(imagenCategoria);

        nombreCategoria.setText(item.getNombreCategoria());
        titularCategoria.setText(item.getPrimerosTitulares());
        //view.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT, 900));
        return view;
    }

}