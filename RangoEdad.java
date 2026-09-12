package EstructuraDeDatos;

import javax.swing.JOptionPane;

public class RangoEdad {

    public static void main(String[] args) {
        final double PrecioBase = 1000000.0;

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del pasajero: "));

        if (edad < 2) {
            JOptionPane.showMessageDialog(null, "Lo siento, Anita no puede viajar al ser menor de 2 años");
        }
        else if (edad >= 2 && edad < 5) {
            double precioFinal = 0;
            JOptionPane.showMessageDialog(null, "El tiquete es gratis: $" + precioFinal);
        }
        else if (edad >= 5 && edad < 11) {
            double precioFinal = PrecioBase * 0.5; 
            JOptionPane.showMessageDialog(null, "El tiquete tiene 1/2 precio: $" + precioFinal);
        }
        else if (edad >= 11 && edad < 15) {
            double precioFinal = PrecioBase * 0.75; 
            JOptionPane.showMessageDialog(null, "El tiquete tiene 3/4 de precio: $" + precioFinal);
        }
        else if (edad >= 15) {
            double precioFinal = PrecioBase; // Precio normal
            JOptionPane.showMessageDialog(null, "Aplica precio normal. Valor a pagar: $" + precioFinal);
        }
    }
}