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

        Feeds feeds = Sesion.getInstance().getSelectedFeed();

        //Loop de vídeo
        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        //Para reproducir archivos en streaming, como vídeos de Youtube:

      vv.setVideoURI(Uri.parse(feeds.getURLVideo()[position]));
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
        tv.setText(feeds.getTitular()[position]);
        //tvTitulo.setText(feeds.feedItems[1].titularUno[1]);
        tvTitulo.setText(feeds.getTitular()[position]);
        tvBody.setText(feeds.getContenido()[position]);

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
