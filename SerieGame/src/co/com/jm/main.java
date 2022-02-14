package co.com.jm;

public class main {

    public static void main(String[] args) {

        Serie arregloSeries[] = new Serie[5];
        arregloSeries[0] = new Serie();
        arregloSeries[1] = new Serie("mi pequeña pony", 14, "suspenso", "tarantino");
        arregloSeries[2] = new Serie();
        arregloSeries[3] = new Serie();
        arregloSeries[4] = new Serie();


       /** for (int i = 0; i < arrayObjetos1.length; i++) {

            System.out.println(arrayObjetos1[i]);

        }*/

        VideoJuego arregloVideojuegos[] = new VideoJuego[5];
        arregloVideojuegos[0] = new VideoJuego();
        arregloVideojuegos[1] = new VideoJuego();
        arregloVideojuegos[2] = new VideoJuego();
        arregloVideojuegos[3] = new VideoJuego();
        arregloVideojuegos[4] = new VideoJuego();

        /**for (int i = 0; i < arrayObjetos1.length; i++) {

            System.out.println(arrayObjetos2[i]);

        }
        */
        arregloSeries[1].entregar();

        arregloSeries[2].entregar();

        arregloSeries[3].entregar();

        arregloVideojuegos[1].entregar();

        arregloVideojuegos[0].entregar();

        int contadorEntregas = 0;

        for (int i = 0; i < arregloSeries.length; i++) {

            System.out.println(arregloSeries[i]);
            if(arregloSeries[i].isEntregado() == true){

                contadorEntregas = contadorEntregas +1;

            }


        }
        System.out.println("este es tu contadorEntregas: "+contadorEntregas);


        int contadorEntregas2 = 0;
        for (int i = 0; i < arregloVideojuegos.length; i++) {

            System.out.println(arregloVideojuegos[i]);
            if(arregloVideojuegos[i].isEntregado() == true){

                contadorEntregas2 = contadorEntregas2 +1;

            }


        }
        int contadores = contadorEntregas+contadorEntregas2;

        System.out.println("este es tu contadorEntregas: "+contadorEntregas2);

        Serie serieTemporadaMayor = arregloSeries[0];
        VideoJuego videojuegoHorasMayor = arregloVideojuegos[0];

        for (int i = 1; i < 5; i++) {
            if (arregloSeries[i].compareTo(serieTemporadaMayor).equals(Serie.MAYOR)) {
                serieTemporadaMayor = arregloSeries[i];
            }
            if (arregloVideojuegos[i].compareTo(videojuegoHorasMayor).equals(Serie.MAYOR)) {
                videojuegoHorasMayor = arregloVideojuegos[i];
            }
        }
        System.out.println("La cantidad total de entregados es: " +contadores);
        System.out.println(videojuegoHorasMayor);
        System.out.println(serieTemporadaMayor);








    }


}
