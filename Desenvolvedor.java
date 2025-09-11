// classe Desenvolvedor 
public class Desenvolvedor {
    private String nome;
    private String nivel;

    public Desenvolvedor(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void escreverCodigo() {
        System.out.println(nome + " está escrevendo código...");
    }

    public void corrigirBug(Bug bug) {
        System.out.println(nome + " está corrigindo o bug: " + bug.getDescricao());
        bug.setResolvido(true);
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }
}
public class Bug {
    private String descricao;
    private boolean resolvido;

    public Bug(String descricao) {
        this.descricao = descricao;
        this.resolvido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
}
public class Codigo {
    private String conteudo;

    public Codigo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
import java.util.ArrayList;

public class Projeto {
    private String nome;
    private ArrayList<Codigo> codigos;
    private ArrayList<Bug> bugs;

    public Projeto(String nome) {
        this.nome = nome;
        this.codigos = new ArrayList<>();
        this.bugs = new ArrayList<>();
    }

    public void adicionarCodigo(Codigo codigo) {
        codigos.add(codigo);
    }

    public void adicionarBug(Bug bug) {
        bugs.add(bug);
    }

    public ArrayList<Codigo> getCodigos() {
        return codigos;
    }

    public ArrayList<Bug> getBugs() {
        return bugs;
    }
   
}


import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Projeto> projetos;

    public Repositorio() {
        this.projetos = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
}

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Ana", "Júnior");
        Projeto projeto = new Projeto("Sistema de Vendas");

        Codigo codigo = new Codigo("Função de cadastro de cliente");
        Bug bug = new Bug("Erro ao salvar cliente no banco de dados");

        projeto.adicionarCodigo(codigo);
        projeto.adicionarBug(bug);

        dev.escreverCodigo();
        dev.corrigirBug(bug);

        System.out.println("Projeto: " + projeto.getCodigos().get(0).getConteudo());
        System.out.println("Bug resolvido? " + projeto.getBugs().get(0).isResolvido());
    }
}
