import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String id;
    private String nombre;
    private String DT;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.DT;
    }

    public Equipo(String id, String nombre, String DT) {
        this.id = id;
        this.nombre = nombre;
        this.DT = DT;
    }
}
