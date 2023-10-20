import java.util.*;
class EmptyParking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
          for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr.length; j++){
            arr[i][j] = sc.nextInt();
        }
          }
           //findEmpty(arr);
             int count=0;
              int[] ans = new int [arr.length];
            for(int i = 0; i < arr.length; i++){
          
            for(int j = 0; j < arr.length; j++){
            if(arr[i][j]==1){
                count++;
            }
         }
          if (ans[i] < count){
            ans[i] = count;
            count = 0;
            
         
           }
  }

  for(int k =  0; k < ans.length; k++){
        
        } 
          

          

    }

    static int findEmpty(int a[][]){
        
       
           return ans;
    }
}