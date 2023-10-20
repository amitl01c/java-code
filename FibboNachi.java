import java.util.*;
class FibboNachi{
    static int PrintFibo(int N){
        int a =0,b=1,temp=0;
       // System.out.print(a+"  "+b+"  ");
        for(int i=1;i<=N;i++){
              System.out.print(a +"  ");
            temp=a+b;
            a=b;
            b=temp;   
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a= sc.nextInt();
        PrintFibo(a);
    }
}