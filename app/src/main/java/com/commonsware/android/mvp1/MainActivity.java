/***
  Copyright (c) 2012 CommonsWare, LLC
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.
  
  From _The Busy Coder's Guide to Android Development_
    https://commonsware.com/Android
 */

package com.commonsware.android.mvp1;

import android.app.Activity;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements ViewPager.OnPageChangeListener {

    public static final String VIEW_NAME_HEADER_IMAGE = "imagen_compartida";

  private ViewPager pager=null;
    private int currentPagerState = 2;
    LinearLayout segundoBloque;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
      //Esto es para hacer desaperecer la barra de notificaciones
    getActionBar().hide();
      //Con esto escondo la barra de título de la aplicación

    pager=(ViewPager)findViewById(R.id.pager);
    pager.setAdapter(new SampleAdapter());

    pager.setOffscreenPageLimit(1);
      pager.addOnPageChangeListener(this);
      segundoBloque =(LinearLayout)findViewById(R.id.segundoBloque);
  }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
       Log.d("onPageScrolled position", Integer.toString(currentPagerState));
    }

    @Override
    public void onPageSelected(int position) {

        Log.d("onPageSelected position", Integer.toString(position));
        SampleAdapter adapter = (SampleAdapter) pager.getAdapter();
        adapter.videostart(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        currentPagerState = state;
        Log.d("onPageScrollStateChang", Integer.toString(state));

    }

    public class SampleAdapter extends PagerAdapter {

        ArrayList<VideoView> videosView = new ArrayList<VideoView>();

        public void videostart(int position) {

            this.stopAllVideosLess(position);
            Log.d("VideoStart", Integer.toString(position));
            VideoView vv = videosView.get(position);
            vv.seekTo(0);
            vv.start();
            vv.requestFocus();
        }

        public void stopAllVideosLess(int position){

            for (int i=0; i<videosView.size(); i++){
                if (i != position){
                    Log.d("VideoStop", Integer.toString(i));
                    VideoView vv = videosView.get(i);
                    vv.pause();
                }
            }
        }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View page=
                getLayoutInflater().inflate(R.layout.page, container, false);
        TextView tv=(TextView)page.findViewById(R.id.text);
        VideoView vv=(VideoView)page.findViewById(R.id.videoView);
        TextView tvTitulo=(TextView)page.findViewById(R.id.bodyTitle);
        TextView tvBody=(TextView)page.findViewById(R.id.bodyText);

        addSlideListenerFor(page);




      String videos[] = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
              "http://techslides.com/demos/sample-videos/small.mp4",
              "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
              "http://vid.aullidos.com/videos/space-between-us.mp4",
              "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
              "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
              "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
              "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
              "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
              "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

        String titulos[] = {"Cuál fue el vídeo más visto de kamilion 2016",
                "Así es la nueva app kamilion",
                "Smartphone con pantalla plegable",
                "Nueva convocatoria de talentum",
                "Tres muertos por gas de la risa",
                "España, primer país europeo en estrenar Samsung Pay",
                "Probamos las Gear VR",
                "Paco León: Nos encanta probar cosas nuevas",
                "Solocomedia vuelve",
                "Hungría entra en la Unión Europea",
                "Rescatado un gato tras 24 horas en un arbol"};

        String textos[] = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
                "\n" +
                "Una jornada de convivencia entre un grupo de jóvenes, con la programación  como nexo de unión y el robot FAVORITO como imagen principal, conforman el grosor de una original historia contada por GRUPO KAMILION en poco más de 12 minutos. Este corto que cuenta también con una magnífica fotografía.\n",

                "Hace unos días les contamos los planes que tenía Kamilion de crear contenidos actuales y convertirse en la primera fuente de noticias de sus usuarios, en colaboración con otros medios de comunicación \n" +
                "Pues bien, hoy jueves varios usuarios recibimos la actualización de esta nueva característica llamada KAMILION, en la que podemos visualizar, leer y estar enterados de las noticias más relevantes para distintos medios.\n" +
                "La inclusión de nuevos medios y la posibilidad de crear contenidos propios se acerca cada vez más a la manera en la que Kamilion busca empezar a obtener ganancias. \n",

                "Uno de los conceptos más rompedores de estos últimos años en la tecnología de consumo es el de las pantallas flexibles aplicadas a dispositivos plegables. Aunque se han dado pasos importantes en esta dirección, las pantallas enrollables y totalmente flexibles comerciales son, aún, un sueño. Se ven algunos avances interesantes en esta materia.\n" +
                "La firma Oppo ha desvelado el prototipo de teléfono móvil inteligente que tiene un panel ligeramente flexible que permite plegar el terminal, según desvela el medio chino «MyDrivers», que apunta que el proyecto se inició en agosto del pasado año. El teléfono en cuestión tiene unas 7 pulgadas de pantalla y el chasis incluye unas bisagras para poder doblarse.\n",

                "La media de edad es de 27 años con una importante presencia de mujeres (40%) y perfiles desde bachillerato sin concluir hasta estudios universitarios pero con una alta tasa de tiempo en desempleo aunque todos ellos cuentan con un alto nivel de motivación para desarrollarse como profesionales digitales, según destacan sus impulsores.\n" +
                "En su bienvenida a todos los alumnos, la directora Corporativa de Operaciones en Telefónica Educación Digital, Paloma Barba, ha remarcado \"la satisfacción de poder ofrecer una formación de calidad completamente enfocada a la empleabilidad y a las necesidades que están demandando las empresas\".\n" +
                "Por su parte, el coordinador académico de Talentum Empleo, Antonio Martín, ha incidido en este aspecto señalando que \"se inicia una etapa que puede cambiar vuestras vidas. Van a ser unos meses muy intensos, con una formación muy competitiva y exigente que os ayudará en vuestra inserción en el mundo laboral\".\n",

                "Las Islas Baleares han registrado durante los últimos meses hasta tres casos de fallecimiento por consumo de óxido nitroso adulterado. Así lo ha desvelado la consellera de Salud del Govern, Patricia Gómez, admitiendo que la batalla contra la distribución y consumo del llamado gas de la risa, que parecía ya desterrado, no se ha ganado todavía.\n" +
                "Las tres muertes tuvieron lugar lejos de centros hospitalarios, por lo que desde la Conselleria no podían facilitar más información, aunque a Patricia Gómez le consta que la Guardia Civil sí tiene contabilizados los decesos, atribuidos en todos los casos a un óxido nitroso en mal estado.\n" +
                "Atajar el consumo del gas de la risa será precisamente una de las prioridades que se marcarán de manera conjunta la Conselleria de Salud y la Benemérita en una temporada turística que tiene en especial alerta a los servicios sanitarios de las Islas por las cifras récord de visitantes que se espera recibir en el conjunto del archipiélago.\n" +
                "Y ello, a pesar de que hoy resulta más complicado que nunca para las autoridades actuar contra quienes comercializan esta sustancia, ya que casi todos los casos se están focalizando en webs con sede en Reino Unido. Internet sirve así para publicitar el gas de la risa, pero también para reclutar a jóvenes que quieranganarse un dinero extra con su venta durante su estancia en Magaluf.\n",

                "Samsung ha confirmado este miércoles que su sistema de pagos móviles Samsung Pay estará disponible en España a partir del próximo 2 de junio, siendo éste el primer país europeo en donde se estrene este servicio que promete popularizar una nueva forma de pago.\n" +
                "La firma surcoreana también extenderá este sistema de pagos móviles en las próximas semanas en otras regiones como Reino Unido, adelantándose con ello a otras alternativas como Android Pay o Apple Pay, cuyo desembarco está previsto para este mismo año. Para ello, y a falta de confirmarse nuevos acuerdos durante la presentación oficial de la próxima semana, ya dispone de alianzas con entidades bancarias como CaixaBank o Abanca.\n" +
                "Samsung Pay es un sistema de pagos a través de dispositivos móviles que permite realizar transferencias de manera segura y sencilla en diferentes establecimientos comerciales siempre y cuando dispongan de un terminal de punto de venta (TPV) que soporte la tecnología «contactless» de las tarjetas de crédito y débito. Se trata de una manera cómoda y rápida para pagar en los comercios\n",

                "Samsung ha confirmado este miércoles que su sistema de pagos móviles Samsung Pay estará disponible en España a partir del próximo 2 de junio, siendo éste el primer país europeo en donde se estrene este servicio que promete popularizar una nueva forma de pago.\n" +
                "La firma surcoreana también extenderá este sistema de pagos móviles en las próximas semanas en otras regiones como Reino Unido, adelantándose con ello a otras alternativas como Android Pay o Apple Pay, cuyo desembarco está previsto para este mismo año. Para ello, y a falta de confirmarse nuevos acuerdos durante la presentación oficial de la próxima semana, ya dispone de alianzas con entidades bancarias como CaixaBank o Abanca.\n" +
                "Samsung Pay es un sistema de pagos a través de dispositivos móviles que permite realizar transferencias de manera segura y sencilla en diferentes establecimientos comerciales siempre y cuando dispongan de un terminal de punto de venta (TPV) que soporte la tecnología «contactless» de las tarjetas de crédito y débito. Se trata de una manera cómoda y rápida para pagar en los comercios\n",

                "Samsung ha confirmado este miércoles que su sistema de pagos móviles Samsung Pay estará disponible en España a partir del próximo 2 de junio, siendo éste el primer país europeo en donde se estrene este servicio que promete popularizar una nueva forma de pago.\n" +
                "La firma surcoreana también extenderá este sistema de pagos móviles en las próximas semanas en otras regiones como Reino Unido, adelantándose con ello a otras alternativas como Android Pay o Apple Pay, cuyo desembarco está previsto para este mismo año. Para ello, y a falta de confirmarse nuevos acuerdos durante la presentación oficial de la próxima semana, ya dispone de alianzas con entidades bancarias como CaixaBank o Abanca.\n" +
                "Samsung Pay es un sistema de pagos a través de dispositivos móviles que permite realizar transferencias de manera segura y sencilla en diferentes establecimientos comerciales siempre y cuando dispongan de un terminal de punto de venta (TPV) que soporte la tecnología «contactless» de las tarjetas de crédito y débito. Se trata de una manera cómoda y rápida para pagar en los comercios\n",

                "Samsung ha confirmado este miércoles que su sistema de pagos móviles Samsung Pay estará disponible en España a partir del próximo 2 de junio, siendo éste el primer país europeo en donde se estrene este servicio que promete popularizar una nueva forma de pago.\n" +
                "La firma surcoreana también extenderá este sistema de pagos móviles en las próximas semanas en otras regiones como Reino Unido, adelantándose con ello a otras alternativas como Android Pay o Apple Pay, cuyo desembarco está previsto para este mismo año. Para ello, y a falta de confirmarse nuevos acuerdos durante la presentación oficial de la próxima semana, ya dispone de alianzas con entidades bancarias como CaixaBank o Abanca.\n" +
                "Samsung Pay es un sistema de pagos a través de dispositivos móviles que permite realizar transferencias de manera segura y sencilla en diferentes establecimientos comerciales siempre y cuando dispongan de un terminal de punto de venta (TPV) que soporte la tecnología «contactless» de las tarjetas de crédito y débito. Se trata de una manera cómoda y rápida para pagar en los comercios\n",

                "Samsung ha confirmado este miércoles que su sistema de pagos móviles Samsung Pay estará disponible en España a partir del próximo 2 de junio, siendo éste el primer país europeo en donde se estrene este servicio que promete popularizar una nueva forma de pago.\n" +
                "La firma surcoreana también extenderá este sistema de pagos móviles en las próximas semanas en otras regiones como Reino Unido, adelantándose con ello a otras alternativas como Android Pay o Apple Pay, cuyo desembarco está previsto para este mismo año. Para ello, y a falta de confirmarse nuevos acuerdos durante la presentación oficial de la próxima semana, ya dispone de alianzas con entidades bancarias como CaixaBank o Abanca.\n" +
                "Samsung Pay es un sistema de pagos a través de dispositivos móviles que permite realizar transferencias de manera segura y sencilla en diferentes establecimientos comerciales siempre y cuando dispongan de un terminal de punto de venta (TPV) que soporte la tecnología «contactless» de las tarjetas de crédito y débito. Se trata de una manera cómoda y rápida para pagar en los comercios\n"};


        //Loop de vídeo
        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
              mp.setLooping(true);
          }
        });
        //Para reproducir archivos en streaming, como vídeos de Youtube:

      vv.setVideoURI(Uri.parse(videos[position]));
        videosView.add(position, vv);
      //Para reproducir archivos almacenados en la memoria SDCard:
      //reproductor.setVideoPath("/mnt/sdcard/videoEjemplo.mp4");
        vv.setMediaController(new MediaController(MainActivity.this));

      vv.requestFocus();
      MediaController mc = new MediaController(MainActivity.this);
      mc.setVisibility(View.INVISIBLE);
      vv.setMediaController(mc);


        if (position == 0) {
            vv.start();
        }

        //Esto es para hacer que no aparezcan los controles de vídeo (play, pause, rewind, ff)

