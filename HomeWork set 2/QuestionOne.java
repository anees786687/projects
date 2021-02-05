import java.util.Scanner;

public class QuestionOne {
    /*WAP to accept the 2 no.s from user and swap them
	
	b.without third variable*/
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("a is "+a+" and b is "+b);
        a = a+b;//10 + 5 = 15
        b = a-b;//15 - 5 = 10
        a = a-b;//15 - 10 = 5
        System.out.println("After swap a is "+ a + " b is "+b);
    }
    
}
