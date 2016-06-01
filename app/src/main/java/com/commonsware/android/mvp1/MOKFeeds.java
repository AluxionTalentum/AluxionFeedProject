package com.commonsware.android.mvp1;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Arranque 1 on 31/05/2016.
 */
public class MOKFeeds {

        public List<Feeds> getFeeds() {
                return feeds;
        }

        private List<Feeds> feeds;

        public MOKFeeds(){

                this.createFeeds();

                String title0 = this.feeds.get(0).getTitular()[0];
                String title1 = this.feeds.get(1).getTitular()[0];
                String title2 = this.feeds.get(2).getTitular()[0];
                String title3 = this.feeds.get(3).getTitular()[0];
                String title4 = this.feeds.get(4).getTitular()[0];
                String title5 = this.feeds.get(5).getTitular()[0];
                String title6 = this.feeds.get(6).getTitular()[0];
                String title7 = this.feeds.get(7).getTitular()[0];

                this.createCategories(title0,title1,title2,title3,title4,title5,title6,title7);

        };

        public void createCategories(String title, String title1, String title2, String title3, String title4, String title5, String title6, String title7) {

                Categoria cat1 = new Categoria("Cultura", R.drawable.mercurio_np, title);
                Categoria cat2 = new Categoria("Tecnología", R.drawable.venus, title1);
                Categoria cat3 = new Categoria("Deportes", R.drawable.tierra, title2);
                Categoria cat4 = new Categoria("Moda", R.drawable.marte, title3);
                Categoria cat5 = new Categoria("Política", R.drawable.jupiter, title4);
                Categoria cat6 = new Categoria("Ciencia", R.drawable.saturno, title5);
                Categoria cat7 = new Categoria("Entretenimiento", R.drawable.urano, title6);
                Categoria cat8 = new Categoria("Economía", R.drawable.neptuno, title7);

                this.categorias = Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8);
        }

    public List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        return categorias;
    }

        private void createFeeds() {

            Feeds feed1 =  new Feeds(this.titularUno,
                    this.contenidoUno,
                    this.videosUno);
                Feeds feed2 =  new Feeds(this.titularDos,
                        this.contenidoDos,
                        this.videosDos);
                Feeds feed3 =  new Feeds(this.titularTres,
                        this.contenidoTres,
                        this.videosTres);
                Feeds feed4 =  new Feeds(this.titularCuatro,
                        this.contenidoCuatro,
                        this.videosCuatro);
                Feeds feed5 =  new Feeds(this.titularCinco,
                        this.contenidoCinco,
                        this.videosCinco);
                Feeds feed6 =  new Feeds(this.titularSeis,
                        this.contenidoSeis,
                        this.videosSeis);
                Feeds feed7 =  new Feeds(this.titularSiete,
                        this.contenidoSiete,
                        this.videosSiete);
                Feeds feed8 =  new Feeds(this.titularOcho,
                        this.contenidoOcho,
                        this.videosOcho);

                this.feeds = Arrays.asList(feed1, feed2, feed3, feed4, feed5, feed6, feed7, feed8);
        }

    String[] videosUno = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

        String[] titularUno = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoUno = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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



    String[] videosDos = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularDos = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoDos = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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


    String[] videosTres = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularTres = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoTres = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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


    String[] videosCuatro = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularCuatro = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoCuatro = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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



    String[] videosCinco = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularCinco = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoCinco = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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



    String[] videosSeis = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularSeis = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoSeis = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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



    String[] videosSiete = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularSiete = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoSiete = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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


    String[] videosOcho = {"http://vid.aullidos.com/videos/uncharted-4-cara-cruz.mp4",
            "http://techslides.com/demos/sample-videos/small.mp4",
            "https://archive.org/download/FinalCutKing3_201509/Final%20Cut%20King_3.MP4",
            "http://vid.aullidos.com/videos/space-between-us.mp4",
            "http://vid.aullidos.com/videos/juego-tronos-temporada-6-2.mp4",
            "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
            "https://amp.twimg.com/prod/multibr_v_1/video/2016/05/18/12/732907236788297729-libx264-main-2028k.mp4?2Eu39jroGna20GHIntAZFE6n9YE77OgJH2BTsTXl9m0%3D",
            "https://blzadeu-a.akamaihd.net/banners/mpu/0416_ow/launch/962x250_ES.mp4",
            "http://vid.aullidos.com/videos/Batman-%20A%20Telltale%20Games%20Series%20-%20Teaser.mp4",
            "http://vid.aullidos.com/videos/la-bruja-exclusivo.mp4"};

    String[] titularOcho = {"Cuál fue el vídeo más visto de kamilion 2016",
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

    String[] contenidoOcho = {"KAMILION, dio a conocer los videos más visto del segundo trimestre de  2016 en todo el mundo y el que consiguió un mayor número de visitas en España fue el corto  titulado ' IsidesMa', realizado por el GRUPO  KAMILION, S.L. para una publicidad de Talemtum Empleo cuando llegaban los calores en el mes de mayo. Al cerrar la última semana del mes, superaba las 6.310.600 visitas.\n" +
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


}
