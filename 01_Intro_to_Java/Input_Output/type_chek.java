import java.util.Scanner;

public class type_chek {
    public static void main(String[] args) {
        

        // String word = "hello";
        // System.out.println(word.charAt(0));


        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("The given word starts with lowercase");
        }else{
            System.out.println("The given word starts with Uppercase.");
        }

    }
    
}
