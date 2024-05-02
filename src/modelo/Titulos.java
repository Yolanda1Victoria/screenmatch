package modelo;

public class Titulos {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoPlanBasico;
    private String sinopsis = """
                HOLI
            """;
    private int tiempoDeDuracionEnMinutos;

    public boolean isIncluidoPlanBasico() {
        return incluidoPlanBasico;
    }

    public void setIncluidoPlanBasico(boolean incluidoPlanBasico) {
        this.incluidoPlanBasico = incluidoPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void muestraFichaTecnica(){
        System.out.println("*******FICHA TECNICA*********");
        System.out.println("Nombre " + nombre) ;
        System.out.println("Fecha de Lanzamiento " +fechaDeLanzamiento);
        System.out.println("Tiempo de duración " +getTiempoDeDuracionEnMinutos()  + " minutos");
    };

}
