package EstructuraDeDatos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tam;

        System.out.print("Ingrese el tamaño del arreglo: ");
        tam = scanner.nextInt();
        int[] arreglo = new int[tam];

        llamarArreglo(arreglo);
        mostrarArreglo(arreglo);
    }

    public static void llamarArreglo(int[] arreglo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }

    // para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        String mensaje = "Contenido del arreglo: ";
        for (int i = 0; i < arreglo.length; i++) {
            mensaje += arreglo[i] + " ";
        }
        System.out.println(mensaje);
    }
}
