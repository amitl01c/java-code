import java.util.*;
class AnyBase2AnyBase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        System.out.println("Enter base 1");
        int b1= sc.nextInt();
        System.out.println("Enter base 2");
        int b2= sc.nextInt();
        

       int ans= getValues(a, b1, b2);
       

        System.out.println(ans);
       
    }

    static int getValues(int n, int b1, int b2){
         int deci = toDeci(n, b1);
       int d = toAnyBase(deci, b2);
        return d;
    }

    static int toDeci( int n, int m ){
        int ans = 0;
        int power = 1;
      while(n>0){
        int num = n%10;
        n=n/10;
          ans += num*power;
        power *= m;
      }
       return ans;
      }

      static int toAnyBase(int m, int n){
        int ans = 0;
        int power = 1;
        while (m>0){
          int num = m % n ;
          m = m / n;
          ans += num * power;
          power = power*10;
        }
        return ans;
      }
      

    }

   
