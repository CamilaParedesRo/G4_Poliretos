package Poliretos_G4.SerieNumerica;

import java.util.Scanner;

public class SerieNumerica_06 {
 public void G4_SeriesNumericas_S6(Scanner scanner){
      System.out.println(" ");
      System.out.println("Serie Numerica 06");
      int a = 1, n ;
      System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
      n = scanner.nextInt();
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0; i < n; i++) {
          System.out.print(a + " ");
          a = a + (2*i) + 3;
      }
      System.out.println(" ");
  }
}
