import java.util.*;
class GradingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks to check your grade");
        int a= sc.nextInt();
        if(a>90)
        System.out.println("Excellent");
        else if (a <= 90 &&a > 80)
        System.out.println("Good");
        else if (a <= 80 &&a > 70)
        System.out.println("Fair");
          else if (a <= 70 && a > 60)
        System.out.println("Meet Expectation");
          else if (60>=a)
        System.out.println("Need to work hard");
        
    }
}