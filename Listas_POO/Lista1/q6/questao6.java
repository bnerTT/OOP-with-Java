package Listas_POO.Lista1.q6;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um intervalo em minutos:\n");
        int intervalo = input.nextInt();
        int dia = 0;
        for(int i = 0; i < intervalo; i++){
            if(i % (60*24) == 0){
                dia++;
            }
        }
        System.out.printf("%i", dia);


        input.close();
    }
    
}
