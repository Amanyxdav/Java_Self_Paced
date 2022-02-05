import java.util.Scanner;

public class type_casting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();
        // System.out.println(num);

        // int num = (int)(67.56f);
        // System.out.println(num);

        // type_casting

        int num = (int)(67.56f);
        System.out.println(num);

        // uni code in java

        System.out.println("こんにちは");



        // Automatic type promotion in expression
        
        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);
        
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a*b/c ;
        System.out.println(d);

        

    }
    
}
