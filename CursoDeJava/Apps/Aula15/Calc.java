package CursoDeJava.Apps.Aula15;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "s";

        while(opc.equals("S")|| opc.equals("s")){
            System.out.printf("Digite o primeiro valor:%n","");
            n1.setValor(scan.nextInt());
            System.out.printf("Digite o segundo valor:%n","");
            n2.setValor(scan.nextInt());
            res.setValor(n1.getValor()+n2.getValor());
            System.out.printf("A soma de %d +  %d = %d%n",n1.getValor(),n2.getValor(),res.getValor());
            System.out.printf("Deseja continuar? S ou N?");
            opc = scan.next();
        }

        
        

    }
    
}
