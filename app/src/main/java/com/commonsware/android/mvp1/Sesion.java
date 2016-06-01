package com.commonsware.android.mvp1;

import java.util.List;

//Se trata de una clase Singleton para los feeds en uso.

public class Sesion {
    private static Sesion instance = null;
    protected Sesion() {
    }

    public static Sesion getInstance() {
        if(instance == null) {
            instance = new Sesion();
        }
        return instance;
    }

    private List<Feeds> feeds;
    private List<Categoria> categorias;
    private Feeds selectedFeed;

    public Feeds getSelectedFeed() {
        return selectedFeed;
    }

    public void setSelectedFeed(Feeds selectedFeed) {
        this.selectedFeed = selectedFeed;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Feeds> getFeeds() {
        return feeds;
    }
    public void setFeeds(List<Feeds> feeds) {
        this.feeds = feeds;
    }





}
