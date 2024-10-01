package closet;

public class closet {
    public static void main(String[] args) {
        closetClass gr1 = new closetClass();   
        closetClass gr2 = new closetClass();
        closetClass gr3 = new closetClass();

        // Guarda Roupa 1 -- gr1
        gr1.marca = "Madesa";
        gr1.cor = "Preto";
        gr1.espelho = true;
        gr1.madeira = "MDF";
        gr1.valor = (float) 839.99;

        gr1.Status();
        gr1.BooleanEspelho();
        System.out.println("");

        // Guarda Roupa 2 -- gr2
        gr2.marca = "Madesa";
        gr2.cor = "Marrom e bege";
        gr2.espelho = true;
        gr2.madeira = "MDF";
        gr2.valor = (float)  1859.91;

        gr2.Status();
        gr2.BooleanEspelho();
        System.out.println("");
        
        // Guarda Roupa 3 -- gr3
        gr3.marca = "Madesa";
        gr3.cor = "Branco e Bege";
        gr3.espelho = false;
        gr3.madeira = "MDF";
        gr3.valor = (float)  1115.91;

        gr3.Status();
        gr3.BooleanEspelho();
    }
}
