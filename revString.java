import java.util.*;
class revString{
    public static void main(String[] args) {
        String one = "He is good boy";
        String two = "";

        System.out.println(one);
        for(int i = 0; i<one.length();i++){
            two = one.charAt(i) + two;
        }
        System.out.println(two);
    }
}