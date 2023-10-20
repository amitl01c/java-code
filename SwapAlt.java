import java.util.*;
class SwapAlt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter hte array elements");
        for(int i=0 ; i < arr.length; i++){
              arr[i] = sc.nextInt();
            }

          SwapAlt(arr, n);
           
            
     }

     static void SwapAlt(int[] arr, int size){
          
        for(int i = 0; i < arr.length; i+=2){
                if(i+1 < arr.length){
                    int j = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= j;

                }
            }

            System.out.println("Swapped array");
            
            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
            }

     }
     
}