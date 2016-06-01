package com.commonsware.android.mvp1;

import java.lang.reflect.Array;

//Clase que representa la existencia de feeds y su constructor.

public class Feeds {
    public String[] titular;
    private String[] contenido;
    private String[] urlVideo;

    public Feeds(String[] titular, String[] contenido, String[] urlVideo) {
        this.titular = titular;
        this.contenido = contenido;
        this.urlVideo = urlVideo;
    };

    public String[] getTitular() {
        return titular;
    }

    public String[] getContenido() {
        return contenido;
    }

    public String[] getURLVideo() {
        return urlVideo;
    }

    public int getId() {
        return titular.hashCode();
    }


}




