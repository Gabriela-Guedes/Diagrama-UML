import java.util.Date;

public class Projeto {
    private String titulo;
    private Date prazo;

    // Construtor
    public Projeto(String titulo, Date prazo) {
        this.titulo = titulo;
        this.prazo = prazo;
    }

    // Métodos
    public void adicionarCodigo() {
        System.out.println("Código adicionado ao projeto " + titulo);
    }

    public void compilarProjeto() {
        System.out.println("Projeto " + titulo + " compilado");
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }
}

