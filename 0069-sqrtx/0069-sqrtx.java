import static java.lang.Math.*;

class Solution{
    public int mySqrt(int x) {
        int ans = 0;
        double result = Math.sqrt(x);
       // System.out.println(result);
        ans = (int) Math.sqrt(x);
       return ans;
    }
}