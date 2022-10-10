public class Jugador extends Persona{
    private String puesto;
    private int numero;
    private int edad;
    private Character tipo;


    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + super.getApellido() + " " + this.puesto + " " + this.numero + " " + this.edad + " " + (this.tipo.equals('T')?"Titular":"Suplente");
    }

    public Jugador(String id, String nombre, String apellido, String puesto, int numero, int edad, Character tipo) {
        super(id, nombre, apellido);
        this.puesto = puesto;
        this.numero = numero;
        this.edad = edad;
        this.tipo = tipo;
    }
}
