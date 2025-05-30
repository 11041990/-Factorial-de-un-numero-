
package vocalesonovocales;

import java.util.Scanner;

public class VOCALESONOVOCALES {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("Ingresa letras para saber si son vocales o consonantes. Ingresa un espacio para terminar.");

        while (true) {
            System.out.print("Ingresa una letra: ");
            letra = scanner.next().charAt(0);

            if (letra == ' ') {
                break;
            }

            if (Character.isLetter(letra)) {
                if (esVocal(letra)) {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            } else {
                System.out.println("Por favor, ingresa una letra válida.");
            }
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }

    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
    
}
