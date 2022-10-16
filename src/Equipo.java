import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String id;
    private String nombre;
    private String DT;

    private  int CantJugT;
    private  int CantJugS;



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

    public Equipo(String id, String nombre, String DT, int T, int S) {
        this.id = id;
        this.nombre = nombre;
        this.DT = DT;
        this.CantJugT = T;
        this.CantJugS = S;
    }
    public Equipo(int CantJugT, int cantJugS)
    {
        this.CantJugT = CantJugT;
        this.CantJugS = cantJugS;
    }

    public int getCantJugT() {
        return CantJugT;
    }

    public void setCantJugT(int cantJugT) {
        CantJugT = cantJugT;
    }

    public int getCantJugS() {
        return CantJugS;
    }
    public void setCantJugS(int cantJugS) {
        CantJugS = cantJugS;
    }

}
