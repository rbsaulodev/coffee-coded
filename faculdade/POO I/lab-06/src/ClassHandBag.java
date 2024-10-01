class ClassHandBag {
    String[] cor = new String[3];
    String[] marca = new String[3];
    String[] material = new String[3];
    boolean[] ziper = new boolean[3];
    float[] valor = new float[3];

    void status() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Bolsa número " + i + ":");
            System.out.println("  Cor: " + this.cor[i+1]);
            System.out.println("  Marca: " + this.marca[i+1]);
            System.out.println("  Material: " + this.material[i+1]);
            System.out.println("  Tem zíper? " + this.ziper[i+1]);
            System.out.println("  Valor: " + this.valor[i+1]);
        }
    }
}