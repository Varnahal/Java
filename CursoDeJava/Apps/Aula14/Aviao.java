public class Aviao extends Veiculo{
    private String categoria;

    public Aviao(String nome,int tipo,String categoria){
        super(nome,tipo);
        this.categoria = categoria;
    }

    public void info() {
        super.info();
        System.out.printf("Categoria:%s",this.categoria);
    }
}
