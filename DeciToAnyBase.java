import java.util.*;
class DeciToAnyBase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        System.out.println("Enter the digit to get count");
        int b= sc.nextInt();

        int f = Convert(a, b);

        System.out.println(f);
       
    }

    static int Convert(int n ,int m){
        int retv = 0;
        int p = 1;
        while(n>0){
            int dig = n % m ;
            n = n/m;
            retv += dig*p;
            p *= 10;

        }
        return retv;

    }
}