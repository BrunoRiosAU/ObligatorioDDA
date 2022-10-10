public class DT extends Persona{
    private int edad;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + super.getApellido() + " " + this.edad;
    }

    public DT(String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido);
        this.edad = edad;
    }
}
