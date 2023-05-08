package CursoDeJava.Apps.Aula11;

public class Jogadores {
    private int vidas = 0;
    private int num = 0;
    static int numJogadores = 0;
    static int pontos = 0;

    public Jogadores(int n){
        this.num = n;
        numJogadores++;
        System.out.printf("%nJogador criado: %s%n", num);
    }

    public void info(){
        System.out.printf("%n---------------------%n");
        System.out.printf("%nJogador numero: %d%n", this.num);
        System.out.printf("Vidas: %d%n", this.vidas);
        System.out.printf("numero de jogares: %d%n", numJogadores);
        System.out.printf("pontos globais: %d%n", pontos);
    }
    static void pontos(){
        pontos +=10;
    }
}
