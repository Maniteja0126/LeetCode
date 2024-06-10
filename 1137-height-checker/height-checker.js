/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    let expected  = heights.slice().sort((a,b)=>a-b);
    let cnt =0;

    for(let i=0;i<heights.length;i++){
        if(heights[i] !== expected[i]){
            cnt++;
        }
    }
    return cnt;
};