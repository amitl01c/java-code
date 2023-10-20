import java.util.*;
class BikeCar{
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter the number of vehicle");
      int v = sc.nextInt();
      System.out.println("Enter the number of wheels of vehicle ");
      int w = sc.nextInt();
      calculate(v, w);

    }

    static int calculate(int a , int b){
        int car = (b - 2*a)/2;
        int bike = a - car;
        System.out.println("Number of cars are "+ car);
        System.out.println("Number of bikes are "+ bike);
        return 0;
    }
}