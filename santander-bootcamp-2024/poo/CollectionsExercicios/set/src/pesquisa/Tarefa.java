package pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public boolean isConcluida() {
        return concluida;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return descricao;
    }    

}
