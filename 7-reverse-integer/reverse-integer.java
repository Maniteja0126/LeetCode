class Solution {
    public int reverse(int x) {
        int rev =0 ;
        while(x!=0){
            int rem = x%10;
            rev = rev*10+rem;
            x/=10;

            if(rev%10!=rem){
                return 0;
            }
        }
        return rev;
    }
}