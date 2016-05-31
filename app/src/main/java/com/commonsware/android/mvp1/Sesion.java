package com.commonsware.android.mvp1;

import java.util.List;

/**
 * Created by Arranque 1 on 31/05/2016.
 */
public class Sesion {
    private static Sesion instance = null;
    protected Sesion() {
        // Exists only to defeat instantiation.
    }
    public static Sesion getInstance() {
        if(instance == null) {
            instance = new Sesion();
        }
        return instance;
    }

    private Feeds feeds;
    private List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        return categorias;
    }
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Feeds getFeeds() {
        return feeds;
    }
    public void setFeeds(Feeds feeds) {
        this.feeds = feeds;
    }





}
