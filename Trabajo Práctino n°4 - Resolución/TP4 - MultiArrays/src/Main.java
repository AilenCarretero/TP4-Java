import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void delay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        //Generamos un menú principal.
        while(!exit) {
            System.out.println(" ====== Menú Principal ====== " +
                    "\n" +
                    "\n1.   Cuadro de países y ciudades." +
                    "\n2.   Multiplicando dos Arrays." +
                    "\n3.   Suma de las columnas del Array." +
                    "\n4.   Jugando con los Arrays" +
                    "\n5.   Maquina Expendedora" +
                    "\n" +
                    "\n0.   Salir");

            int opcion = sc.nextInt();
            System.out.println("");

            switch(opcion) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Logica.opcion1();
                    break;
                case 2:
                    Logica.opcion2();
                    break;
                case 3:
                    Logica.opcion3();
                    break;
                case 4:
                    Logica.opcion4();
                    break;
                case 5:
                    Logica.opcion5();
                    break;
                default:
                    System.out.println("El número ingresado no es válido, intente nuevamente.");
            }
        }
    }
}