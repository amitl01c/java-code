import java.util.*;
class SameBaseSub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Enter base value");
        int b1= sc.nextInt();

        int ans = Sub( a, b, b1);
        System.out.println(b1+" base sub is "+ ans);
    }

    static int Sub(int m , int n , int b){
        int ans =0;
        int p=1;
        int c = 0;
        while (m>0){
            int d1 = m % 10;
            int d2 = n % 10;
                 m = m / 10;
                 n = n / 10;
            int d =0;
             // d1 += c;
                 if(d1>=d2){
                    c=0;
                    d = d1 - d2 ;
                 }
                 else{
                    c= -1;
                    d = d1 + b - d2;
                    
                 }
                 m+=c;

                ans += d*p;
                p *= 10;
            }
            return ans;
    }

}