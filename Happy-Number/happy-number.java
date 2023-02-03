class Solution {
    
    public boolean isHappy(int n) {
        while(n != 1){
            n = Cycle(n);
        }
        return n == 1;
    }
    
    public int Cycle(int n){
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            n = n / 10;
            sum += num * num;
        }
        return sum;  
    }
}