import java.util.Scanner;

public class PostAndPre {
    //Q5
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("Prefix:" + ++num);
        System.out.println("Postfix occuring: " + num++);
        System.out.println("Postfix occured: " + num);
        scan.close();
    }
    
}
