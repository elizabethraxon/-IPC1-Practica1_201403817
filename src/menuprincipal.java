
/**
 *
 * @author Zelda
 */
import java.util.Scanner;

public class menuprincipal {

    public static String nombre = "", movimiento = "";
    public static Scanner leer = new Scanner(System.in);
    public static int tamaño = 0;
    public static int cabeza_fila = 2;
    public static int cabeza_columna = 2;

    public static void tablero(int mov) {
     
      
        System.out.println("ingrese tamaño X)");
        tamaño = leer.nextInt();
        String imp_tablero [][]=new String[tamaño][tamaño];
  
        for (int i = 0; i < tamaño; i++) {
           
            for (int j = 0; j < tamaño; j++) {
               
                if (i==0 || i==tamaño-1){
                    imp_tablero[i][j]="#";
                }
                    else 
                    if(j==0 || j==tamaño-1){
                           imp_tablero[i][j]="#";
                           
                    }else
                        imp_tablero[i][j]="";
                        }
        }
      
    }

    public static void iniciar_juego() {
        System.out.println("   iniciar juego");
        int mov = 0;
        movimiento = leer.next();
//logica del juego
        if (movimiento.equals("w")) {
            mov = 1;
        } else if (movimiento.equals("s")) {

        } else if (movimiento.equals("a")) {
            cabeza_columna = cabeza_columna - 1;

        } else if (movimiento.equals("d")) {
            cabeza_columna = cabeza_columna + 1;
        }

        tablero(mov);

    }

    public static void ingresar_usuario() {
        System.out.println("    ingresar usuario");

        nombre = leer.next();
        System.out.println(" nombre es:" + nombre);
        MenuPrincipal();

    }
    
    public static void datos_estudiante(){
      
        System.out.println("---------------------ESTUDIANTE------------------------");
        System.out.println("         UNIVERSIDAD DE SAN CARLOS DE GUATEMALA        ");
        System.out.println("                 FACULTAD DE INGENIERÍA                ");
        System.out.println("             ESCUELA DE CIENCIAS Y SISTEMAS            ");
        System.out.println("     INTRODUCCIÓN A LA PROGRAMACIÓN Y COMPUTACIÓN 1    ");
        System.out.println("-------------------------------------------------------");
        System.out.println("       201403817 Silvia Elizabeth Raxón Ochoa          ");
        System.out.println("-------------------------------------------------------\n");
                
    }
    public static void historial_partidas(){
    }

    public static void MenuPrincipal() {

        int l;
          
        do {

            System.out.println(" ----------------------------");
            System.out.println("|"+ "\033[31m             Menu"+"           |");
            System.out.println("|----------------------------|");
            System.out.println("|                            |");
            System.out.println("|"+"\033[34m 1) INICIAR JUEGO"+"           |");
            System.out.println("|                            |");
            System.out.println("|"+"\033[34m 2) DATOS ESTUDIANTE"+"        |");
            System.out.println("|                            |");
            System.out.println("|"+"\033[34m 3) HISTORIAL DE PARTIDAS"+"   |");
            System.out.println("|                            |");
            System.out.println("|"+"\033[34m 4) SALIR"+"                   |");
            System.out.println(" ----------------------------");
            System.out.println(""); // Espacio de adorno
            l = leer.nextInt();
            System.out.println("\n\n\n"); //Espacio de Adorno

            switch (l) {

                case 1:
                    iniciar_juego();
                    break;

                case 2:
                    datos_estudiante();
                    break;

                case 3:
                    historial_partidas();;
                    break;
                    
                case 4: 
                    System.exit(0);
                    break;
                                    

            }
        } while (l != 4);

    }

}
