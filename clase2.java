package EstructuraDeDatos;

import javax.swing.JOptionPane; 
public class clase2 {


    public static void main(String[] args) {
    double[] arreglo = new double[8];
    int contador = 0;
    System.out.println("Ingresee las Notas definitivas de las materias: ");
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota"));
            if (arreglo[i] >= 3.0) {
                contador++;
            }
            JOptionPane.showMessageDialog(null, contador + " Nota ingresada: " + arreglo[i +1]);

        }
        JOptionPane.showMessageDialog(null, "Cantidad de notas mayores o iguales a 3.0: " + contador);
    }
}