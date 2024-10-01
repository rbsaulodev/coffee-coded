package phone;

public class userPhone {
    public static void main(String[] args) {
        phoneClass galaxy = new phoneClass();
        galaxy.cor = "Rosa";
        galaxy.marca = "Samsung";
        galaxy.modelo = "Galaxy S23";
        galaxy.valor = 6027.95;
        galaxy.ram = 12;
        galaxy.memoriaInterna = 512;
        galaxy.pixelCameraFrontal = 32;
        galaxy.pixelCameraTraseira = 64;
        galaxy.tamanhoTela = 6.8;
        galaxy.sistemaOperacional = "Android";
        galaxy.temCameraFrontalOuNao = true;

        galaxy.calcularParcelas();
    }
}
