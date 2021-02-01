public class Fibonacci {

    public static void main(String[] args){
        //WAP to display Fibonacci Series till 100
        // Q4
        int  first = 0, second = 1;
        int third = 0;
        System.out.println(first);
        System.out.println(second);
        for(int i = 0; i < 100; i++){
            
            third = first + second;
            first = second;
            second = third;
            System.out.println(third);
            
        }
    }
    
}
