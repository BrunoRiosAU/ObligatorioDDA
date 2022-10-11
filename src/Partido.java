public class Partido {
    private String id;
    private String estadio;
    private short dia;
    private String hora;
    private int minutosJugados;
    private String clima;
    private String equipoLocal;
    private String equipoVisitante;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public short getDia() {
        return dia;
    }

    public void setDia(short dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Partido(String id, String estadio, short dia, String hora, int minutosJugados, String clima, String equipoLocal, String equipoVisitante) {
        this.id = id;
        this.estadio = estadio;
        this.dia = dia;
        this.hora = hora;
        this.minutosJugados = minutosJugados;
        this.clima = clima;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }
}
