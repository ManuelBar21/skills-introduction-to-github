//🔹 Ejercicio 1: Uso de if para verificar números positivos y negativos
       // 📌 Objetivo: Pedir un número al usuario y determinar si es positivo, negativo o cero.

 // Importamos Scanner para leer datos del usuario
import java.util.Scanner;

// Definimos la clase principal
public class Ejercicio1 {
    public static void main(String[] args) { // Método principal

        // Creamos un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt(); // Leemos el número ingresado

        // Estructura de selección if-else para verificar el número
        if (numero > 0) {
            System.out.println("El número es positivo."); // Si el número es mayor que 0
        } else if (numero < 0) {
            System.out.println("El número es negativo."); // Si el número es menor que 0
        } else {
            System.out.println("El número es cero."); // Si el número es exactamente 0
        }
// Cerramos el scanner
        scanner.close();
    }
}

