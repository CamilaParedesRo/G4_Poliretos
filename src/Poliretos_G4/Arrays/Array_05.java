package Poliretos_G4.Arrays;

import java.util.Random;

public class Array_05 {
public void G4_Array_5() {
    System.out.println("Array 5"); 
        String nombreCompleto = "CamilaParedes"; // Reemplaza con tu nombre completo
        int longitud = nombreCompleto.length();
        
        // Calcula el tamaño de la matriz cuadrada
        int dimension = (int) Math.ceil(Math.sqrt(longitud));
        char[][] matriz = new char[dimension][dimension];

        // Inicializa la matriz con espacios
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = ' ';
            }
        }

        Random random = new Random();
        int index = 0;
        
        while (index < longitud) {
            int fila = random.nextInt(dimension);
            int columna = random.nextInt(dimension);

            // Si la posición está ocupada, coloca un '*' y continúa
            if (matriz[fila][columna] == ' ') {
                matriz[fila][columna] = nombreCompleto.charAt(index);
                index++;
            } else {
                matriz[fila][columna] = '*';
            }

            // Imprimir la matriz en su estado actual con un delay
            imprimirMatriz(matriz);

        }
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
