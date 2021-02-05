import java.util.Scanner;

public class QuestionSix {
    //WAP to accept a character from user and convert it into other case
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an alphabet: ");
        char ch = scan.next().charAt(0);
        int ascii = (int) ch; // convert char to ascii

        // 97-122 are lower case letters in ascii
        if(ascii>=97 && ascii<=122){
            ascii = ascii - 32; // convert Upper to Lower
            System.out.println((char)ascii);
        }
        else{
            ascii = ascii + 32; //conver Lower to Upper
            System.out.println((char)ascii);
        }
        scan.close();
    }
}
