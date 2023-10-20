// This is a code to count the frequncy of a digit from number 
// e.g. :- in number 4585654456 the occurence of 5 has 4, 4 has 3, 6 has 2 and 8 has 1. 
import java.util.*;
class NumFre{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        System.out.println("Enter the digit to get count");
        int b= sc.nextInt();

        int f = NumFre(a, b);

        System.out.println(f);
       
    }



    static int NumFre(int m, int n){
        int count =0;
        while(m>0){
          
           
            if(m%10==n){
                count++;
            }
          m = m /10;          
        }
        
        return count;

    }
}