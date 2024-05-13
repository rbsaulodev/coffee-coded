package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
          for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefaParaRemover = t;
              break;
            }
          }
          tarefaSet.remove(tarefaParaRemover);
        } else {
          System.out.println("O conjunto está vazio");
        }
    
        if(tarefaParaRemover == null) {
          System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }
    
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
          if (t.isConcluida()) {
            tarefasConcluidas.add(t);
          }
        }
        return tarefasConcluidas;
      }
    
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
          if (!t.isConcluida()) {
            tarefasNaoConcluidas.add(t);
          }
        }
        return tarefasNaoConcluidas;
      }
    
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            t.setConcluida(true);
          }
        }
      }
    
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaMarcarComoPendente = t;
            break;
          }
        }
    
        if (tarefaParaMarcarComoPendente != null) {
          if(tarefaParaMarcarComoPendente.isConcluida()) {
            tarefaParaMarcarComoPendente.setConcluida(false);
          }
        } else {
          System.out.println("Tarefa não encontrada na lista.");
        }
    }
    
    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
          System.out.println("A lista já está vazia!");
        } else {
          tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Estudar SpringBoot");
        tarefas.adicionarTarefa("Estudar Banco de Dados NoSQL");
        tarefas.adicionarTarefa("Estudar Banco de Dados SQL");
        tarefas.adicionarTarefa("Estudar HTML, CSS e JS");
        tarefas.adicionarTarefa("Estudar framework Angular");
        tarefas.adicionarTarefa("Arrumar Linkedln");
        tarefas.adicionarTarefa("Arrumar Github");
        tarefas.adicionarTarefa("Terminar Bootcamp DIO");

        tarefas.exibirTarefas();
        tarefas.contarTarefas();
        tarefas.removerTarefa("Estudar framework Angular");
        tarefas.marcarTarefaConcluida("Estudar Java");
        tarefas.marcarTarefaConcluida("Estudar SpringBoot");
        tarefas.marcarTarefaConcluida("Arrumar Github");
        System.out.println("");
        System.out.println("Tarefas pendentes: "+tarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: "+tarefas.obterTarefasConcluidas());
    }
}
