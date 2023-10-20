import java.util.*;
class Array{
    
    public static void main(String[] args) {
        int[] a = new int[5];
         a[0] = 10;
         a[1] =15;
         a[2] = 84;
         a[3] = 62;
         a[4] =41;
        

         for(int i=0; i < a.length; i++){
            System.out.println(a[i]);
         }

       int i = 0;
       int j = a.length-1;

       while(i< a.length/ 2){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        

        i++;
        j--;
         System.out.println(i);
       System.out.println(j);
       }
       
       System.out.println("reversed array");

       for(int k=0; k < a.length; k++){
            System.out.println(a[k]);
         }

        
    }
}