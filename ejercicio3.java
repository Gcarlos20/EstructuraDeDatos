package EstructuraDeDatos;

public class ejercicio3 {
 // array que contenga numeros del 1 al 10 
 // calcular suma de y la media de los elementos 
 
 public static void main(String[]args){
    int numeros[] = new int [10];
    int suma = 0;
    double media = 0.0;

    for(int i = 0; i < numeros.length; i ++){
        numeros[i] = i + 1;
        suma += numeros[i];
    } 
    System.out.println("La suma de los elementos del arreglo es: " + suma);

    media = (double) suma / numeros.length;
    System.out.println("La media de los elementos del arreglo es: " + media);
    
 }
}
