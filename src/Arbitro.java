public class Arbitro extends Persona {
    private String puesto;


    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + super.getApellido() + " " + this.puesto;
    }
    public Arbitro(String id, String nombre, String apellido, String puesto) {
        super(id, nombre, apellido);
        this.puesto = puesto;
    }
}
