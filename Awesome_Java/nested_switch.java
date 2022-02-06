import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        
        switch(empId){
            case 1:
                System.out.println("Aman yadav");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Employee no. 3");
                String department = in.next();
                switch(department){
                    case "IT":
                        System.out.print("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department in record");        
                }break;
            default:
                System.out.println("Enter correct emp Id");                      

        }
    }
    
}
