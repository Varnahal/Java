package Apps.app002;
import java.util.*;

public class variaveis {

    public static void main(String[] args){
        int idade = 17;
        double altura = 182.5;
        Boolean solteiro = true;
        double res = idade + altura;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Resultado"+res+" Nome: " + nome + " Idade: " + idade +  (solteiro?" esta solteiro":"não esta solteiro") );
    }
    
}
