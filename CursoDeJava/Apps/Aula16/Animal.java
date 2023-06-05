package CursoDeJava.Apps.Aula16;

abstract class Animal implements SerVivo {

    private boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;

    public Animal(int vel,int massa,int forca){
        this.vivo = true;
        this.vel = vel;
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.forca = forca;

    }

    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }
    public boolean getVivo(){
        return this.vivo;
    }

    public void setForca(int forca){
        this.forca = forca;
    }
    public int getForca(){
        return this.forca;
    }

    public void setMassa(int massa){
        this.massa = massa;
    }
    public int getMassa(){
        return this.massa;
    }

    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                this.forca += a.getMassa();
                a.vivo = false;
            }else{
                this.vivo = false;
            }
        }
    }

    public void mover() {
        if(this.vivo){
            this.x+=vel;
            this.y+=vel;
        }
    }
    public void comer(int massa){
        if(this.vivo){
            this.forca+=massa;
        }    
    }

    public void info() {
        System.out.printf("vivo:%s%n", vivo ?"Sim":"Não");
        System.out.printf("Tipo:%s%n", getClass().toGenericString());
        System.out.printf("Massa:%s%n", this.massa);
        System.out.printf("forca:%s%n", this.forca);
    }
}
