import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b, res = 0;
        char c;
        System.out.println("Provide two numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        
        System.out.println();
        System.out.println("Which arithmetic operation (+,-,/,*,%) would you like to perform?");
        c = scan.next().charAt(0);
        switch(c){
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '/':
                res = a/b;
                break;
            case '*':
                res = a*b;
                break;
            case '%':
                res = a%b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        // SMALL NO % LARGE NO = SMALL NO 
        System.out.println();
        System.out.println(a+" "+c+" "+b+" = "+res);
        scan.close();
    }

    
}
