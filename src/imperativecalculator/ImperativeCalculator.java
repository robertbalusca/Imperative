
package imperativecalculator;

import java.util.Scanner;


public class ImperativeCalculator {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter first number: ");
        double num = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter operation: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulo");
        
        int op = sc.nextInt();
        
        switch (op){
            case 1:
                double sum = num + num2;
                System.out.println("The sum is: "+sum);
                break;
            case 2:
                double diff = num - num2;
                System.out.println("The difference is: "+diff);
                break;
            case 3:
                double prod = num * num2;
                System.out.println("The product is: "+prod);
                break;
            case 4:
                double quo = num / num2;
                System.out.println("The quotient is: "+quo);
                break;
            case 5:
                double mod = num % num2;
                System.out.println("The remainder is: "+mod);
                break;
            default: 
                System.out.println("Incorrect input! Choose from the given selection: ");
        }

    }
    
}
