package Listas_POO.Lista1.q2;
import java.util.Scanner;


public class questao2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira 3 números para efetuar o cálculo da média:");
        float media = 0;
        for(int i = 0; i < 3; i++){
           int entrada = input.nextInt();
           media += entrada;
        }
        media /= 3;
        System.out.printf("A média é %.2f.", media);
        input.close();
    }
}
