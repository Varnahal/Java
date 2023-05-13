package CursoDeJava.Apps.Aula12;

public class Aula12 {

    public static void main(String[] args) {
       Carro carro = new Carro("Golf"); 
       carro.dano(10);
       carro.info();

       CarroCombate c2 = new CarroCombate("Penio", 100);
       c2.atirar();
       c2.atirar();
       c2.atirar();
       c2.atirar();
       c2.atirar();
       c2.atirar();
       c2.atirar();
       c2.info();
    }
    
    
}
