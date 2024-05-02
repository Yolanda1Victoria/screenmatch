package modelo;

public class Serie extends Titulos{
    private int temporadas;
    private int episodioPorTemporadas;
    private int duracionEnMinutos;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporadas() {
        return episodioPorTemporadas;
    }

    public void setEpisodioPorTemporadas(int episodioPorTemporadas) {
        this.episodioPorTemporadas = episodioPorTemporadas;
    }

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutos* episodioPorTemporadas * temporadas;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;

    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
}
