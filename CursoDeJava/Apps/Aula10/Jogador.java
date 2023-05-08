package CursoDeJava.Apps.Aula10;

public class Jogador {

    private int vidas = 0;

    public Jogador(int n){
        this.vidas = 10;
        System.out.printf("%s%d", "Jogador criado numero ",n);
    }
    public int getVidas(){
        return this.vidas;
    }
    public void setVides(int v){
        if(v>3){
            System.out.printf("%n%s", "Erro valor acima do maximo permitido");
        }else if(v<0){
            this.vidas = 0;
        }else{
            this.vidas = v;
        }
        this.vidas = v;
    }
}
