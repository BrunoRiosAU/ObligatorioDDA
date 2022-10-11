public class Gol {
    private String idJugador;
    private String idPartido;

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public Gol(String idJugador, String idPartido) {
        this.idJugador = idJugador;
        this.idPartido = idPartido;
    }
}
