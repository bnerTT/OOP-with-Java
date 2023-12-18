package Listas_POO.Lista2.q24;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura celular = new Fatura(981, "Redmi Note 8",   7, 1258.81);
        celular.ImprimeInfoProduto();
        System.out.println("O valor total da fatura do produto " + celular.numeroDeIdentificacao + " é R$" + celular.CalculaTotal() + " .");
    }
}
