package CursoDeJava.Apps.Aula07;

import java.util.Arrays;

public class Aula07 {
    public static void main(String[] args){
        int[] num = {6,23,8,1,5,65,33,75,1,2};
        int[] numeros = new int [10];

        Arrays.sort(num);
        //Arrays.fill(numeros, 10);
        System.arraycopy(num, 0, numeros, 0, 10);

        for (int n : numeros) {
            System.out.printf("%d - ",n);
        }
    }
}
