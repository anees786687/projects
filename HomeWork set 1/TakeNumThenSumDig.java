import java.util.Scanner;

public class TakeNumThenSumDig {
    // Q3
    public static void main(String[] args){
        int sum = 0;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        while(num!=0){
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println(sum);
        scan.close();

    }
    
}


// accept a string 