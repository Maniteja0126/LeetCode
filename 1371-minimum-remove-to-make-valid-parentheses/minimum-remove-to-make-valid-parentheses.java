class Solution {
    public String minRemoveToMakeValid(String s) {

        int left = 0;
        int right = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '(') left++;
            if(curr == ')') right++;

            if(right > left){
                right--;
                continue;
            }else{
                stack.push(curr);
            }
        }  
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            char curr = stack.pop();
            if(left > right && curr == '(') left--;
            else result.append(curr);
        }      
        return result.reverse().toString();
    }
}