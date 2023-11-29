package Listas_POO.Lista1.q4;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma temperatura em graus Celsius:");
        float temperatura = input.nextFloat();
        System.out.printf("A temperatura em Fahrenheit é %.2f .", (temperatura * 1.8) + 32);
        input.close();
    }
}
