package co.com.jm;

public class VideoJuego implements interf {


    public static final String MAYOR = "Mayor";
    public static  final String NO_MAYOR = "No mayor";

    public String titulo = "";
    public double horasEstimadas = 10;
    public boolean entregado = false;
    public String genero = "";
    public String compañia = "";

    public VideoJuego(){

        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compañia = compañia;

    }

    public VideoJuego(String titulo, double horasEstimadas ){

        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compañia = compañia;

    }

    public VideoJuego(String titulo, double horasEstimadas, String genero, String compañia){

        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compañia = compañia;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }



    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public boolean devolver() {
        entregado=false;
        return entregado;
    }

    @Override
    public boolean entregar() {
        entregado=true;
        return entregado;
    }

    @Override
    public String compareTo(Object a) {
        VideoJuego videojuegoComparado = (VideoJuego) a;
        if (horasEstimadas > videojuegoComparado.getHorasEstimadas()) {
            return MAYOR;
        } else {
            return NO_MAYOR;
        }

    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }
}
