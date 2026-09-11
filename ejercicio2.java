package EstructuraDeDatos;
import javax.swing.JOptionPane;
import java.util.Arrays; 
public class ejercicio2 {
    public static void main(String[] args){

        int arreglo[] = new int[10];
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
        Arrays.fill(arreglo,2);

        // copiar contenido de un arreglo a otro
        int arreglo2[] = new int[10];
        System.arraycopy(arreglo, 0, arreglo2, 0, arreglo.length);
        mostrarArreglo(arreglo2);
    }
    public static void mostrarArreglo(int[] arreglo) {
        String mensaje = "Contenido del arreglo: ";
        for (int i = 0; i < arreglo.length; i++) {
            mensaje += arreglo[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
