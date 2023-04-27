package CursoDeJava.Apps.Aula04;

import java.util.Scanner;

public class Aula04{
    public static void main(String[] args){

        int n1=0,n2=0,res=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n1 = scan.nextInt();
        System.out.println("Digite um numero: ");
        n2 = scan.nextInt();
        res = n1+n2;
        System.out.printf("A soma dos dois numeros é: %d%n",res);
    }
}