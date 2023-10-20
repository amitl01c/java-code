import java.util.*;
class SameBaseAdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Enter base value");
        int b1= sc.nextInt();

        int ans = Add( a, b, b1);
        System.out.println(b1+" base sum is "+ ans);
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