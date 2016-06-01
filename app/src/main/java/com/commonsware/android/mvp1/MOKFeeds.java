package com.commonsware.android.mvp1;

import android.content.res.Resources;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//En esta clase se mockea la información que llega a través de un Json para poder parsear
//cualquier feed.

public class MOKFeeds {

    public ArrayList<Feeds> getArrayFeeds() {
        return arrayFeeds;
    }

    private ArrayList<Feeds> arrayFeeds;

        public MOKFeeds(Resources resources)  {

            //Con este try y catch creamos las categorías con elementos que necesitamos del Json.
                try {
                      String jsonString = playWithRawFiles(resources);

                        arrayFeeds = new ArrayList<Feeds>();
                        parseJSON(jsonString);

                        String title0 = this.arrayFeeds.get(0).getTitular()[0];
                        String title1 = this.arrayFeeds.get(1).getTitular()[0];
                        String title2 = this.arrayFeeds.get(2).getTitular()[0];
                        String title3 = this.arrayFeeds.get(3).getTitular()[0];
                        String title4 = this.arrayFeeds.get(4).getTitular()[0];
                        String title5 = this.arrayFeeds.get(5).getTitular()[0];
                        String title6 = this.arrayFeeds.get(6).getTitular()[0];
                        String title7 = this.arrayFeeds.get(7).getTitular()[0];

                        this.createCategories(title0, title1, title2, title3, title4, title5, title6, title7);

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }


    //Con las siguientes dos funciones le indicaremos cúal es el Json y lo guardaremos en una array.
        public String playWithRawFiles(Resources resources) throws IOException {
                String str="";
                StringBuffer buf = new StringBuffer();
                InputStream is = resources.openRawResource(R.raw.feedsdata);
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                if (is!=null) {
                        while ((str = reader.readLine()) != null) {
                                buf.append(str);
                        }
                }
                is.close();

                return buf.toString();
        }
        public void parseJSON(String jsonString) throws JSONException {
                JSONObject obj = new JSONObject(jsonString);
                JSONArray feedsArray = obj.getJSONArray("feeds");

                for (int i=0;i < feedsArray.length();i++) {
                     JSONObject feed = feedsArray.getJSONObject(i);
                     JSONArray titular =  feed.getJSONArray("titular");

                     String[] titulares = new String[titular.length()];
                        for (int j=0;j < titular.length();j++) {
                                titulares[j] = titular.getString(j);
                        }

                     JSONArray videos =  feed.getJSONArray("videos");
                        String[] videosStringArray = new String[videos.length()];

                        for (int j=0;j < videos.length();j++) {
                                videosStringArray[j] = videos.getString(j);
                        }

                        JSONArray contenido =  feed.getJSONArray("contenido");
                        String[] contenidoStringArray = new String[contenido.length()];

                        for (int j=0;j < contenido.length();j++) {
                                contenidoStringArray[j] = contenido.getString(j);
                        }

                        Feeds feeds = new Feeds(titulares, contenidoStringArray,videosStringArray);
                        arrayFeeds.add(feeds);
                }
        }

    //Esta función es aquella a la que llama el try y catch para crear las categorías.
        public void createCategories(String title, String title1, String title2, String title3, String title4, String title5, String title6, String title7) {

                Categoria cat1 = new Categoria("Tecnología", R.drawable.tecnologia, title);
                Categoria cat2 = new Categoria("Cultura", R.drawable.cultura, title1);
                Categoria cat3 = new Categoria("Deportes", R.drawable.deportes, title2);
                Categoria cat4 = new Categoria("Moda", R.drawable.moda, title3);
                Categoria cat5 = new Categoria("Política", R.drawable.politica, title4);
                Categoria cat6 = new Categoria("Ciencia", R.drawable.ciencia, title5);
                Categoria cat7 = new Categoria("Entretenimiento", R.drawable.entretenimiento, title6);
                Categoria cat8 = new Categoria("Economía", R.drawable.economia, title7);
                this.categorias = Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8);
        }

    public List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        return categorias;
    }
}
