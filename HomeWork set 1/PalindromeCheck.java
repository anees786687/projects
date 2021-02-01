import java.util.Scanner;
//Q11
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str, revstr = "";
        System.out.println("Enter a string: ");
        //get input from user
        str = scan.nextLine();
        //store the reverse of user input into another string
        for(int i = str.length()-1;i>=0;i--){
            revstr = revstr + str.charAt(i);

        }
        
        //check if the new string is same as the old one
        if(str.equals(revstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
