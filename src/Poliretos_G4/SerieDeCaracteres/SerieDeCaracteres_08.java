package Poliretos_G4.SerieDeCaracteres;

public class SerieDeCaracteres_08 {
    public void G4_Secuencia_CaracterS8() {
        System.out.println("Secuencia de caracteres S8 ");
        imprimirSecuencia('a', 1);
        imprimirSecuencia('b', 3);
        imprimirSecuencia('c', 5);
        imprimirSecuencia('d', 7);
        imprimirSecuencia('e', 9);
        imprimirSecuencia('f', 11);
    }

    public void imprimirSecuencia(char letra, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(letra);
        }
        System.out.print(" ");
    }
}
