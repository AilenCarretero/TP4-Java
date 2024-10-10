import java.util.Scanner;

public class Logica {

    private static boolean regresarMenu() {
        //Creamos un método para invocar la salida al menú principal.
        Scanner sc = new Scanner(System.in);
        System.out.println(" " +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine();
        System.out.println("");
        Main.delay();
        return rta.equalsIgnoreCase("si");
    }

    public static void opcion1() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            String[][] pais_ciudad = new String[4][4];

            //Le pedimos al usuario que ingrese un país y tres ciudades de ese pais.
            for (int i = 0; i < 4; i++) {
                System.out.print("Introduce un país " + (i + 1) + ": ");
                pais_ciudad[i][0] = sc.nextLine();

                for (int j = 1; j < 4; j++) {
                    System.out.print("Introduce una ciudad " + j + " de " + pais_ciudad[i][0] + ": ");
                    pais_ciudad[i][j] = sc.nextLine();
                }
            }

            System.out.println("");

            //Le imprimimos el resultado al usuario.
            for (int i = 0; i < 4; i++) {
                System.out.print("País: " + pais_ciudad[i][0] + "\n   Ciudades: ");
                for (int j = 1; j < 4; j++) {
                    System.out.print(pais_ciudad[i][j] + " ");
                }
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion2() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario el tamaño de ambos array.
            System.out.print("Ingrese el tamaño del Array X: ");
            int X = sc.nextInt();
            System.out.print("Ingrese el tamaño del Array Y: ");
            int Y = sc.nextInt();

            System.out.println("");

            //Le solicitamos al usuario que ingrese los números del primer array.
            int[][] array1 = new int[X][Y];
            System.out.println("Ingrese los valores para el primer array de tamaño [" + X + "," + Y + "]:");
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    System.out.print("Posición [" + i + "][" + j + "]: ");
                    array1[i][j] = sc.nextInt();
                }
            }

            //Le solicitamos al usuario que ingrese los números del primer array.
            int[][] array2 = new int[Y][X];
            System.out.println("Ingrese los valores para el segundo array de tamaño [" + Y + "," + X + "]:");
            for (int i = 0; i < Y; i++) {
                for (int j = 0; j < X; j++) {
                    System.out.print("Posición [" + i + "][" + j + "]: ");
                    array2[i][j] = sc.nextInt();
                }
            }

