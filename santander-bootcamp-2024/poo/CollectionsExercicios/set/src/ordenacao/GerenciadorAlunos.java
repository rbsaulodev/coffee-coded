package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  //atributos
  private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunosSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAlunoPorMatricula(long matricula) {
    Aluno alunoParaRemover = null;
    if (!alunosSet.isEmpty()) {
      for (Aluno a : alunosSet) {
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }
      alunosSet.remove(alunoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }

    if (alunoParaRemover == null) {
      System.out.println("Matricula não encontrada!");
    }
  }

  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
    if (!alunosSet.isEmpty()) {
      System.out.println(alunosPorNome);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
    if (!alunosSet.isEmpty()) {
      alunosPorNota.addAll(alunosSet);
      System.out.println(alunosPorNota);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    gerenciadorAlunos.adicionarAluno("Bianca", 156L, 10);
    gerenciadorAlunos.adicionarAluno("Luis", 157L, 5.0);
    gerenciadorAlunos.adicionarAluno("Saulo", 185L, 7.0);
    gerenciadorAlunos.adicionarAluno("Laura", 129L, 9.8);

    gerenciadorAlunos.removerAlunoPorMatricula(157L);
    gerenciadorAlunos.removerAlunoPorMatricula(129L);
    System.out.println(gerenciadorAlunos.alunosSet);

    gerenciadorAlunos.exibirAlunosPorNome();
    gerenciadorAlunos.exibirAlunosPorNota();
  }
}