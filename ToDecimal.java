//This is a code to connvert any base value in decimal 
// In it we take the input of that base value and base type.
import java.util.*;
class ToDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = toDeci(a, b) ;
        System.out.println(ans);

    }
    static int toDeci(int m,  int n){

        int ans = 0;
        int power = 1;
        while (m>0){
            int num = m%10;
            m = m/10;
             ans += num*power;
             power = power * n ;
        }
        return ans;
    }
}