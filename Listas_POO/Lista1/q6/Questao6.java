//package Listas_POO.Lista1.q6;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um intervalo de tempo em minutos:");
        int entradaUsuario = input.nextInt();
        int dias = 0, horas = 0, minutos = 0;
        dias = entradaUsuario / (60*24);
        horas = (entradaUsuario - (dias*24*60)) / 60;
        minutos = entradaUsuario - ((dias*24*60) + (horas*60));  
        



       // System.out.printf("Intervalo de tempo:\n%i dias\t%i horas e %i minutos", dias, horas, minutos);
       System.out.println(dias+" dias\t" + horas + " horas\t" + " e " + minutos +  " minutos.\n");
        input.close();
    }

}
