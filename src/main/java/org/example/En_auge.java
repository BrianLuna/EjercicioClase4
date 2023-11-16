package org.example;

public class En_auge implements TrendingState {
    @Override
    public void setTrending(Song song) {
        if(song.getReproducciones() >= 15 && song.getDislikes()< 10){
            song.setTrendingState(new En_tendencia());
        } else if (song.getReproducciones() < 10 && song.getDislikes()>= 10) {
            song.setTrendingState(new Normal());
        }
    }

    @Override
    public String showText(Song song) {
        return Icono.ROCKET.texto() + " - " + song.getArtista() + " - " + song.getTitulo() + " (" + song.getAlbum() + " - " + song.getAlbum_date() + ")";
    }

}
