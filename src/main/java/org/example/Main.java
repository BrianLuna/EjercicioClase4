package org.example;

import java.time.Year;

class Main {
    public static void main(String[] args) {

        Song cancion1 = new Song ("The Scientist", "Coldplay", "A Rush of Blood to the head", 250, 5, Year.of(2002));
        Song cancion2 = new Song("Titulo2", "Artista2", "Album2", 5, 6, Year.of(2021));

//        System.out.println(Icono.ROCKET.texto() + Icono.MUSICAL_NOTE.texto() + Icono.FIRE.texto() +"The tittle of the first song is: "+ cancion1.getTitulo() + cancion1.getTrendingState());
        for (int i = 0;i < 50; i++){
            System.out.print(i);
            cancion1.reproducir();
        }
    }
}