package calculadora;

import java.util.Scanner;

/**
 * Clase SumaNumeros que permite sumar dos números ingresados por el usuario.
 * 
 * <p>Este programa solicita al usuario dos números enteros, realiza su suma y
 * muestra el resultado en la consola.</p>
 * 
 * @author Gabriel
 */
public class SumaNumeros {

    /**
     * Método principal que ejecuta el programa para sumar dos números.
     * 
     * <p>Este método utiliza la clase Scanner para leer entradas del usuario, 
     * realiza la operación de suma y muestra el resultado.</p>
     * 
     * @param args Argumentos de línea de comando (no se utilizan).
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos un número al usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedimos un segundo número al usuario
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Sumamos los números ingresados
        int suma = numero1 + numero2;

        // Mostramos el resultado de la suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}
