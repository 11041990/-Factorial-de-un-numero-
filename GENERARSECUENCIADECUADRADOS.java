
package generarsecuenciadecuadrados;

import java.util.Scanner;

public class GENERARSECUENCIADECUADRADOS {

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

        // Calcular y mostrar los cuadrados de los números desde 1 hasta el número ingresado
        int i = 1;
        do {
            System.out.println("El cuadrado de " + i + " es " + (i * i));
            i++;
        } while (i <= numero);

        scanner.close();
        
    }
    
}
