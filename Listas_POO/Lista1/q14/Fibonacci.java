import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o número para ser calculado o fibonacci: ");
        int n = input.nextInt();
        int num1 = 1, num2 = 0;
        
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < n; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);


        input.close();
    }
}
}