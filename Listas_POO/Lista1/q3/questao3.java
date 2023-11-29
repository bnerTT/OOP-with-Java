package Listas_POO.Lista1.q3;
import java.util.Scanner;
import java.lang.Math;

public class questao3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um ângulo para ser convertido:");
        double angulo = input.nextInt();
        System.out.printf("Em radianos: %.2f.\n", Math.toRadians(angulo));
        System.out.printf("Seno: %.2f.\n", Math.sin(angulo));
        System.out.printf("Cosseno: %.2f.\n", Math.cos(angulo));
        System.out.printf("Tangente: %.2f.\n", Math.tan(angulo));
        System.out.printf("Cossecante: %.2f.\n", 1/(Math.sin(angulo)));
        System.out.printf("Secante: %.2f.\n", 1/(Math.cos(angulo)));
        System.out.printf("Cotangente: %.2f.\n", 1/(Math.tan(angulo)));
        input.close();
    }
}
