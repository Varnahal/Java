package CursoDeJava.Apps.Aula03;

public class Aula03 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 100;
        String res;

        res = num1>=num2 ? "Maior":"Menor";

        if(num1>num2){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
        System.out.println(res);


    }
}
