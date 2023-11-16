package org.example;

import java.time.LocalDate;
import java.time.Year;

public class Song {

    private String titulo;
    private String artista;
    private String album;
    private Integer reproducciones;
    private Integer likes;
    private Integer dislikes;
    private Year album_date;
    private Year song_date;
    private LocalDate fechaUltimaReproduccion;

    private TrendingState trendingState;

    public Song(String titulo, String artista, String album, Integer likes, Integer dislikes, Year album_date) {
        this.trendingState = new Normal();
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.reproducciones = 0;
        this.likes = likes;
        this.dislikes = dislikes;
        this.album_date = album_date;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getArtista() {
        return artista;
    }
    public String getAlbum() {
        return album;
    }
    public Integer getReproducciones() {
        return reproducciones;
    }
    public Integer getLikes() {
        return likes;
    }
    public Integer getDislikes() {
        return dislikes;
    }
    public Year getAlbum_date() {
        return album_date;
    }
    public Year getSong_date() {
        return song_date;
    }
    public TrendingState getTrendingState() {
        return trendingState;
    }

    public void setSong_date(Year song_date) {
        this.song_date = song_date;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setReproducciones(Integer reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public void setAlbum_date(Year album_date) {
        this.album_date = album_date;
    }

    public void setTrendingState(TrendingState trendingState) {
        this.trendingState = trendingState;
    }

//    public void changeTrendingState(){
//        this.trendingState.setTrending(this);
//    }

    public LocalDate getFechaUltimaReproduccion() {
        return fechaUltimaReproduccion;
    }

    public void setFechaUltimaReproduccion(LocalDate fechaUltimaReproduccion) {
        this.fechaUltimaReproduccion = fechaUltimaReproduccion;
    }

    public void reproducir(){
        this.reproducciones++;
        this.fechaUltimaReproduccion = LocalDate.now();
        System.out.println(this.trendingState.showText(this));
        this.trendingState.setTrending(this);
    }
}