package Listas_POO.Lista1.q5;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número centesimal.");
        String entrada = input.nextLine();
        String centena = entrada.substring(0,1);
        String dezena = entrada.substring(1,2);
        String unidade = entrada.substring(2,3);
        String resultado = unidade + centena + dezena;
        System.out.printf("%s", resultado);
        

        input.close();
    }
    
}
