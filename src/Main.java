import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static List<Jugador> listaJugador = new ArrayList<>();
    static List<DT> listaDT = new ArrayList<>();
    static List<Arbitro> listaArbitro = new ArrayList<>();
    static List<Equipo> listaEquipo = new ArrayList<>();
    static List<Partido> listaPartido = new ArrayList<>();
    static List<ArbitroPartido> listaArbitroPartido = new ArrayList<>();
    static List<Gol> listaGol = new ArrayList<>();

    public static void main(String[] args) {
        int opcionPrincipal = 1;

        while (opcionPrincipal != 0) {
            System.out.println("Seleccione una opcion del menu:\n1. Administrar personas.\n2. Administrar equipos.\n3. Iniciar un partido.\n4. Listar partidos.\n0. Cerrar.");
            opcionPrincipal = scan.nextInt();
            switch (opcionPrincipal) {
                case 0:

                    break;
                case 1:
                    administrarPersonas();
                    break;
                case 2:
                    administrarEquipos();
                    break;
                case 3:
                    crearPartido();
                    break;
                case 4:
                    listarPartidos();
                    break;
                default:
                    System.out.println("¡Seleccione una opcion valida!");
            }
        }
    }

    //region menuPrincipal

    public static void administrarPersonas() {
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Seleccione una opcion del menu de administrador de personas:\n1. Ingresar jugadores.\n2. Eliminar jugadores.\n3. Listar jugadores.\n4. Ingresar directores.\n5. Eliminar directores.\n6. Listar directores.\n7. Ingresar arbitros.\n8. Eliminar arbitros.\n9. Listar arbitros.\n0. Volver atras.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 0:

                    break;
                case 1:
                    altaJugador();
                    break;
                case 2:
                    bajaJugador();
                    break;
                case 3:
                    listarJugadores();
                    break;
                case 4:
                    altaDirectorTecnico();
                    break;
                case 5:
                    bajaDirectorTecnico();
                    break;
                case 6:
                    listarDirectoresTecnicos();
                    break;
                case 7:
                    altaArbitro();
                    break;
                case 8:
                    bajaArbitro();
                    break;
                case 9:
                    listarArbitros();
                    break;
                default:
                    System.out.println("¡Seleccione una opcion valida!");
                    break;
            }
        }
    }

    public static void administrarEquipos() {
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Seleccione una opcion del menu de administrador de equipos:\n1. Crear un equipo.\n2. Eliminar un equipo.\n3. Ingresar jugadores.\n4. Eliminar jugadores.\n5. Ingresar directores tecnicos\n6. Listar equipos.\n0. Volver atras.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("¡Seleccione una opcion valida!");
                    break;
            }
        }
    }

    public static void crearPartido() {

    }

    public static void listarPartidos() {

    }

    //endregion

    //region personas
