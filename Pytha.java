import java.util.*;
class Pytha{
    static int Triplests(int a, int b, int c){
       
        if(a>b){
            if(a>c){
                if(a*a==b*b+c*c){
                    System.out.println("The numbers are triplests");
                }
                else{
                 System.out.println("The numbers are not triplests");
            }
            }
            else{
                if(c*c==a*a+b*b) {
           
            System.out.println("The numbers are triplests");
        
         } 
         else{
             System.out.println("The numbers are not triplests");
         }

            }
        }
        else if (b>c){
            if(b*b==a*a+c*c){
                System.out.println("The numbers are triplests");
            }
            else{
                 System.out.println("The numbers are not triplests");
            }
        
         
         
        }
        else   if(c*c==a*a+b*b) {
          
            System.out.println("The numbers are triplests");
        
         } 
         else{
             System.out.println("The numbers are not triplests");
         }
         
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c
        =sc.nextInt(); 
        Triplests(a,b,c);

    }
}