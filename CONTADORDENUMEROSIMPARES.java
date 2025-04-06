
package contadordenumerosimpares;

import java.util.Scanner;

public class CONTADORDENUMEROSIMPARES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int numero;
         
          // Solicitar al usuario que ingrese un número entero positivo
        do {
            System.out.print("Por favor, ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Eso no es un número válido. Por favor, ingrese un número entero positivo: ");
                scanner.next(); // Limpiar la entrada no válida
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

        // Imprimir los números impares desde 1 hasta el número ingresado
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        scanner.close();
    }
    
}
