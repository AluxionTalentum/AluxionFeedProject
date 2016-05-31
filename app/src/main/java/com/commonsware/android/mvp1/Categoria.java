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


    public static Categoria[] ITEMS = {
            new Categoria("Internacional", R.drawable.mercurio_np, "Cuál fue el vídeo más visto de kamilion 2016"),
            new Categoria("Deportes", R.drawable.venus, "Así es la nueva app kamilion"),
            new Categoria("Entretenimiento", R.drawable.tierra, "Smartphone con pantalla plegable"),
            new Categoria("Cultura", R.drawable.marte, "Nueva convocatoria de talentum"),
            new Categoria("Corazón", R.drawable.jupiter, "Tres muertos por gas de la risa"),
            new Categoria("Videojuegos", R.drawable.saturno, "España, primer país europeo en estrenar Samsung Pay"),
            new Categoria("Televisión", R.drawable.urano, "Paco León: Nos encanta probar cosas nuevas"),
            new Categoria("Tecnología", R.drawable.neptuno, "Probamos las Gear VR")

    };
/*    Feeds feeds;
    public Categoria[] itemsDos = {
            new Categoria("Internacional", R.drawable.mercurio_np, feeds.feedItems[1].titularUno[1]),
            new Categoria("Deportes", R.drawable.venus, feeds.feedItems[2].titularDos[1]),
            new Categoria("Entretenimiento", R.drawable.tierra, feeds.feedItems[3].titularTres[1]),
            new Categoria("Cultura", R.drawable.marte, feeds.feedItems[4].titularCuatro[1]),
            new Categoria("Corazón", R.drawable.jupiter, feeds.feedItems[5].titularCinco[1]),
            new Categoria("Videojuegos", R.drawable.saturno, feeds.feedItems[6].titularSeis[1]),
            new Categoria("Televisión", R.drawable.urano, feeds.feedItems[7].titularSiete[1]),
            new Categoria("Tecnología", R.drawable.neptuno, feeds.feedItems[8].titularOcho[1])
    };*/

    public static Categoria getItem(int id) {
        for (Categoria item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}
