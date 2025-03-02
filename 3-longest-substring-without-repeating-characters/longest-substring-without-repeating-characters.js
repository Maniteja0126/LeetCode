/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let map = new Map();
    let left = 0 , right =0 , len = 0 , n = s.length;

    while(right < n){
        if(map.has(s.charAt(right)))
            left = Math.max(map.get(s.charAt(right)) + 1 , left);
        map.set(s.charAt(right) , right);
        len = Math.max(len , right - left + 1);
        right++;
    }
    return len;
};