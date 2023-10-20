import java.util.*;
class FindIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter hte array elements");
        for(int i=0 ; i < arr.length; i++){
              arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find index");
         int num = sc.nextInt();

         findIndex(arr, num);

       
    }

    static int findIndex(int [] arr , int a){

        for(int i =0; i < arr.length; i++){
            if(arr[i] == a){
                System.out.println("The index of "+a +" is "+i);
            }
            else{
                System.out.println("-1");
          }
        }
        return 0;
    }
}