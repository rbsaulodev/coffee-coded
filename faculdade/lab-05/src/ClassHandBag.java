class ClassHandBag {
    String cor;
    String marca;
    float valores[] = new float[3];

    void status(){
        System.out.println("A cor da bolsa é: " + this.cor);
        System.out.println("A marca da bolsa é: " + this.marca);
        System.out.print("Os valores da bolsa são: ");
        for (float valor : this.valores) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}