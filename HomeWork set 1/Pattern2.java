public class Pattern2 {
    //Q7
    public static void main(String[] args){
        char[] arr = {'p','q','r','s'};

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<=i; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
    
}
