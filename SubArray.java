import java.util.*;
class SubArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter hte array elements");
        for(int i=0 ; i < arr.length; i++){
              arr[i] = sc.nextInt();
        } 
 System.out.println("Enter the size of array");
        int m = sc.nextInt();
          int [] arr1 = new int[m];
        System.out.println("Enter hte array elements");
        for(int i=0 ; i < arr1.length; i++){
              arr1[i] = sc.nextInt();
        }
       // if m>n then size of sum is m else the size will be n

        int[] diff = new int[m];

        // taking pointer for each array

        int i = arr.length - 1;
        int j = arr1.length - 1;
        int k = diff.length - 1;

        int c = 0;

        while(k >= 0){
          int d = 0;
          int arr_v = i >= 0? arr[i]:0;

    
       if(arr1[j] + c >= arr_v){

        d =arr1[j] + c - arr_v;
        c = 0;
       }
       else{
        
        d = arr1[j] + c + 10 - arr_v;

        c = -1;
       }

        
          diff[k] = d;

          i--;
          j--;
          k--;
        }
        

         System.out.println("The difference of array is");
    

         int indx = 0;
         while (indx < diff.length){
            if(diff[indx] == 0){
                indx++;
            }
            else break;
         }

          while (indx < diff.length){
            System.out.print(diff[indx]);
                 indx++;
         }

      System.out.println();
    

    
    }
}