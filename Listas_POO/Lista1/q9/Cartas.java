import java.util.Scanner;

public class Cartas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor da carta:");
        int valor = input.nextInt();
        System.out.println("Insira o naipe da carta:\n1)Ouros\n2)Paus\n3)Copas\n4)Espadas");
        int naipe = input.nextInt();
        String resultadoFinal = "";
    
        //Necessário converter o valor
        switch(valor){
            case 1:
                resultadoFinal += "Ás de ";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                resultadoFinal += valor + " de " ;
                break;
            case 11:
                resultadoFinal += "Valete de ";
                break;
            case 12:
                resultadoFinal += "Dama de ";
                break;
            case 13:
                resultadoFinal += "Rei de ";
                break;
    }
        if(naipe == 1){
            resultadoFinal += "Ouros";
        }
        if(naipe == 2){
            resultadoFinal += "Paus";
        }
        if(naipe == 3){
            resultadoFinal += "Copas";
        }
        if(naipe == 4){
            resultadoFinal += "Espadas";
        }

        System.out.println(resultadoFinal);
        input.close();
    }
}
