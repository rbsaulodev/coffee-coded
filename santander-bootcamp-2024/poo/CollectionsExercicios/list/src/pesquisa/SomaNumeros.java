package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        if(!numeroList.isEmpty()){
            for(Integer n: numeroList){
                total += n;
            }
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        return total;
    }
    
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
          for (Integer numero : numeroList) {
            if (numero >= maiorNumero) {
              maiorNumero = numero;
            }
          }
          return maiorNumero;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    
      public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
          for (Integer numero : numeroList) {
            if (numero <= menorNumero) {
              menorNumero = numero;
            }
          }
          return menorNumero;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public void exibirNumeros(){
        System.out.println(numeroList);
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(50);
        numeros.adicionarNumero(40);

        numeros.exibirNumeros();
        System.out.println("Soma: "+numeros.calcularSoma());
        System.out.println("Maior numero: "+numeros.encontrarMaiorNumero());
        System.out.println("Menor numero: "+numeros.encontrarMenorNumero());
    }
}
