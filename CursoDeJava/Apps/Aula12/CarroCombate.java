package CursoDeJava.Apps.Aula12;

public class CarroCombate extends Carro {

    private int municao = 0;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        super.setBlindagem(blindagem);
        this.municao = 100;
    }
    public void atirar(){
        this.municao -=1;
    }

    public void info(){
        super.info();
        System.out.printf("%s%d", "Munição:",this.municao);
    }
    
}
