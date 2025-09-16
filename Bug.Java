public class Bug {
    private String descricao;
    private int severidade;

    // Construtor
    public Bug(String descricao, int severidade) {
        this.descricao = descricao;
        this.severidade = severidade;
    }

    // Métodos
    public void causarErro() {
        System.out.println("Bug causado: " + descricao);
    }

    public void serResolvido() {
        System.out.println("Bug resolvido: " + descricao);
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeveridade() {
        return severidade;
    }

    public void setSeveridade(int severidade) {
        this.severidade = severidade;
    }
}
