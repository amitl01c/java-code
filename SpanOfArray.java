import java.util.*;
class SpanOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter hte array elements");
        for(int i=0 ; i < arr.length; i++){
              arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

             if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Span of array is: " + (max-min));
    }
}