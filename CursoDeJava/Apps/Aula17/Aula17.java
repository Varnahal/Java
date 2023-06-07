package CursoDeJava.Apps.Aula17;
import java.util.Scanner;

public class Aula17 {
    public static void main(String[] args) {
        Scanner sacan = new Scanner(System.in);
        int posicao = 0;
        posicao = sacan.nextInt();


        switch (posicao) {
            case 1:
                System.out.printf("Posicao 1");
                break;
            case 2:
                System.out.printf("Posicao 2");
                break;
            case 3:
                System.out.printf("Posicao 3");
                break;
        
            default:
                System.out.printf("Posicao invalida");
                break;
        }
    }
}
