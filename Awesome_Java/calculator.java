import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*'|| op == '/' || op == '%'){

                // input two numbers
                System.out.println("Enter the two number for operation");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }

                if (op == '-'){
                    ans = num1 - num2;
                }

                if (op == '*'){
                    ans = num1 * num2;
                }

                if (op == '/'){
                    if (num2 != 0){
                    ans = num1 + num2;}
                    else {System.out.println("Cannot divide num1 by 0");}
                }

                if (op == '%'){
                    ans = num1 % num2;
                }

                }else if (op == 'X' || op == 'x'){
                    break;
                }else{
                    System.out.println("Invalid operation");
                
            }System.out.println("The answer is :"+ans);
        }
    }
    
}
