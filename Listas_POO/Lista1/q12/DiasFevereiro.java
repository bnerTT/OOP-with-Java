import java.util.Scanner;

class DiasFevereiro{

    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um dia do mês de Fevereiro:");
        int dia = input.nextInt();
        String resultadoFinal = "O dia " + dia + " será ";
        switch(dia % 7){
            case 0:
                resultadoFinal += "sábado.";
                break;
            case 1:
                resultadoFinal += "domingo.";
                break;
            case 2:
                resultadoFinal += "segunda-feira.";
                break;
            case 3:
                resultadoFinal += "terça-feira.";
                break;
            case 4:
                resultadoFinal += "quarta-feira.";
                break;
            case 5:
                resultadoFinal += "quinta-feira.";
                break;
            case 6:
                resultadoFinal += "sexta-feira.";
                break;
            default:
                System.out.println("Dia inválido!");
        }

        System.out.print(resultadoFinal);

        input.close();
    }
}