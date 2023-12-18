package Listas_POO.Lista2.q25;

public class AlunosUfersa {
    String matricula;
    String nome;
    float prova1;
    float prova2;
    float trabalho;
    double media;
    boolean aprovado;

    public AlunosUfersa(String matricula, String nome, float prova1, float prova2, float trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    double media(){
        return(((prova1*2.5) + (prova2 * 2.5) + (2*trabalho))/7);
    }

    double ProvaFinal(){
        
    }

}
