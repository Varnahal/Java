public class Aula10 {
    public static void main(String[] args) {
        canal("Varnahal",5);
        System.out.print(soma(10,5));
    }

    public static void canal(String c, int l) {
        for (int i = 0; i < l; i++) {
            System.out.printf("%s%n", c);
        }
        
    }

    public static int soma(int n1,int n2) {
        return n1+n2;
    }
    public static Float soma(Float n1,Float n2) {
        return n1+n2;
    }
}
