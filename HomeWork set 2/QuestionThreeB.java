import java.util.Scanner;

public class QuestionThreeB {
    //Q8
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    char x;

    do{
        System.out.println("Enter an alphabet: ");
        x = scan.next().charAt(0);
        switch (x){
            case ('a'):
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case ('A'):
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;                
            case '!':
                break;
            default:
                System.out.println("Consonant");
                break;
        }

    }while(x!='!');
}
    
}
