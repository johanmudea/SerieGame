package co.com.jm;

public class Serie implements interf{

    public String titulo = "";
    public int numeroTemporadas = 3;
    public boolean entregado = false;
    public String genero = "";
    public String creador = "";
    public static final String MAYOR = "Mayor";
    public static  final String NO_MAYOR = "No mayor";


    public Serie(){
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;



    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }


    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }




    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public boolean entregar() {
        entregado=true;
        return entregado;
    }

    @Override
    public boolean devolver() {
        entregado = false;
        return entregado;
    }

    @Override
    public String compareTo(Object a) {
        Serie serieComparada = (Serie) a;
        if (numeroTemporadas > serieComparada.getNumeroTemporadas()) {
            return MAYOR;
        } else {
            return NO_MAYOR;
        }
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }






}

