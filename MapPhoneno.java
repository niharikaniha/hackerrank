//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
      for(int i=0;i<n;i++)
      {
          ArrayList<String> list = new ArrayList<>();
         list.add(in.nextLine());
         int phone=in.nextInt();
          list.add(String.valueOf(phone));
         in.nextLine();
          lists.add(list);
      }
      while(in.hasNext())
      { int flag = 0;
         String s=in.nextLine();
         for(int i=0;i<lists.size();i++)
         {
             ArrayList<String> list = lists.get(i);
             String name = list.get(0);
             if(name.equals(s))
             { 
                 
                 System.out.println(s+"="+list.get(1));
                 flag=1;
                 break;
             }
             
         }
       if(flag==0)
       {
           System.out.println("Not found");
       }
      }
   }
}
//alternative
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
         HashMap<String, Integer> map = new HashMap<>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
          map.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
           if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
      }
   }
}
