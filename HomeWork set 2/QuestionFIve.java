import java.util.Scanner;


public class QuestionFIve {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double principal,rate,SI; //time in years as rate in % p.a
        System.out.println("Principal: ");
        principal = scan.nextDouble();

        System.out.println("Rate %pa: ");
        rate = scan.nextDouble();

        System.out.println("Time: ");
        time = scan.nextDouble();

        SI = (principal*rate*time)/100;

        System.out.println("SI is: "+SI);
    }
    
}
