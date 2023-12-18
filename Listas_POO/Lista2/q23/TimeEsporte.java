package Listas_POO.Lista2.q23;

public class TimeEsporte {
    String nome;
    String campeonatoNome;
    int pontos;
    int vitorias;
    int empates;
    int derrotas;

    TimeEsporte(String nome, String campeonatoNome, int pontos, int vitorias, int empates, int derrotas){
        this.nome = nome;
        this.campeonatoNome = campeonatoNome;
        this.pontos = pontos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }
    
    void ExibeInformacoesTime(){
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
    }

}
