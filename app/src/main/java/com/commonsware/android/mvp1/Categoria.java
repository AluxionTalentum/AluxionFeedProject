package com.commonsware.android.mvp1;

/**
 * Clase que representa la existencia de un Coche
 */

public class Categoria {
    private String categoria;
    private int idDrawable;
    private String primerosTitulares;

    public Categoria(String categoria, int idDrawable, String primerosTitulares) {
        this.categoria = categoria;
        this.idDrawable = idDrawable;
        this.primerosTitulares = primerosTitulares;
    }

    public String getPrimerosTitulares() {
        return primerosTitulares;
    }

    public String getNombreCategoria() {
        return categoria;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return categoria.hashCode();
    }
}
