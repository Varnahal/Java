package CursoDeJava.Apps.Aula16;

public class Aranha extends Animal {
    private int veneno;
    public Aranha(int vel, int massa, int forca,int veneno){
        super(vel, massa, forca);
        this.veneno = veneno;
    }

    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
            if(this.getForca() > a.getForca()){
                this.setForca(this.getForca()+a.getMassa());
                a.setVivo(false);
            }else{
                this.setVivo(false);
            }
        }
    }
}