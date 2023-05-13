package CursoDeJava.Apps.Aula12;

public class Carro {
    private String nome = "";
    private int blindagem = 0;
    private  boolean destruido = false;

    public Carro(String nome){
        this.nome = nome;
    }


    public String getNome() {
        return this.nome;
    }

    public int getBlindagem() {
        return this.blindagem;
    }
    public void setBlindagem(int b) {
         this.blindagem -= b;
    }

    public boolean getDestruido() {
        return this.destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public void dano(int dano){
        setBlindagem(dano);
        if(getBlindagem()<=0){
            setDestruido(true);
        }
    }

    public void info(){
        System.out.printf("nome do carro: %s%nBlindagem: %d%nEsta destruido? %s",getNome(),getBlindagem(),getDestruido()?"Sim":"Não");
    }

}

    
