 import java.io.BufferedReader;
 import java.io.FileNotFoundException;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.List;
import java.util.Scanner;

public class Main {


     static List<String> listaJ = new ArrayList<>();
     static List<String> listaE = new ArrayList<>();
     static List<String> listaD = new ArrayList<>();
    static List<String> listaA = new ArrayList<>();
    static List<String> listaJE = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static List<Jugador> listaJugador = new ArrayList<>();
    static List<DT> listaDT = new ArrayList<>();
    static List<Arbitro> listaArbitro = new ArrayList<>();
    static List<Equipo> listaEquipo = new ArrayList<>();
    static List<JugadorEquipo> listaJugadorEquipo = new ArrayList<>();
    static List<Partido> listaPartido = new ArrayList<>();
    static List<ArbitroPartido> listaArbitroPartido = new ArrayList<>();
    static List<Gol> listaGol = new ArrayList<>();

    public static void main(String[] args) {
        int opcionPrincipal = 1;
         leerArchivoJ();
         leerArchivoE();
         leerArchivoDT();
         leerArchivoJE();
        leerArchivoA();
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



    public static void leerArchivoJ() {
         FileReader fr = null;
         try {
             fr = new FileReader("Jugadores.txt");
             BufferedReader br = new BufferedReader(fr);
             String linea;

             while ((linea = br.readLine()) != null) {

                 String l =  linea.toLowerCase();
                 listaJ.add(l);
             }

             String[] arreglo = new String[listaJ.size()]; // Copiar el contenido de la lista a un arreglo de Strings



             String[] arregloF =  new String[listaJ.size()];
             for (int i = 0; i < listaJ.size(); i++) {

                 arreglo[i] = listaJ.get(i);

                 arregloF = arreglo[i].split(" - ");
               String  id =arregloF[0];
                 String  nombre =arregloF[1].toUpperCase();
                 String  apellido =arregloF[2].toUpperCase();
                 String puesto = arregloF[3].toUpperCase();
                int Edad = Integer.parseInt(arregloF[4]);
                String tipo =  arregloF[5].toUpperCase();
                  Jugador Pjugador = new Jugador(id, nombre, apellido, puesto, Edad, tipo);
                 listaJugador.add(Pjugador);


             }


         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             try {// Nos asegurarnos que se cierra el archivo.
                 if (null != fr) {
                     fr.close();
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
        }
    }


     public static void leerArchivoE() {
         FileReader fr = null;
         try {
             fr = new FileReader("Equipo.txt");
             BufferedReader br = new BufferedReader(fr);
             String linea;

             while ((linea = br.readLine()) != null) {

                 String l =  linea.toLowerCase();
                 listaE.add(l);
             }

             String[] arreglo = new String[listaE.size()]; // Copiar el contenido de la lista a un arreglo de Strings



                String[] arregloF =  new String[listaE.size()];
                for (int i = 0; i < listaE.size(); i++) {

                 arreglo[i] = listaE.get(i);

                 arregloF = arreglo[i].split(" - ");
                 String  id =arregloF[0];
                 String  nombre =arregloF[1].toUpperCase();
                 String  Dt =arregloF[2].toUpperCase();
                 int T = Integer.parseInt(arregloF[3]);
                    int S = Integer.parseInt(arregloF[4]);
                 Equipo Pequipo = new Equipo(id, nombre, Dt, T, S);
                 listaEquipo.add(Pequipo);


             }


         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             try {// Nos asegurarnos que se cierra el archivo.
                 if (null != fr) {
                     fr.close();
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
        }
    }

    public static void leerArchivoA() {
        FileReader fr = null;
        try {
            fr = new FileReader("Arbitros.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {

                String l =  linea.toLowerCase();
                listaA.add(l);
            }

            String[] arreglo = new String[listaA.size()]; // Copiar el contenido de la lista a un arreglo de Strings



            String[] arregloF =  new String[listaA.size()];
            for (int i = 0; i < listaA.size(); i++) {

                arreglo[i] = listaA.get(i);

                arregloF = arreglo[i].split(" - ");
                String  id =arregloF[0];
                String  nombre =arregloF[1].toUpperCase();
                String  apellido =arregloF[2].toUpperCase();
                String  puesto =arregloF[3].toUpperCase();
                Arbitro Parbitro = new Arbitro(id, nombre, apellido, puesto);
                listaArbitro.add(Parbitro);


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {// Nos asegurarnos que se cierra el archivo.
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void leerArchivoJE() {
        FileReader fr = null;
        try {
            fr = new FileReader("JugadoresEquipo.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {

                String l =  linea.toLowerCase().trim();
                listaJE.add(l);
            }

            String[] arreglo = new String[listaJE.size()]; // Copiar el contenido de la lista a un arreglo de Strings



            String[] arregloF =  new String[listaJE.size()];
            for (int i = 0; i < listaJE.size(); i++) {

                arreglo[i] = listaJE.get(i);

                arregloF = arreglo[i].split(" - ");
                String  idJug =arregloF[0];
                String  idEqu =arregloF[1].toUpperCase();
                int num = Integer.parseInt(arregloF[2].toUpperCase());

                JugadorEquipo PJe = new JugadorEquipo(idJug, idEqu, num);
                listaJugadorEquipo.add(PJe);


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {// Nos asegurarnos que se cierra el archivo.
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static void leerArchivoDT() {
         FileReader fr = null;
         try {
             fr = new FileReader("DT.txt");
             BufferedReader br = new BufferedReader(fr);
             String linea;

             while ((linea = br.readLine()) != null) {

                 String l =  linea.toLowerCase();
                 listaD.add(l);
             }

             String[] arreglo = new String[listaD.size()]; // Copiar el contenido de la lista a un arreglo de Strings



             String[] arregloF =  new String[listaD.size()];
             for (int i = 0; i < listaD.size(); i++) {

                 arreglo[i] = listaD.get(i);

                 arregloF = arreglo[i].split(" - ");
                 String  id =arregloF[0];
                 String  nombre =arregloF[1].toUpperCase();
                 String  apellido =arregloF[2].toUpperCase();
                int edad = Integer.parseInt(arregloF[3].toUpperCase());
                 DT dt = new DT(id, nombre, apellido, edad);
                 listaDT.add(dt);


             }


         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             try {// Nos asegurarnos que se cierra el archivo.
                 if (null != fr) {
                     fr.close();
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
        }
    }


    //region menuPrincipal

    public static void administrarPersonas() {
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Seleccione una opcion del menu de administrador de personas:\n1. Ingresar jugadores.\n2. Eliminar jugadores.\n3. Listar jugadores.\n4. Ingresar directores tecnicos.\n5. Eliminar directores tecnicos.\n6. Listar directores tecnicos.\n7. Ingresar arbitros.\n8. Eliminar arbitros.\n9. Listar arbitros.\n0. Volver atras.");
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
             System.out.println("Seleccione una opcion del menu de administrador de equipos:\n1. Crear un equipo.\n2. Eliminar un equipo.\n3. Listar equipos.\n4. Ingresar jugadores.\n5. Eliminar jugadores.\n6 Listar jugadores dado equipo. \n0. Volver atras.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 0:

                    break;
               case 1:
                   altaEquipo();
                 break;
                case 2:
                    bajaEquipo();
                    break;
                case 3:
                    listarEquipos();
                    break;
                case 4:
                    altaJugadorEquipo();
                    break;
                case 5:
                    bajaJugadorEquipo();
                    break;
                 case 6:
                     ListarJugadorEquipo();
                     break;
                default:
                    System.out.println("¡Seleccione una opcion valida!");
                    break;
            }
        }
    }

    public static void crearPartido() {
        List<Equipo> listaEquipoListo = new ArrayList<>();
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int cont = 0;
        int j = PartidoCont();
        String id = "";
        for (Equipo unE : listaEquipo) {
            if (unE.getCantJugT() == 11 && unE.getCantJugS() == 5) {
                listaEquipoListo.add(unE);
            }
        }
        System.out.println("Los equipos disponibles para un partido son : ");
        for (Equipo unEl : listaEquipoListo) {
            System.out.println(cont + " " + unEl.toString());
            cont++;
        }
        if (cont == 0) {
            System.out.println("No hay un equipo con la cantidad de jugadores para comenzar un partido");
        } else {
            System.out.println("Selecionar Equipo Visitante");
            int eq1 = scan.nextInt();
            Equipo Vistiante = listaEquipoListo.get(eq1);
            try {
                listaEquipoListo.remove(eq1);

            } catch (Exception e) {
                System.out.println("No existe el equipo selecionado");
            }
            cont =0;
            for (Equipo unEl : listaEquipoListo) {
                System.out.println(cont + " " + unEl.toString());
                cont++;
            }

            System.out.println("Selecionar Equipo Local");
            int eq2 = scan.nextInt();
            Equipo Local = listaEquipoListo.get(eq2);
            try {
                listaEquipoListo.remove(eq2);

            } catch (Exception e) {
                System.out.println("No existe el equipo selecionado");
            }
            int contP = 0;
            while (contP == 0) {
                id = "";
                for (int i = 0; i < 16; i++) {
                    id += rndm[(int) (Math.random() * 10)];
                }
                if(j != 0) {
                    for (Partido unPar : listaPartido) {



                        if (unPar.getId().equals(id)) {
                            break;
                        } else {
                            contP++;
                        }
                    }
                }
                else
                {
                    contP++;
                }
            }
            System.out.println("Ingrese el estadio del partido");
            String Est = scan.next();
            System.out.println("Ingrese el dia del partido");
            short dia = scan.nextShort();
            System.out.println("Ingrese la hora del partido");
            String Hora = scan.next();
            System.out.println("Ingrese el clima del partido");
            String Clima = scan.next();

            Partido newP = new Partido(id, Est, dia,Hora,Clima,Local.getId(),Vistiante.getId());
            int opcion = 1;
            MostrarPartido(id,Local.getId(),Vistiante.getId());

            while (opcion != 0) {
                System.out.println("Seleccione una accion del partido:\n1. Anotar gol.\n2. Cambio de jugador.\n0. Finalizar partido.");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 0:

                        break;
                    case 1:
                        altaGol(id,Local.getId(),Vistiante.getId());
                        break;
                    case 2:
                        cambioJugador(id);
                        break;

                    default:
                        System.out.println("¡Seleccione una opcion valida!");
                        break;
                }
            }





        }
    }

    public static void altaGol(String id, String local, String visitantes) {
        System.out.println("El gol fue del equipo local o visitante  ");
        String equipo = String.valueOf(scan.next().toLowerCase().charAt(0));
        List<Jugador> listaJugadorESelct = new ArrayList<>();
        if (equipo.equals("l")) {

            int contG = 0;

            for (JugadorEquipo unJE : listaJugadorEquipo) {
                for (Jugador unJugador : listaJugador) {
                    if (unJE.getIdEquipo().equals(local) && unJugador.getTipo().equals("T") &&
                            unJE.getIdJugador().equals(unJugador.getId())) {

                        System.out.println(contG + " " + unJugador.getNombre() + " " + unJugador.getApellido());
                        contG++;
                        listaJugadorESelct.add(unJugador);
                    }
                }
            }

        }
        if (equipo.equals("v")) {
            {

                int contG = 0;

                for (JugadorEquipo unJE : listaJugadorEquipo) {
                    for (Jugador unJugador : listaJugador) {
                        if (unJE.getIdEquipo().equals(visitantes) && unJugador.getTipo().equals("T") &&
                                unJE.getIdJugador().equals(unJugador.getId())) {

                            System.out.println(contG + " " + unJugador.getNombre() + " " + unJugador.getApellido());
                            contG++;
                            listaJugadorESelct.add(unJugador);
                        }
                    }
                }

            }

        }
        System.out.println("Ingrese el jugador que ingreso el gol");
        int jug =  scan.nextInt();

try {
            Gol newG = new Gol(listaJugadorESelct.get(jug).getId(), id);
            System.out.println("El gol se registro con exito");
        }
        catch(Exception e)
        {
            System.out.println("No se pudo registrar el gol");
        }
    }
    public static void cambioJugador(String id) {

    }

    public static void MostrarPartido(String id, String local, String visitantes)
    {
        String J = "";

        for(JugadorEquipo newJQ :listaJugadorEquipo){
        for(Jugador unJugador : listaJugador) {

                if (newJQ.getIdEquipo().equals(local) && newJQ.getIdJugador().equals(unJugador.getId())) {
                    J = "Local";
                    System.out.println(J + " " + unJugador.toString());
                }
                if(newJQ.getIdEquipo().equals(visitantes) && newJQ.getIdJugador().equals(unJugador.getId()))
            {
                J = "Visitantes";
                System.out.println(J + " " + unJugador.toString());
            }
            }
        }

    }


    public static void listarPartidos() {
        int cont = 0;
 for(Partido Ppar : listaPartido){
     cont++;
 }
 if(cont==0)
 {
     System.out.println("No existen partidos registrados");
 }
    }

    public static int PartidoCont() {
        int cont = 0;
        for(Partido Ppar : listaPartido){
            cont++;
        }
  return  cont;
    }

    //endregion

    //region personas


    public static void altaJugador() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
         int cont = 0;
         int j = JugadoresCont();
         while (cont == 0) {
            id = "";
            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
             if(j != 0) {
                for (Jugador unJugador : listaJugador) {



                    if (unJugador.getId().equals(id)) {
                         break;
                     } else {
                        cont++;
                    }
                }
            }
             else
             {
                 cont++;
             }
         }

            System.out.println("Ingrese el nombre del jugador.");

            String nombre = scan.next();
            System.out.println("Ingrese el apellido del jugador.");

            String apellido = scan.next();
            System.out.println("Ingrese el puesto del jugador.");

            String puesto = scan.next();
            System.out.println("Ingrese el numero del jugador.");

            int edad = scan.nextInt();

             String tipo = "";
             int c = 0;
             while (c != 1) {
                 if (tipo.equals('T') || tipo.equals('S')) {
                     c++;
                    try {
                         Jugador pJugador = new Jugador(id, nombre, apellido, puesto, edad, tipo);
                        listaJugador.add(pJugador);
                        System.out.println("Jugador ingresado con exito.");
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error.");
                    }
                 } else {
                     System.out.println("Ingrese el tipo del jugador. Titular: T, Suplente: S.");
                     scan.nextLine();

                     tipo = String.valueOf(scan.next().toUpperCase().charAt(0));
                 }
             }


            }



    public static void bajaJugador() {
         int cont = JugadoresCont();
         listarJugadores();
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
             System.out.println( cont + ". " +unJugador.toString() + " ");
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay jugadores registrados.");
        }

     }

     public static int JugadoresCont() {
         int cont  = 0;
         for(Jugador unJugador : listaJugador){

             cont++;
         }
         return cont;
    }

    public static void altaDirectorTecnico() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
         int cont = 0;
         int j = ContDT();
         while (cont == 0) {


            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
             if(j!= 0) {
                for (DT unDT : listaDT) {

                    if (unDT.getId().equals(id)) {
                         break;
                      }
                     else
                     {
                        cont++;
                    }
                }
            }
             else
             {
                 cont++;
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
         int cont = ContDT();
         listarDirectoresTecnicos();

        if (cont == 0) {
            System.out.println("No hay directores tecnicos registrados.");
        } else {
            System.out.println("Elija un numero de director tecnico para borrar.");
            int num = scan.nextInt();
            try {
                listaDT.remove(num);
                System.out.println("Director tecnico eliminado.");
            } catch (Exception e) {
                System.out.println("El director tecnico no existe.");
            }
        }
    }

    public static void listarDirectoresTecnicos() {
        int cont = 0;
        for(DT unDT : listaDT){
             System.out.println(cont + ". " + unDT.toString() + "  ");
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay directores tecnicos registrados.");
        }

     }

     public static int ContDT() {
         int cont = 0;
         for(DT unDT : listaDT){
             cont++;
         }

     return  cont;
    }

    public static void altaArbitro() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
         int cont = 0;
         int j = ContArbitros();
         while (cont == 0) {

            id = "";
            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
             if(j != 0) {
                for (Arbitro unArbitro : listaArbitro) {

                    if (unArbitro.getId().equals(id)) {
                         break;
                     }
                     else {
                        cont++;
                    }
                }
            }
             else
             {
                 cont ++;
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
         listarArbitros();
         int cont = ContArbitros();

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
             System.out.println(cont + ". " + unArbitro.toString() + "  ");
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay arbitros registrados.");
        }

     }

     public static int ContArbitros() {
         int cont = 0;
         for(Arbitro unArbitro : listaArbitro){

             cont++;
         }
        return cont;

    }



    //endregion

    //region equipos



    public static void altaEquipo() {
        String[] rndm = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String id = "";
         int cont = 0;
         int j = ContEquipos();
         List<DT> listaDTLi = new ArrayList<>();
         while (cont == 0) {

            id = "";
            for (int i = 0; i < 16; i++) {
                id += rndm[(int) (Math.random() * 10)];
            }
             if (j != 0) {
                for (Equipo unEquipo : listaEquipo) {
                    if (unEquipo.getId().equals(id)) {
                         break;
                     } else {
                        cont++;
                    }
                }
             } else {
                 cont++;
             }
        }
        System.out.println("Ingrese el nombre del equipo.");
        scan.nextLine();
        String nombre = scan.next();


         int c = ContDT();
         int Libre = 0;
         int ocu = 0;
         if (c == 0) {
             System.out.println("No hay directores tecnicos registrados.");
             altaDirectorTecnico();
         }
        for (DT unDT : listaDT) {
             ocu = 0;
             for (Equipo unE : listaEquipo) {
                 if (unE.getDT().equals(unDT.getId())) {
                     ocu++;

                }


             }
             if (ocu == 0) {
                 System.out.println(Libre + ". " + unDT.toString());
                 Libre++;
                 listaDTLi.add(unDT);
             }
         }
         int dtli = 0;
         for (DT unDt : listaDTLi) {
             dtli++;
         }


         if (dtli == 0) {
             System.out.println("No hay directores tecnicos libres");
             altaDirectorTecnico();
             dtli++;
             for (DT unDT : listaDT) {
                 ocu = 0;
                 for (Equipo unE : listaEquipo) {
                     if (unE.getDT().equals(unDT.getId())) {
                         ocu++;

                     }


                 }
                 if (ocu == 0) {
                     System.out.println(Libre + ". " + unDT.toString());
                     Libre++;
                     listaDTLi.add(unDT);
                 }
             }
         }

            System.out.println("Ingrese el numero del director tecnico.");
            scan.nextLine();
            int num = scan.nextInt();
            String DT = "";
 try {
    for (DT unDT : listaDT) {
         if (listaDTLi.get(num).getId() == unDT.getId()) {
            DT = unDT.getId();
        }

    }
    try {
        Equipo pEquipo = new Equipo(id, nombre, DT);
        listaEquipo.add(pEquipo);
        System.out.println("Equipo ingresado con exito.");
    } catch (Exception e) {
        System.out.println("Ocurrio un error.");
    }


}

 catch (Exception e) {
     System.out.println("No existe el DT selecionado");
}
}

    public static void bajaEquipo(){
          listarEquipos();
         int cont = ContEquipos();
        if (cont == 0) {
            System.out.println("No hay equipos registrados.");
        } else {
            System.out.println("Elija un numero de equipo para borrar.");
            int num = scan.nextInt();
            try{
                listaEquipo.remove(num);
                System.out.println("Equipo eliminado.");
            }catch (Exception e){
                System.out.println("El equipo no existe.");
            }
        }
    }

    public static void listarEquipos(){
        int cont = 0;
        for(Equipo unEquipo : listaEquipo){
             System.out.println(cont + ". " + unEquipo.toString() + "  ");
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay equipos registrados.");
        }
    }

     public static int ContEquipos(){
        int cont = 0;
         for(Equipo unEquipo : listaEquipo){
            cont++;
        }

         return cont;
    }





   public static void altaJugadorEquipo() {
      int cont = 0;
       int pos = 0;
       int JugL = 0;
       int contE = ContEquipos();
       List<Jugador> JugLib = new ArrayList<>();
       for (Jugador unJugador : listaJugador) {
           cont=0;
          for (JugadorEquipo unJE : listaJugadorEquipo) {
              if (unJE.getIdJugador().equals(unJugador.getId())) {
                  cont++;
              }
          }
           if (cont == 0) {
               System.out.println(pos + ". " + unJugador.toString());
               JugLib.add(unJugador);
               pos++;
          }
      }
       for(Jugador unJ : JugLib)
       {
           JugL++;
       }
       if (JugL == 0 ) {
           System.out.println("No hay jugadores libres.");

       } else if (contE==0 ) {
           System.out.println("No existen equipos.");
       } else {
           System.out.println("Seleccione un numero de Jugador.");
           int num0 = scan.nextInt();
           listarEquipos();
           System.out.println("Seleccione numero de equipo.");
           int num1 = scan.nextInt();
           System.out.println("Seleccione de que numero jugea este Jugador.");
           int numJ = scan.nextInt();
           String idJugador = "";
          int contT = 0;
          int contS = 0;
           Equipo E = null;
           Jugador J = null;
           String idEquipo = "";

              for (Equipo unEquipo : listaEquipo) {

                       for (Jugador unJugador : JugLib) {

                          E = listaEquipo.get(num1);
                          J = JugLib.get(num0);
                                   if (unJugador.getTipo().equals("T") && unEquipo.getId() == E.getId()
                                           && unJugador.getId() == J.getId()) {
                                       idEquipo = unEquipo.getId();
                                       idJugador = unJugador.getId();
                                      unEquipo.setCantJugT(unEquipo.getCantJugT() +1);
                                  }
                                   if(unJugador.getTipo().equals("S") &&unEquipo.getId() == E.getId()
                                           && unJugador.getId() == J.getId())
                           {     idEquipo = unEquipo.getId();
                               idJugador = unJugador.getId();
                               unEquipo.setCantJugS(unEquipo.getCantJugS() +1);
                                  }

                          }
                  }


 int ClJQ = 0;
               for(JugadorEquipo unJQ : listaJugadorEquipo) {
               if(unJQ.getIdEquipo().equals(E.getId())  && unJQ.getNumero() == numJ)
               {
                   ClJQ++;
              }
          }
               int i  =E.getCantJugT();
           if (E.getCantJugT() > 11 && J.getTipo().equals("T")) {
                       System.out.println("Ya se ingreso la cantidad maxima de Titulares");
                   }
                       if(ClJQ>0) {
                       System.out.println("Ya existe este numero en el equipo");
                       }
                        if (E.getCantJugT() <= 11 && J.getTipo().equals("T")) {
                           try {
                                JugadorEquipo pJugadorEquipo = new JugadorEquipo(idJugador, idEquipo, numJ);
                               listaJugadorEquipo.add(pJugadorEquipo);
                               System.out.println("Jugador ingresado con exito.");
                           } catch (Exception e) {
                               System.out.println("Ocurrio un error.");
                          }
                      }


                   if (E.getCantJugS() > 5 && J.getTipo().equals("S")) {
                       System.out.println("Ya se ingreso la cantidad maxima de Suplentes");
                   }
                   if ((E.getCantJugS() <= 5 && J.getTipo().equals("S"))) {
                      try {
                           JugadorEquipo pJugadorEquipo = new JugadorEquipo(idJugador, idEquipo, numJ);
                          listaJugadorEquipo.add(pJugadorEquipo);
                          System.out.println("Jugador ingresado con exito.");
                      } catch (Exception e) {
                          System.out.println("Ocurrio un error.");
                      }

                  }







           }
       }








    public static void bajaJugadorEquipo(){
         int contJE = ContJugadorEquipo();
         int contE = ContEquipos();
        int cont =0;
         JugadorEquipo EQ =  null;
        List<JugadorEquipo> listaJugadorESelct = new ArrayList<>();
         if (contJE == 0) {
             System.out.println("No hay jugadores en equipos registrados.");
        }  else {
             listarEquipos();
             if(contE>0) {
                 System.out.println("Elija un equipo para borrar un jugador para borrar.");
                 int numE = scan.nextInt();
try  {
    for (JugadorEquipo unJE : listaJugadorEquipo) {
         if (listaEquipo.get(numE).getId().equals(unJE.getIdEquipo())) {
             System.out.println(cont + ". " + NomDelJ(unJE.getIdJugador()) + "  ");
             listaJugadorESelct.add(unJE);
            cont++;
        }
     }
}
 catch (Exception e) {
     System.out.println("No existe el equipo selecionado");
}         if (cont == 0) {
                     System.out.println("Este equipo no cuenta con jugadores ingresados");
                } else {
                     System.out.println("Selecione el jugador a eliminar");
                    int num = scan.nextInt();
                     for (JugadorEquipo unJe : listaJugadorEquipo) {
                         if (unJe == listaJugadorESelct.get(num)) {
                             EQ = unJe;
                         }
                     }
                    try {
                         listaJugadorEquipo.remove(EQ);
                        System.out.println("Jugador de equipo eliminado.");
                        for(Jugador Pjug : listaJugador) {
                            if (EQ.getIdJugador().equals(Pjug.getId()) && Pjug.getTipo().equals("T"))
                            {
                                listaEquipo.get(numE).setCantJugT(listaEquipo.get(numE).getCantJugT() -1);
                                System.out.println(listaEquipo.get(numE).getCantJugT());
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("El jugador en equipo no existe.");
                    }
                }
            }




         }


             }





     public static int ContJugadorEquipo(){
         int cont = 0;
         for(JugadorEquipo unJQ : listaJugadorEquipo){
             cont++;
         }

         return cont;
     }

    public  static  void  ListarJugadorEquipo(){
         int contE =  ContEquipos();
         listarEquipos();
         String Nom  = "";
 String nom = "";
     int cont = 0;


         if(contE == 0){

         }
         else{
             System.out.println("Ingresar el numero del equipo");
             int num = scan.nextInt();
                 for (JugadorEquipo unJE : listaJugadorEquipo) {

                     if (listaEquipo.get(num).getId().equals(unJE.getIdEquipo())) {
                         Nom = NomDelJ(unJE.getIdJugador());
                         System.out.println(cont + ". " +  Nom+ "  ");
                         cont++;
                     }

                 }




         }

         if(cont==0)
         {
             System.out.println("No existen jugadores para este equipo");
         }
     }
    public static String NomDelJ(String idJ) {
        String nom = "";
        String ape = "";
        String Resultado = "";
        for (Jugador unJugador : listaJugador) {
            if (unJugador.getId().equals(idJ)) {
                nom = unJugador.getNombre();
                ape = unJugador.getApellido();
                Resultado = nom + " " + ape;
                break;
            }
        }
        return  Resultado;
    }



}