            //Creamos un tercer array y almacenamos el resultado de multiplicar las filas por las columnas.
            int[][] array3 = new int[X][Y];
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    array3[i][j] = array1[i][j] * array2[j][i];
                }
            }

            System.out.println("");

            //Imprimimos los resultados al usuario.
            System.out.println("Primer array ([" + X + "," + Y + "]):");
            o2Array(array1);

            System.out.println("Segundo array ([" + Y + "," + X + "]):");
            o2Array(array2);

            System.out.println("Resultado de la multiplicación ([" + X + "," + Y + "]):");
            o2Array(array3);

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }
    public static void o2Array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            //Método para imprimir el Array de forma ordenada.
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void opcion3() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int X;

            do {
                //Le solicitamos al usuario que ingrese un número.
                System.out.print("Ingrese un número entre 3 y 10: ");
                X = sc.nextInt();
            } while (X < 3 || X > 10);

            System.out.println("");

            //Solicitamos el ingreso de los valores para el array.
            int[][] array = new int[X][X];
            System.out.println("Ingrese los valores para la matriz:");
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < X; j++) {
                    System.out.print("Valor para matriz[" + i + "][" + j + "]: ");
                    array[i][j] = sc.nextInt();
                }
            }

            System.out.println("");

            //Imprimimos al usuario el array.
            System.out.println("Matriz ingresada:");
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < X; j++) {
                    System.out.print(array[i][j] + "\t");
                }
            }

            System.out.println("");

            //Realizamos la suma de las columnas del array.
            int[] sumasArray = new int[X];
            for (int j = 0; j < X; j++) {
                for (int i = 0; i < X; i++) {
                    sumasArray[j] += array[i][j];
                }
            }

            //Imprimimos el resultado al usuario.
            System.out.println("Suma de las columnas:");
            for (int j = 0; j < X; j++) {
                System.out.print(sumasArray[j] + "\t");
            }

            System.out.println("");

            int total = 0;
            for (int j = 0; j < X; j++) {
                total += sumasArray[j];
            }

            System.out.println("Total: " + total);

            //Invocamos al método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion4() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int X;

            do {
                //Le solicitamos al usuario que ingrese un número.
                System.out.print("Ingrese un número entre 4 y 10: ");
                X = sc.nextInt();
            } while (X < 4 || X > 10);

            System.out.println("");

            //Generamos un array del tamaño elegido por el usuario.
            int[][] array = new int[X][X];
            boolean arrayCompleto = false;

            //Generamos un menú con opciones para trabajar en el array.
            while (true) {
                System.out.println("=== ARRAYS === " +
                        "\n" +
                        "\n1. Llenar un Array" +
                        "\n2. Sumar una fila" +
                        "\n3. Sumar una columna" +
                        "\n4. Sumar la diagonal principal" +
                        "\n5. Sumar la diagonal inversa" +
                        "\n6. Sacar el promedio de todos los valores." +
                        "\n" +
                        "\n0. Salir");
                int opcion = sc.nextInt();

                System.out.println("");

                switch (opcion) {
                    case 0:
                        Main.menu();
                        break;
                    case 1:
                        llenarArray(array, sc);
                        arrayCompleto = true;
                        break;
                    case 2:
                        if (arrayCompleto) {
                            System.out.print("Ingrese el número de fila (0 a " + (X - 1) + "): ");
                            int fila = sc.nextInt();
                            if (fila >= 0 && fila < X) {
                                System.out.println("Suma de la fila " + fila + ": " + sumaFila(array, fila));
                            } else {
                                System.out.println("Fila no válida.");
                            }
                        } else {
                            System.out.println("Debe rellenar el array.");
                        }
                        break;
                    case 3:
                        if (arrayCompleto) {
                            System.out.print("Ingrese el número de columna (0 a " + (X - 1) + "): ");
                            int columna = sc.nextInt();
                            if (columna >= 0 && columna < X) {
                                System.out.println("Suma de la columna " + columna + ": " + sumaColumna(array, columna));
                            } else {
                                System.out.println("Columna no válida.");
                            }
                        } else {
                            System.out.println("Debe rellenar la matriz primero.");
                        }
                        break;
                    case 4:
                        if (arrayCompleto) {
                            System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal(array));
                        } else {
                            System.out.println("Debe rellenar la matriz primero.");
                        }
                        break;
                    case 5:
                        if (arrayCompleto) {
                            System.out.println("Suma de la diagonal inversa: " + sumaDiagonalInversa(array));
                        } else {
                            System.out.println("Debe rellenar la matriz primero.");
                        }
                        break;
                    case 6:
                        if (arrayCompleto) {
                            System.out.println("Media de todos los valores: " + medioArray(array));
                        } else {
                            System.out.println("Debe rellenar la matriz primero.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }
    }
    private static void llenarArray(int[][] array, Scanner scanner) {
        //Le solicitamos al usuario que ingrese los números para llenar el array.
        System.out.println("Ingrese los números para llenar el array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("");

        System.out.println("Matriz rellenada con éxito.");
    }
    private static int sumaFila(int[][] array, int fila) {
        //Realizamos la suma de las filas del array.
        int suma = 0;
        for (int j = 0; j < array[fila].length; j++) {
            suma += array[fila][j];
        }
        return suma;
    }
    private static int sumaColumna(int[][] array, int columna) {
        //Realizamo las sumas de las columnas del array.
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i][columna];
        }
        return suma;
    }
    private static int sumaDiagonalPrincipal(int[][] array) {
        //Realizamos una suma diagonal.
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i][i];
        }
        return suma;
    }
    private static int sumaDiagonalInversa(int[][] array) {
        //Realizamos una suma diagonal.
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i][array.length - 1 - i];
        }
        return suma;
    }
    private static double medioArray(int[][] array) {
        //Calculamos el promedio del array.
        int suma = 0;
        int totalElementos = array.length * array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma += array[i][j];
            }
        }
        return (double) suma / totalElementos;
    }

    public static void opcion5() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Generamos un array con los productos y cantidad.
            String[][] golosinas = {
                    {"KitKat", "32", "10"},
                    {"Chicles", "2", "50"},
                    {"Caramelos de Menta", "2", "50"},
                    {"Huevo Kinder", "25", "10"},
                    {"Chetoos", "30", "10"},
                    {"Twix", "26", "10"},
                    {"M&M'S", "35", "10"},
                    {"Papas Lays", "40", "20"},
                    {"Milkybar", "30", "10"},
                    {"Alfajor Tofi", "20", "15"},
                    {"Lata Coca", "50", "20"},
                    {"Chitos", "45", "10"}
            };

            double ventasTotales = 0;
            boolean running = true;

            while (running) {
                //Generamos el menú de la maquina expendedora.
                System.out.println("\n" +
                        "\nSeleccione una opción: " +
                        "\n" +
                        "\n1. Solicitar golosina." +
                        "\n2. Mostrar golosinas." +
                        "\n3. Rellenar máquina." +
                        "\n4. Apagar máquina." +
                        "\n" +
                        "\n0. Salir.");

                int select = sc.nextInt();

                System.out.println("");

                switch (select) {
                    case 0:
                        Main.menu();
                        break;
                    case 1:
                        //Le solicitamos al usuario la posición de la golosina.
                        System.out.print("Ingrese la posición de la golosina (0-11): ");
                        int posicion = sc.nextInt();

                        if (posicion < 0 || posicion >= golosinas.length) {
                            System.out.println("Posición inválida. Intente nuevamente.");
                        } else {
                            int cantidadActual = Integer.parseInt(golosinas[posicion][2]);
                            if (cantidadActual > 0) {
                                int precio = Integer.parseInt(golosinas[posicion][1]);
                                golosinas[posicion][2] = String.valueOf(cantidadActual - 1);
                                ventasTotales += precio;
                                System.out.println("Ha seleccionado: " + golosinas[posicion][0]);
                            } else {
                                System.out.println("Lo siento, " + golosinas[posicion][0] + " está agotada.");
                            }
                        }
                        break;

                    case 2:
                        //Imprimimos todas las golosinas disponibles.
                        System.out.println("Golosinas disponibles: ");
                        for (int i = 0; i < golosinas.length; i++) {
                            System.out.println(i + ". " + golosinas[i][0] + " - Precio: " + golosinas[i][1] + " - Stock: " + golosinas[i][2]);
                        }
                        break;

                    case 3:
                        //Solicitamos el ingreso de la contraseña para acceder a la maquina.
                        System.out.print("Ingrese la contraseña: ");
                        String contrasena = sc.next();

                        if (contrasena.equals("1234")) {
                            //Le solicitamos al admin la posición de la golosina que desea rellenar.
                            System.out.print("Ingrese la posición de la golosina (0-11): ");
                            int posicionRellenar = sc.nextInt();

                            if (posicionRellenar < 0 || posicionRellenar >= golosinas.length) {
                                System.out.println("Posición inválida. Intente nuevamente.");
                            } else {
                                System.out.print("Ingrese la cantidad a recargar: ");
                                int cantidadARecargar = sc.nextInt();

                                //Rellenamos la maquina expendedora y le imprimimos un aviso al usuario.
                                int cantidadActual = Integer.parseInt(golosinas[posicionRellenar][2]);
                                golosinas[posicionRellenar][2] = String.valueOf(cantidadActual + cantidadARecargar);
                                System.out.println("Se han rellenado " + cantidadARecargar + " unidades de " + golosinas[posicionRellenar][0]);
                            }
                        } else {
                            System.out.println("Contraseña incorrecta.");
                        }
                        break;

                    case 4:
                        //Apagamos la maquina expendedora.
                        System.out.println("Apagando máquina. Ventas totales: " + ventasTotales);
                        running = false;
                        break;

                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            }
        }
    }
}
