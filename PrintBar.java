import java.util.*;
class PrintBar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter hte array elements");
        for(int i=0 ; i < arr.length; i++){
              arr[i] = sc.nextInt();
        }
         printBar(arr);
    }

    static void printBar(int[] arr){

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = max; i >= 1; i-- ){

            int num = max;
            for (int j = 0; j < arr.length; j++){
                if(arr[j] >= i){
                    System.out.print("*"+" ");
                } 
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();


        }
    }
}