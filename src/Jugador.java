public class Jugador extends Persona{
    private String puesto;

    private int edad;
    private String tipo;


    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }





    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + super.getApellido() + " " + this.puesto + " " + this.edad + " " + (this.tipo.equals("T")?"Titular":"Suplente");
    }

    public Jugador(String id, String nombre, String apellido, String puesto,  int edad, String tipo) {
        super(id, nombre, apellido);
        this.puesto = puesto;
        this.edad = edad;
        this.tipo = tipo;
    }

}
