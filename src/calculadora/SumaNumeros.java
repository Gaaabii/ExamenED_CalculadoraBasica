package calculadora;
import java.util.Scanner;
public class SumaNumeros {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
//Pedimos un numero al cliente
System.out.print("Ingresa el primer número: ");
//Lo guardamos
int numero1 = scanner.nextInt();
//Pedimos un segundo numero
System.out.print("Ingresa el segundo número: ");
int numero2 = scanner.nextInt();
//Lo guardamos
int suma = numero1 + numero2;
//Sumamos los numeros a la veaz que los mostramos
System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
}
}
//cambio realizado con la rama feature
//comentario despues de haber realizado la fusion