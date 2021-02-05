import java.util.Scanner;

public class QuestionTwo {
    // 2.Accept three no.s and display greatest of them
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Enter three numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a>b&&a>c){
            System.out.println(a+" is the greatest");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is the greatest");
        }
        else{
            System.out.println(c+" is the greatest");
        }
    }
}
