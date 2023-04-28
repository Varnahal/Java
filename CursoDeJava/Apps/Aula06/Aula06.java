package CursoDeJava.Apps.Aula06;
import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        // int n1 = 10,n2 = 11,n3 = 20,n4 = 32,n5 = 44;
        // int [] num = new int[5];
        // int [] numeros = {10,33,85,78,99};
        // num[0] = n1;
        // num[1] = n2;
        // num[2] = n3;
        // num[3] = n4;
        // num[4] = n5;
        // for (int i = 0; i < num.length; i++) {
        //     System.out.printf("%d%n",num[i]);
        // }
        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.printf("%d%n",numeros[i]);
        // }
        Scanner scan = new Scanner(System.in);

        char[] gabarito = {'a','c','a','b','d','e'};
        char[] respostas = new char[6];

        int nota = 0;


        for (int i = 0; i < respostas.length; i++) {
            respostas[i] = scan.nextLine().charAt(0);
        }
        for (int i = 0; i < gabarito.length; i++) {
            if(respostas[i]==gabarito[i]){
                System.out.print(respostas[i]);
                nota++;
            }
        }
        System.out.printf("Sua nota foi: %d",nota);
        
    }
}
