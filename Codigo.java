public class Codigo {
    private String linguagem;
    private int linhas;

    // Construtor
    public Codigo(String linguagem, int linhas) {
        this.linguagem = linguagem;
        this.linhas = linhas;
    }

    // Métodos
    public void executar() {
        System.out.println("Executando código em " + linguagem);
    }

    public void depurar() {
        System.out.println("Depurando código...");
    }

    // Getters e Setters
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
}
