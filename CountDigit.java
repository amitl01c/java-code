
import java.util.*;
class CountDigit{
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number to count digit");
              int a=sc.nextInt();
              int Digit=0;
              while(a!=0){
                a=a/10;
                Digit++;
              }
        System.out.println(Digit);

            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
      
    }
}