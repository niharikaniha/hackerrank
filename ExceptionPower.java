import java.lang.*;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.*/
    public static void main(String argr[])
    {
      
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int p = sc.nextInt();
        try{
            if((n>=-10)&&(n<=10)&&(n>=-10)&&(n<=10))
            {
                long res = power(n,p);
                System.out.println(res);
            }
        else throw new Exception("Invalid inputs");
           
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
  static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}
