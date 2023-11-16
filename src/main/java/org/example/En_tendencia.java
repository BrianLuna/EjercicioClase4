package org.example;

import java.time.LocalDate;

public class En_tendencia implements TrendingState {
    @Override
    public void setTrending(Song song) {
        if(LocalDate.now().isAfter(song.getFechaUltimaReproduccion().plusDays(1))){
            song.setTrendingState(new Normal());
        }
    }

    @Override
    public String showText(Song song) {
        return Icono.FIRE.texto() + " - " + song.getTitulo() + " - " + song.getArtista() + " (" + song.getAlbum() + " - " + song.getAlbum_date() + ")";
    }

}
