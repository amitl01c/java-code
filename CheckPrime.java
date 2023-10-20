//not the optimized code to check prime number
import java.util.*;
class CheckPrime{

   
    static int CheckPrime(int n){
        if(n<0)
        {
        System.out.println("Invalid Input");
        }
        else{
           int count=0;
           //for(int i=1;i<=n;i++)   not optimized
           //optimized code
           for(int i=2;i*i<=n;i++)
           {
            if(n%i==0){
            count++;
            break;
            }


            }
            if(count==0)
            {
                System.out.println(n+" is prime");
            }
            else{
                System.out.println(n+ " is not Prime");
            }

           }
           
         
        
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int a = sc.nextInt();
        CheckPrime(a);
    }
}