/*
super(id, nombre, apellido);
        this.puesto = puesto;
        this.numero = numero;
        this.edad = edad;
        this.tipo = tipo;
*/
    /*public static Jugador buscarJugador(Jugador pJugador){
        for(Jugador unJugador : listaJugador){
            if(pJugador.getNumero() == unJugador.getNumero()){
                return unJugador;
            }
        }
        return null;
    }*/
    public static void altaJugador() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
        int cont = 1;
        while (cont != 0) {
            cont = 0;
            id = "";
            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
            for (Jugador unJugador : listaJugador) {
                if (unJugador.getId().equals(id)) {
                    cont++;
                }
            }
        }
        System.out.println("Ingrese el nombre del jugador.");
        scan.nextLine();
        String nombre = scan.next();
        System.out.println("Ingrese el apellido del jugador.");
        scan.nextLine();
        String apellido = scan.next();
        System.out.println("Ingrese el puesto del jugador.");
        scan.nextLine();
        String puesto = scan.next();
        System.out.println("Ingrese el numero del jugador.");
        int numero = scan.nextInt();
        System.out.println("Ingrese la edad del jugador.");
        int edad = scan.nextInt();
        System.out.println("Ingrese el tipo del jugador. Titular: T, Suplente: S.");
        scan.nextLine();
        Character tipo = scan.next().toUpperCase().charAt(0);
        try {
            Jugador pJugador = new Jugador(id, nombre, apellido, puesto, numero, edad, tipo);
            listaJugador.add(pJugador);
            System.out.println("Jugador ingresado con exito.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error.");
        }

    }

    public static void bajaJugador() {
        int cont = 0;
        for (Jugador unJugador : listaJugador) {
            System.out.println(cont + ". " + unJugador.toString() + "  ");
            cont++;
        }
        if (cont == 0) {
            System.out.println("No hay jugadores registrados.");
        } else {
            System.out.println("Elija un numero de jugador para borrar.");
            int num = scan.nextInt();
            try{
                listaJugador.remove(num);
                System.out.println("Jugador eliminado.");
            }catch (Exception e){
                System.out.println("El jugador no existe.");
            }
        }

    }

    public static void listarJugadores() {
        int cont  = 0;
        for(Jugador unJugador : listaJugador){
            System.out.println(unJugador.toString());
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay jugadores registrados.");
        }
    }

    public static void altaDirectorTecnico() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
        int cont = 1;
        while (cont != 0) {
            cont = 0;
            id = "";
            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
            for (DT unDT : listaDT) {
                if (unDT.getId().equals(id)) {
                    cont++;
                }
            }
        }
        System.out.println("Ingrese el nombre del director tecnico.");
        scan.nextLine();
        String nombre = scan.next();
        System.out.println("Ingrese el apellido del director tecnico.");
        scan.nextLine();
        String apellido = scan.next();
        System.out.println("Ingrese la edad del director tecnico.");
        scan.nextLine();
        int edad = scan.nextInt();

        try {
            DT pDT = new DT(id, nombre, apellido, edad);
            listaDT.add(pDT);
            System.out.println("Director tecnico ingresado con exito.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error.");
        }
    }

    public static void bajaDirectorTecnico() {
        int cont = 0;
        for (DT unDT : listaDT) {
            System.out.println(cont + ". " + unDT.toString() + "  ");
            cont++;
        }
        if (cont == 0) {
            System.out.println("No hay directores tecnicos registrados.");
        } else {
            System.out.println("Elija un numero de director tecnico para borrar.");
            int num = scan.nextInt();
            try{
                listaDT.remove(num);
                System.out.println("Director tecnico eliminado.");
            }catch (Exception e){
                System.out.println("El director tecnico no existe.");
            }
        }
    }

    public static void listarDirectoresTecnicos() {
        int cont = 0;
        for(DT unDT : listaDT){
            System.out.println(unDT.toString());
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay directores tecnicos registrados.");
        }
    }

    public static void altaArbitro() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
        int cont = 1;
        while (cont != 0) {
            cont = 0;
            id = "";
            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
            for (Arbitro unArbitro : listaArbitro) {
                if (unArbitro.getId().equals(id)) {
                    cont++;
                }
            }
        }
        System.out.println("Ingrese el nombre del arbitro.");
        scan.nextLine();
        String nombre = scan.next();
        System.out.println("Ingrese el apellido del arbitro.");
        scan.nextLine();
        String apellido = scan.next();
        System.out.println("Ingrese el puesto del arbitro.");
        scan.nextLine();
        String puesto = scan.next();

        try {
            Arbitro pArbitro = new Arbitro(id, nombre, apellido, puesto);
            listaArbitro.add(pArbitro);
            System.out.println("Arbitro ingresado con exito.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error.");
        }
    }

    public static void bajaArbitro() {
        int cont = 0;
        for (Arbitro unArbitro : listaArbitro) {
            System.out.println(cont + ". " + unArbitro.toString() + "  ");
            cont++;
        }
        if (cont == 0) {
            System.out.println("No hay arbitros registrados.");
        } else {
            System.out.println("Elija un numero de arbitro para borrar.");
            int num = scan.nextInt();
            try{
                listaArbitro.remove(num);
                System.out.println("Arbitro eliminado.");
            }catch (Exception e){
                System.out.println("El arbitro no existe.");
            }
        }
    }

    public static void listarArbitros() {
        int cont = 0;
        for(Arbitro unArbitro : listaArbitro){
            System.out.println(unArbitro.toString());
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay arbitros registrados.");
        }
    }

    //endregion


}