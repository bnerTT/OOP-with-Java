import java.util.Scanner;


public class Cartesiano{
    public static void main(String[] args){
        float x1,x2,y1,y2;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor do ponto x1:");
        x1 = input.nextFloat();
        System.out.println("Insira o valor do ponto y1:");
        y1 = input.nextFloat();
        System.out.println("Insira o valor do ponto x2:");
        x2 = input.nextFloat();
        System.out.println("Insira o valor do ponto y1:");
        y2 = input.nextFloat();
        String resultado = "";
        
        if (y2 > y1){
            resultado += "Acima e ";
        }
        else{
            resultado += "Abaixo e";
        }

        if (x2 > x1){
            resultado += "à direita;";
        }
        else{
            resultado += "à esquerda";
        }
        
        System.out.println(resultado);
        input.close();
    }
}