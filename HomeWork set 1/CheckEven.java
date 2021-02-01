import java.util.Scanner;

    //Q9
public class CheckEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int  num = scan.nextInt(); // take the number
        while(num!=0){
            int even = num%10;//break the number
            num = num/10;
            //check if even
            if(even%2==0){
                System.out.println(even);
            }
        }
        scan.close();
    }
}
