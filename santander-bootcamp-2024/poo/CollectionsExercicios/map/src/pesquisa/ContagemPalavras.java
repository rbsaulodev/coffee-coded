package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> palavras;

  public ContagemPalavras() {
    this.palavras = new HashMap<>();
  }

  public void adicionarPalavras(String linguagem, Integer contagem) {
    palavras.put(linguagem, contagem);
  }

  public void removerPalavra(String palavra) {
    if (!palavras.isEmpty()) {
      palavras.remove(palavra);
    } else {
      System.out.println("O Map está vazio.");
    }
  }

  public int exibirContagemPalavras() {
    int contagemTotal = 0;
    for (int contagem : palavras.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }

  public String encontrarPalavrasMaisFrequente() {
    String linguagemMaisFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        linguagemMaisFrequente = entry.getKey();
      }
    }
    return linguagemMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    contagemLinguagens.adicionarPalavras("Java", 2);
    contagemLinguagens.adicionarPalavras("Python", 8);
    contagemLinguagens.adicionarPalavras("JavaScript", 1);
    contagemLinguagens.adicionarPalavras("C#", 6);

    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
  }
}