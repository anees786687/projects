import java.util.Scanner;
//Q10
public class CheckEvenSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        String numstr;
        int oddsum = 0;
        int evensum = 0;
        /*
        *****************************************************************************
        Take the number to be checked in string
        Then check the length of the string
        if it is odd assign the counter to be at 1
        if it is even assign th counter to be at 0
        Something to do with the positioning or the indexing of the digit
        *****************************************************************************
        */
        System.out.println("Enter a number");
        numstr = scan.nextLine();
        num = Integer.parseInt(numstr);
        int counter = (numstr.length()%2==0)?0:1;
        while(num != 0){
           
            
            if(counter % 2 == 0){
                evensum = evensum + num%10;
                counter++;
            }
            else{
                oddsum = oddsum + num%10;
                counter++;
            }
            // counter++;
            num = num/10;
            
            
        }
        System.out.println("Odd sum: "+oddsum);
        System.out.println("Even sum: "+evensum);
    }
}
