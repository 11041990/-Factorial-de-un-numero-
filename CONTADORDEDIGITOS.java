
package contadordedigitos;

import java.util.Scanner;

public class CONTADORDEDIGITOS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertimos el número a su valor absoluto para contar los dígitos correctamente
        int numeroAbsoluto = Math.abs(numero);
        
        // Contamos los dígitos
        int cantidadDigitos = String.valueOf(numeroAbsoluto).length();
        
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        
        scanner.close();
    }
    
}
