public class Repositorio {
    private String url;
    private String versao;

    // Construtor
    public Repositorio(String url, String versao) {
        this.url = url;
        this.versao = versao;
    }

    // Métodos
    public void salvarCodigo() {
        System.out.println("Código salvo no repositório: " + url);
    }

    public void atualizarVersao() {
        System.out.println("Versão atualizada para " + versao);
    }

    // Getters e Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
