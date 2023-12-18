import java.util.Scanner;



public class q7 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2,n3, menorNumero;
        System.out.println("Insira três números:\n");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if (n1 < n2){
            menorNumero = n1;
        }
        else{
            menorNumero = n2;
        }
        if(menorNumero > n3){
            menorNumero = n3;
        }

        System.out.println("O menor número é " + menorNumero + ".");
        input.close();
    }
}