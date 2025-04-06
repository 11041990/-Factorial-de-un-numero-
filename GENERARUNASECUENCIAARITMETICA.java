
package generarunasecuenciaaritmetica;

import java.util.Scanner;

public class GENERARUNASECUENCIAARITMETICA {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Solicitar al usuario el primer número de la secuencia
        System.out.print("Ingresa el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();

        // Solicitar al usuario la diferencia entre los números
        System.out.print("Ingresa la diferencia entre los números: ");
        int diferencia = scanner.nextInt();

        // Solicitar al usuario el número máximo hasta el cual la secuencia debe continuar
        System.out.print("Ingresa el número máximo hasta el cual la secuencia debe continuar: ");
        int numeroMaximo = scanner.nextInt();

        // Generar y mostrar la secuencia aritmética
        int numeroActual = primerNumero;
        do {
            System.out.print(numeroActual + " ");
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);

        scanner.close();
        
    }
    
}
