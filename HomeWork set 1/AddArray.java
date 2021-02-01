import java.util.Scanner;

public class AddArray {
    //Q12
    public static void main(String[] args){
        int[] arr1,arr2,arr3;
        int len1,len2,len3;
        Scanner scan = new Scanner(System.in);

        // get length of array 1 from user then the elements
        System.out.println("Enter the length of first array: ");
        len1 = scan.nextInt();

        System.out.println();
        
        arr1 = new int[len1];
        System.out.println("Enter the elements of first array: ");
        for(int i = 0; i<len1; i++){
            arr1[i] = scan.nextInt();
        }

        System.out.println();

        // get length of array 1 from user then the elements
        System.out.println("Enter the length of second array: ");
        len2 = scan.nextInt();

        System.out.println();
        
        System.out.println("Enter the elements of second array: ");
        arr2 = new int[len2];
        for(int i = 0; i<len2; i++){
            arr2[i] = scan.nextInt();
        }

        //now copy all the elements of array1 and array2 into array3
        //first copy array1 and then remember the position where array1 ended
        //then use that position to be the start point for array2 to be copied in
        //could used two for loops and a counter to fill the PFA after array 1 is copied
        len3 = len1+len2;
        arr3 = new int[len3];
        int counter = 0;
        for(int i = 0; i<len1; i++){
            arr3[i] = arr1[i]; //copy all of the elements of array 1 to array 3
            counter++; //counter will stop at the index where array 2 needs to start copying
        }
        for(int i = 0;i<len2;i++){
            arr3[counter+i] = arr2[i];
        }
        // print the new array- array 3
        System.out.println();
        System.out.println("The combined array of len "+len3+" is ");
        for(int i = 0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        scan.close();
    }
    
}
