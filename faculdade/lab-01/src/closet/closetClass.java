package closet;

public class closetClass {
    String marca;
    String madeira;
    String cor;
    float valor;
    boolean espelho;

    void BooleanEspelho(){
        if(this.espelho == true){
            System.out.println("Este guarda roupa tem espelho");
        }else{
            System.out.println("Este guarda roupa não tem espelho");
        }
    }

    void Status(){
        System.out.println("Marca do Guarda Roupa é: " +this.marca);
        System.out.println("A madeira do Guarda Roupa é: " +this.madeira);
        System.out.println("A cor do Guarda Roupa é: " +this.cor);
        System.out.println("O valor do Guarda Roupa é: " +this.valor);
    }
}
