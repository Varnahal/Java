package CursoDeJava.Apps.Aula16;
import java.util.Objects;

public class Vegetal {
    private boolean vivo;
    private int massa;
    public Vegetal(int massa){
        this.massa = massa;
        this.vivo = true;
    }

    public boolean getVivo() {
        return this.vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getMassa() {
        return this.massa;
    }
    
    public void info() {
        System.out.printf("vivo:%s%n", vivo ?"Sim":"Não");
        System.out.printf("Tipo:%s%n", getClass().toGenericString());
        System.out.printf("Massa:%s%n", this.massa);
    }
    
}
