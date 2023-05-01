package CursoDeJava.Apps.Aula08;
import java.security.SecureRandom;

public class Aula08 {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 5;
        int [][] numeros = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("o numero na linha %d e coluna %d é %d",l,c,numeros[l][c]);
            }
        }
    }
}
