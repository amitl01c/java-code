import java.util.*;
class AddArray{
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

        int[] sum = new int[m > n? m: n];

        // taking pointer for each array

        int i = arr.length - 1;
        int j = arr1.length - 1;
        int k = sum.length - 1;

        int c = 0;

        while(k >= 0){
          int d = c;

          if(i >= 0){
            d += arr[i];
          }

          if( j >= 0){
            d += arr1[j] ;
          }

          c = d/10;
          d = d % 10;
          sum[k] = d;

          i--;
          j--;
          k--;
        }
        

         System.out.println("The sum of array is");
        if(c!=0){
            System.out.print(c);
        }

        for(int val: sum){
            System.out.print(val);
        }

    
    }
}