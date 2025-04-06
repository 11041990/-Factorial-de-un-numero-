
package adivinarelnumero;

import java.util.Random;
import java.util.Scanner;

public class ADIVINARELNUMERO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
50        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int suposicion = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        while (suposicion != numeroAleatorio) {
            System.out.print("Introduce tu suposición: ");
            suposicion = scanner.nextInt();

            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número correcto.");
            }
        }

        scanner.close();
    }
    
}
