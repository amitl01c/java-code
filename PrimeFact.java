import java.util.*;
class PrimeFact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        
        primeFact(a);

    }
    static int primeFact(int n){
        /* 
       int i=2;
        while(n!=0){
            if(n%i==0){
                System.out.print(i+" ");

                n=n/i;
            }
            else{
                i++;
            }
        }
        */
        for(int i=2; i<=n;i++){
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
        }

      
    
    
        return 0;
    }
}