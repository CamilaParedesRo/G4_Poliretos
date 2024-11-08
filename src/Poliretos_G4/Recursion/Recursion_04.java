package Poliretos_G4.Recursion;

import java.util.Scanner;

public class Recursion_04 {
public int G4_Recursion_4(Scanner scanner) {
        System.out.println("Recursion 4");
        
        if (scanner.hasNextLine()) {
            scanner.nextLine(); 
        }
        
        System.out.print("Ingrese la base: ");
        int a = scanner.nextInt();

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        System.out.print("Ingrese el exponente: ");
        int b = scanner.nextInt();

        int resultado = calcularPotencia(a, b);
        System.out.println("Resultado: " + resultado);

        return resultado;
    }

    public int calcularPotencia(int a, int b) {
        if (b == 0) {
            return 1; 
        }
        return a * calcularPotencia(a, b - 1); 
    }
}
