package br.fatecrl.mvcdemo.models;

public class Playlist {
    private String artista;
    private String nm_musica;
    private float tp_musica;

    public Playlist(String artista, String nm_musica, float tp_musica) {
        this.artista = artista;
        this.nm_musica = nm_musica;
        this.tp_musica = tp_musica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNm_musica() {
        return nm_musica;
    }

    public void setNm_musica(String nm_musica) {
        this.nm_musica = nm_musica;
    }

    public float getTp_musica() {
        return tp_musica;
    }

    public void setTp_musica(float tp_musica) {
        this.tp_musica = tp_musica;
    }
}
