package Poliretos_G4.Figura;

import java.util.Scanner;

public class Figura_09 {
public void G4_Figura_9(Scanner scanner) {
        System.out.println("Figura 9");
        System.out.print("Ingrese la altura de la figura: ");
    
        int altura = scanner.nextInt();
        int anchoFigura = (2 * altura) - 1;

        for (int nivelActual = 0; nivelActual < altura; nivelActual++) {
            for (int posicion = 1; posicion <= anchoFigura; posicion++) {
                if ((nivelActual == 0) && (posicion == altura)) {
                    System.out.print("");
                } else if ((nivelActual > 0) && (posicion == (altura - nivelActual))) {
                    System.out.print("|");
                } else if ((nivelActual > 0) && (posicion == (altura + nivelActual) - 1)) {
                    System.out.print("|");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
