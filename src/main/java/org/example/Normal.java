package org.example;

import java.time.LocalDate;

public class Normal implements TrendingState {

    @Override
    public void setTrending(Song song) {
        TrendingState newState = new Normal();
        // Design Pattern -> Strategy (???)
        if (song.getReproducciones() > 10) {
            song.setTrendingState(new En_auge());
        }
    }

    @Override
    public String showText(Song song) {
        return Icono.MUSICAL_NOTE.texto() + " - " + song.getArtista() + " - " + song.getAlbum() + " - " + song.getTitulo();
    }

}