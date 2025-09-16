public class Desenvolvedor {
 
    private String nome;
    private String nivel;

    //construtor
     public Desenvolvedor (String nome, String nivel){
        this.nome = nome;
        this.nivel = nivel;
    }
    //Métodos

    public void escreverCodigo(){
        System.out.println(nome + "está escrevendo código");
    }

public void corrigirBug(){
    System.out.println(nivel + "Está corrigindo o bug");
}

// Getters e Setters(Para acessar os atributos)

public String getNome(){
    return nome;}

public void setNome(String nome){
    this.nome = nome;
}

public String getNivel(){return nivel;}
public void setNivel(String nivel){this.nivel = nivel;}

 //Método main funcional
 public static void main(String[]args){

    //Criando desenvolvedore
    Desenvolvedor dev1 = new Desenvolvedor("Gabriela","Pleno");
    Desenvolvedor dev2 = new Desenvolvedor("Carlos","Junior");

    // Chamando Métodos
    dev1.escreverCodigo();
    dev1.corrigirBug();
    
    dev2.escreverCodigo();
    dev2.corrigirBug();
 }
 }
 
 
