import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();


        // ** for loop in java **


        // for (int num=1; num<=n; num++){
        //     System.out.print(num+" ");
        // }

        int num = 1;
        while (num<=5){
            System.out.println(num);
            num += 1;
        }

        int n = 1;
        do{
            System.out.println("Hello World!!");
            n+=1;
        }while( n<=5);


        

    }
}
