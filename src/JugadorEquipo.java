public class JugadorEquipo {
    private String idJugador;
    private String idEquipo;

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return this.idJugador+" "+this.idEquipo;
    }

    public JugadorEquipo(String idJugador, String idEquipo) {
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
    }
}
