import java.util.*;
class SameBaseProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Enter base value");
        int base= sc.nextInt();

        int ans = product( a, b, base);
        System.out.println(base+" base product is "+ ans);
}

public static int product(int a, int b , int base){
    int ans = 0;
    int p = 1;
    
    while (b> 0){
        int d1 = b % 10;
            b = b / 10;
        int digipro  = DigiPro( a, d1 , base);
      
        ans  = Add(ans , digipro * p , base);
         p *=10;
        }

        return ans;
}


public static int DigiPro(int n1, int d2, int base ){

    int ans =0;
    int p = 1;
    int c = 0;
    while (n1 > 0 || c > 0 ){
        int d1 = n1 % 10 ; 
            n1 = n1 / 10 ; 
        
         int d = d1 * d2 + c;
         
         c = d / base;
         d = d % base;

         ans  = ans + d * p;
         p *= 10;
    }
    return ans;
}



static int Add(int m, int n, int b ){
    int ans = 0;
    int p = 1;
    int c = 0;
    while(m > 0 || n > 0 || c > 0)
    {
        int d1 = m % 10;
        int d2 = n % 10;
       m = m/10;
       n = n/10;
       int d = d1 + d2 + c;
       c = d / b;
       d = d % b;

       ans = ans + d*p;
         p *= 10;
   }
         return ans;

}

}