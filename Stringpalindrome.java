import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse ="";
        try{
            if(A.length()<=50)
            {
        for ( int i = A.length() - 1; i >= 0; i-- )
         reverse = reverse + A.charAt(i);
       if(A.equals(reverse))
       {
           System.out.println("Yes");
           
       }
        else System.out.println("No");
    }
            else 
            {
            throw new Exception("index out of bounds");
            }
        }
        catch(Exception e)
        {
            System.out.println("string must contain less that 50 charachters");
        }
}
}