//      final String msg=
//        String.format(getString(R.string.item), position + 1);
//        String.format("Isidesma maaaarusma, el vídeo más votado");


        //Feeds feeds = new Feeds(){
        //};

        //tv.setText(feeds.feedItems[1].titularUno[1]);
        tv.setText(titulos[position]);
        //tvTitulo.setText(feeds.feedItems[1].titularUno[1]);
        tvTitulo.setText(titulos[position]);
        tvBody.setText(textos[position]);

/*      tv.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
          Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG)
               .show();
        }
      });*/

        container.addView(page);


      return(page);
    }

    @Override
    public void destroyItem(ViewGroup container, int position,
                            Object object) {
      container.removeView((View) object);
    }

        void addSlideListenerFor(final View page){
            final SlidingUpPanelLayout slidePanel = (SlidingUpPanelLayout)page.findViewById(R.id.sliding_layout);

            slidePanel.setPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
                VideoView vv = (VideoView)page.findViewById(R.id.videoView);

                @Override
                public void onPanelSlide(View panel, float slideOffset) {
                }

                @Override
                public void onPanelCollapsed(View panel) {
                    vv.start();
                }

                @Override
                public void onPanelExpanded(View panel) {
                    vv.pause();
                }

                @Override
                public void onPanelAnchored(View panel) {

                }

                @Override
                public void onPanelHidden(View panel) {

                }
            });


        }

    @Override
    public int getCount() {
      return(10);
    }

    @Override
    public float getPageWidth(int position) {
      return(1f);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
      return(view == object);
    }

  }
}
