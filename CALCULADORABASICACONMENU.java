
package calculadorabasicaconmenu;

import java.util.Scanner;

public class CALCULADORABASICACONMENU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                continuar = false;
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea continuar? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                continuar = false;
            }
        }

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        scanner.close();
        
    }
    
}
