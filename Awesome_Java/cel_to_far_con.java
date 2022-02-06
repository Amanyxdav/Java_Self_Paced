import java.util.Scanner;

public class cel_to_far_con {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in ℃ :");
        float tempC = in.nextFloat();

        float tempf = (tempC * 9/5) + 32;
        System.out.println(tempf);
    }
}
