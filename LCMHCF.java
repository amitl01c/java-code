import java.util.*;
class LCMHCF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        lcmHcf(a,b);

    }
    static int lcmHcf(int n,int m){
// For the LCM of two numbers.
        for(int i=1;i<=10;i++){
            if(m>n){
                if((m*i)%n==0){
                    System.out.println("The LCM of two number is "+m*i);
                    break;
                }
            }
            else{
                if((n*i)%m==0){
                    System.out.println("The LCM of two number is "+n*i);
                    break;
                }
            }
            
        }

        // For HCF of two numbers.
        
          if(m<n){
            for(int i=m;i>=2;i--){
              if((m%i==0)&&(n%i==0)){
                System.out.println("The GCD of two number is "+i);
                break;
            }
          }
          }
          else{
            for(int i=n;i>=2;i--){
              if((m%i==0)&&(n%i==0)){
                System.out.println("The GCD of two number is "+i);
                break;
            }
          }
          }
    
    
        return 0;
    }
}