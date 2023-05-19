package CursoDeJava.Apps.Aula16;

abstract class Animal implements SerVivo {

    public Animal(){

    }

    public void mover() {
        
    }
    public void comer(int massa){

    }

    public void info() {
        System.out.printf("vivo:%s%n", vivo ?"Sim":"Não");
    }
}
