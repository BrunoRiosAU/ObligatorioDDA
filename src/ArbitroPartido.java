public class ArbitroPartido {
    private String idArbitro;
    private String idPartido;

    public String getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(String idArbitro) {
        this.idArbitro = idArbitro;
    }

    public String getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public ArbitroPartido(String idArbitro, String idPartido) {
        this.idArbitro = idArbitro;
        this.idPartido = idPartido;
    }
}
