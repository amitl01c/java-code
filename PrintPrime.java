import java.util.*;
class PrintPrime{
    static int Prime(int low, int high){
       
        
        
         for(int i=low;i<=high;i++){
         int count=0;

         for(int j=2;j*j<=i;j++)
           {
            if(i%j==0)
           { count++;
            break;
        }
        }
         if(count==0)
            {
                System.out.println(i+" is prime number");
            }
    }
         
        
        return 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        Prime(a,b);
        
    }
}