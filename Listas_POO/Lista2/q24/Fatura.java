package Listas_POO.Lista2.q24;

public class Fatura {
    int numeroDeIdentificacao;
    String descricaoProduto;
    int quantidadeComprada;
    double precoUnitario;

    Fatura(int numeroDeIdentificacao, String descricaoProduto, int quantidadeComprada, double precoUnitario){
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.descricaoProduto = descricaoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadeComprada = quantidadeComprada;

        if (quantidadeComprada < 0){
            this.quantidadeComprada = 0;
        }
    
        if (precoUnitario < 0){
            this.precoUnitario = 0.0;
        }
    
    
    }

    void ImprimeInfoProduto(){
        System.out.println("Número de identificação:" + numeroDeIdentificacao);
        System.out.println("Descrição: " + descricaoProduto);
        System.out.println("Preço:" + precoUnitario);
        System.out.println("Quantidade comprada: " + quantidadeComprada);
    }

    double CalculaTotal(){
        return(quantidadeComprada * precoUnitario);
    }
    



}
