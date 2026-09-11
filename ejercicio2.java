package EstructuraDeDatos;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;
        arreglo[3] = 4;
        arreglo[4] = 5;
        arreglo[5] = 6;
        arreglo[6] = 7;
        arreglo[7] = 8;
        arreglo[8] = 9;
        arreglo[9] = 10;

        mostrarArreglo(arreglo);
        Arrays.fill(arreglo, 2);

        // copiar contenido de un arreglo a otro
        int[] arreglo2 = new int[10];
        System.arraycopy(arreglo, 0, arreglo2, 0, arreglo.length);
        mostrarArreglo(arreglo2);

        // para comparar dos arreglos
        if (Arrays.equals(arreglo, arreglo2)) {
            JOptionPane.showMessageDialog(null, "Los arreglos son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Los arreglos son diferentes");
        }

        // para ordenar un arreglo
        Arrays.sort(arreglo);
        mostrarArreglo(arreglo);

        // binarySearch para buscar un elemento en un arreglo ordenado
        int indice = Arrays.binarySearch(arreglo, 2);
        if (indice >= 0) {
            JOptionPane.showMessageDialog(null, "El elemento 2 se encuentra en el índice: " + indice);
        } else {
            JOptionPane.showMessageDialog(null, "El elemento 2 no se encuentra en el arreglo");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // binarySearch para nombres
        String[] nombres = new String[5];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";
        nombres[3] = "Ana";
        nombres[4] = "Luis";

        Arrays.sort(nombres);
        mostrarArregloLetra(nombres);

        int indice2 = Arrays.binarySearch(nombres, "Maria");
        if (indice2 >= 0) {
            JOptionPane.showMessageDialog(null, "El nombre Maria se encuentra en el índice: " + indice2);
        } else {
            JOptionPane.showMessageDialog(null, "El nombre Maria no se encuentra en el arreglo");
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        String mensaje = "Contenido del arreglo: ";
        for (int i = 0; i < arreglo.length; i++) {
            mensaje += arreglo[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Arreglo para imprimir nombres
    public static void mostrarArregloLetra(String[] arreglo) {
        String mensaje = "Contenido del arreglo: ";
        for (int i = 0; i < arreglo.length; i++) {
            mensaje += arreglo[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // para copiar un arreglo a otro
    public static void copiarArreglo(int[] arreglo, int[] arreglo2) {
        System.arraycopy(arreglo, 0, arreglo2, 0, arreglo.length);
    
    }
}

