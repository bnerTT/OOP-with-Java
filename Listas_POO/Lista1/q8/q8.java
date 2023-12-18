import java.text.DecimalFormat;
import java.util.Scanner;

public class q8{

    static public void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        int codigoSetor = 0;
        boolean codigoValido = false;
        while(codigoValido != true){
            System.out.println("Insira o código do setor da loja");
            codigoSetor = input.nextInt();
            if(codigoSetor == 111 || codigoSetor == 222){
            codigoValido = true;
            }
            else{
                System.out.println("Código inválido. Insira novamente.");
            }
        }
        
        System.out.println("Insira o valor do produto:");
        double precoProduto = input.nextDouble();
        if(codigoSetor == 222){
            if(precoProduto >= 500){
                System.out.println("Desconto de 10%");
                precoProduto = precoProduto - (precoProduto * (0.1));
            }
        }
        if(codigoSetor == 111){
            if(precoProduto > 100){
                System.out.println("Desconto de 40%");
                precoProduto = precoProduto - (precoProduto * (0.4));
            }
            else if(precoProduto >= 50 && precoProduto <= 100){
                System.out.println("Desconto de 20%");
                precoProduto = precoProduto - (precoProduto * (0.2));
            }
            else if(precoProduto < 50){
                System.out.println("Desconto de 10%");
                precoProduto = precoProduto - (precoProduto * (0.1));
            }
        }
        
        System.out.print("\nO preço do produto com desconto é de R$ " + df.format(precoProduto) + ".");
        
    
        input.close();
    }
}