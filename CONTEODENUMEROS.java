
package conteodenumeros;

import java.util.Scanner;

public class CONTEODENUMEROS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();
        
         int positivos = 0;
         int negativos = 0;
         
         for (int i = 0; i < cantidad; i++) {
             System.out.print("Ingresa el número " + (i + 1) + ": ");
             int numero = scanner.nextInt();
             
             if (numero > 0) {
                   positivos++;
                    } else if (numero < 0) {
                         negativos++;
                      }    
             }
          System.out.println("Cantidad de números positivos: " + positivos);
            System.out.println("Cantidad de números negativos: " + negativos);
            
         }
    }
    

