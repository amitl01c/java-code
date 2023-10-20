//This is a code to find the duplicate brackets in the given algebric expression

import java.util.*;
import java.io.*;
public class Dupli_Brackests{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<> ();
        
         for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')')
            {
                if(st.peek() == '('){
                    System.out.println("Duplicate Brackets found");
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else
            {
                st.push(ch);
            }
         }
    }
}