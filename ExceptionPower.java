
 Practice
 Compete
 Jobs
 Rank
 Leaderboard
  Niharikaniha  
Dashboard  Java  Exception Handling  Java Exception Handling Points: 348.00 Rank: 13046
Java Exception Handling 
by Shafaet
Problem
Submissions
Leaderboard
Discussions
Editorial
Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers,  and , as parameters and finds . If either  or  is negative, then the method must throw an exception which says "n or p should not be negative.". Also, if both  and  are zero, then the method must throw an exception which says "n and p should not be zero."

Input Format

Each line of the input contains two integers,  and . The locked stub code in the editor reads the input and sends the values to the method as parameters.

Constraints

Output Format

Each line of the output contains the result , if both  and  are positive. If either  or  is negative, the output contains "n and p should be non-negative". If both  and  are zero, the output contains "n and p should not be zero.". This is printed by the locked stub code in the editor.

Sample Input 0

3 5
2 4
0 0
-1 -2
-1 3
Sample Output 0

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
Explanation 0

In the first two cases, both  and  are postive. So, the power function returns the answer correctly.
In the third case, both  and  are zero. So, the exception, "n and p should not be zero.", is printed.
In the last two cases, at least one out of  and  is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
Easy
Submitted 19630 times
Max Score 15
Need Help?

View Discussions
View Editorial Solution
View Top Submissions
Rate This Challenge:

    
Download problem statement
Download sample test cases
Suggest Edits
Current Buffer (saved locally, editable)      
Java 8

 
1
import ↔;
2
​

3
import java.lang.*;
4
class MyCalculator {
5
    /*
6
    * Create the method long power(int, int) here.*/
7
    public static void main(String argr[])
8
    {
9
      
10
            Scanner sc = new Scanner(System.in);
11
            int n = sc.nextInt();
12
            int p = sc.nextInt();
13
        try{
14
            if((n>=-10)&&(n<=10)&&(n>=-10)&&(n<=10))
15
            {
16
                long res = power(n,p);
17
                System.out.println(res);
18
            }
19
        else throw new Exception("Invalid inputs");
20
           
21
    }
22
        catch(Exception e)
23
        {
24
            System.out.println(e);
25
        }
26
    }
27
  static long power(int n, int p) throws Exception {
28
        if (n < 0 || p < 0) {
29
            throw new Exception("n or p should not be negative.");
30
        } else if (n == 0 && p == 0) {
31
            throw new Exception("n and p should not be zero.");
32
        } else {
33
            return (long) Math.pow(n, p);
34
        }
35
    }
36
}
37
​

38
public class Solution {↔}
Line: 23 Col: 9
Run Code  Submit Code Upload Code as File 
Test against custom input
Congrats, you solved this challenge!
 Test Case #0
 Test Case #1
Next ChallengeYou've earned 15.00 points!
Copyright © 2017 HackerRank. All Rights Reserved

Join us on IRC at #hackerrank on freenode for hugs or bugs. 
Contest Calendar | Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy | Request a Feature


