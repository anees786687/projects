import java.util.Scanner;

public class OuestionOneOhOne {

     /*WAP to accept the 2 no.s from user and swap them
	a.with third variable
    */
    
    public static void main(String[] args){
        int a,b,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number: ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("a is "+a+" and b is "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a is "+ a + " b is "+b);

    }
    
}
