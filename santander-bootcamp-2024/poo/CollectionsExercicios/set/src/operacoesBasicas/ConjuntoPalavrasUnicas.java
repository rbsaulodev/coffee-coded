package operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjutoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjutoSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjutoSet.add(palavra);
    }
    
    public void removerPalavra(String palavra){
        if (!conjutoSet.isEmpty()) {
            if (conjutoSet.contains(palavra)) {
                conjutoSet.remove(palavra);
            }else{
                System.out.println("Palavra não existente!");
            }
        }else{
            throw new RuntimeException("Lista Vazia!");
        }
    }

    public boolean verificarPalavra(String palavra){
        if (conjutoSet.contains(palavra)) {
            return true;
        }else{
            return false;
        }
    }

    public void exibirPalavrasUnicas(){
        if (!conjutoSet.isEmpty()) {
            System.out.println(conjutoSet);
        }else{
            throw new RuntimeException("Lista Vazia!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Java");
        palavras.adicionarPalavra("Back-end");
        palavras.adicionarPalavra("Springboot");
        palavras.adicionarPalavra("JVM");
        palavras.adicionarPalavra("JDK");

        palavras.exibirPalavrasUnicas();
        System.out.println("Resultado: "+palavras.verificarPalavra("Saulo"));
        palavras.adicionarPalavra("Saulo");
        System.out.println("Resultado: "+palavras.verificarPalavra("Saulo"));
        palavras.exibirPalavrasUnicas();
        palavras.removerPalavra("Saulo");
        palavras.exibirPalavrasUnicas();
        System.out.println("Resultado: "+palavras.verificarPalavra("Saulo"));
    }
}