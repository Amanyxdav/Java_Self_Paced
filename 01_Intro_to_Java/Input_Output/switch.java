public class switch{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "Orange":{
                System.out.println("Round fruit");
            }break;
            case "Mango":{
                System.out.println("King of fruit");
            }break;
            case "Apple":{
                System.out.println("Red fruit");
            }break;
            default:{
                System.out.println("Enter a valid fruit");
            }
        }



    }
    
}