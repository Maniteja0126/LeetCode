class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt1=0,cnt0=0;
        for(char ch : s.toCharArray()){
            if(ch=='1') cnt1++;
            else cnt0++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cnt1-1;i++){
            sb.append("1");
        }
        for(int i=0;i<cnt0;i++){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}