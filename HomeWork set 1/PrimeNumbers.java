public class PrimeNumbers {
    // Q 1
    public static void main(String[] args){

        for(int i = 0;i<=100;i++){
            boolean bool = true;
            
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    bool = false;
                    break;
                }
            }

            if(bool)
                System.out.println(i);
        }
    }
    
}
