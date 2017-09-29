import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(); 
        for(int i =0;i<s;i++)
        {
            int e = sc.nextInt();
           a.add(i,e);
        }
        int q = sc.nextInt();
        for(int i= 0;i<q;i++)
        {
            String st = sc.next();
            if(st.equals("Insert"))
            {
                int in = sc.nextInt();
                int el = sc.nextInt();
                a.add(in,el);
                
            }
            else
            {
                int in = sc.nextInt();
                a.remove(in);
            }
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i));
            System.out.print(" ");
        }
    }
}
