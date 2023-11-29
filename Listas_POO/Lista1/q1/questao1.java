package Listas_POO.Lista1.q1;
import java.util.Scanner;


public class questao1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println( "Insira a medida de um lado do quadrado:");
        float lado = input.nextFloat();
        System.out.printf("A área do quadrado é %.2f", lado*lado);
        input.close();
    }
    
}
