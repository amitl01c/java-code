import java.util.*;
class ReverseNum{
    static int RevNum(long N){

        while(N!=0){
            long q =N%10;
            System.out.print(q);

            N=N/10;
        }
    return 0;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        long a= sc.nextInt();
      
        RevNum(a);
     }
     
}