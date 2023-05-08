package CursoDeJava.Apps.Aula11;

public class Aula11 {
    public static void main(String[] args) {
        int cont = 0;

        Jogadores j1 = new Jogadores(++cont); 
        Jogadores j2 = new Jogadores(++cont); 
        Jogadores j3 = new Jogadores(++cont); 
        Jogadores.pontos();
        Jogadores.pontos();
        Jogadores.pontos();
        Jogadores.pontos();
        Jogadores.pontos();
        j1.info();
    }
    
}
