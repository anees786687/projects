import java.util.Scanner;


public class InNumThenRev {

    // Q2
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int revnum = 0;
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        while(num!=0){
            revnum = revnum*10;
            revnum = (revnum+(num%10));
            num = num/10;           
        }
        System.out.println();
        System.out.println("reversed number: "+revnum);

        /**** USING STRING AND CHAR ****/
        // String num = scan.nextLine();
        // System.out.print(num+"->");
        // for(int i = num.length()-1;i>=0;i--){
        //     System.out.print(num.charAt(i));
        // }
    }
    
}
