public class Pattern1 {
//Q6
    public static void main(String[] args){

        for(int i = 0;i<=4;i++){

            if(i%2!=0){
                for(int j = 1;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j = 1;j<=i;j++){
                    System.out.print(j+" ");
                }
            }
            
            System.out.println();
        }
    }
    
}
