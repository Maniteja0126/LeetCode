/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    if(!s) return "";

    function expandAroundCenter(s,left,right){
        while(left >= 0 && right < s.length && s[left] === s[right]){
            left--;
            right++;
        }
        return right-left-1;
    }
    let start =0 , end=0;
    for(let i=0;i<s.length;i++){
        const odd = expandAroundCenter(s,i,i);
        const even = expandAroundCenter(s,i,i+1);
        const maxLen = Math.max(odd,even);

        if(maxLen > end- start){
            start = i-Math.floor((maxLen -1)/2);
            end = i+Math.floor(maxLen/2);

        }

    }
    return s.substring(start,end+1)
};