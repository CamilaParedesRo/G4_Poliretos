package Poliretos_G4.CadenaDeCarecteres;

import java.util.Scanner;

public class CadenaDeCaracteres_03 {
    public void G4_CadenadeCaracteres_3( Scanner scanner) {
      System.out.println("Cadena de caracteres 3"); 
      String frase;
        System.out.println("Ingrese una frase: ");
       frase = scanner.nextLine();
       String sinVocales = frase.replaceAll("[a,e,i,o,u,A,E,I,O,U]", " ");
       System.out.println(sinVocales);
       System.out.println(" "); 

   } 
}
