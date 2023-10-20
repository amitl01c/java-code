import java.util.*;
class HCFLCM{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        LcmHcf(a,b);
    }


    static int LcmHcf(int a, int b){
        int m=a, n= b;
        while(m % n !=0){
         int num = m % n ;
         m=n;
         n=num;
        }
        int gcd = n;
        int lcm = a*b/ gcd ;

        System.out.println("Gcd is : "+ gcd);
        System.out.println("Lcm is : "+ lcm);
       return 0;
    }

}