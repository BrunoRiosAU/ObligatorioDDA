public class JugadorEquipo {
    private String idJugador;
    private String idEquipo;
    private int numero;


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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return this.idJugador+" "+this.idEquipo;
    }


    public JugadorEquipo(String idJugador, String idEquipo, int Numero) {
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.numero = Numero;


    }
}
