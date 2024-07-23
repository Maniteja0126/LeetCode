/**
 * @param {number[]} nums
 * @return {number[]}
 */
var frequencySort = function(nums) {
    let cnt = Array(201).fill(0);
    nums.forEach(num =>{
        cnt[num + 100]++;
    })
    return nums.sort((a,b)=>{
        if(cnt[a+100] === cnt[b+100]){
            return b-a;
        }
        return cnt[a+100] - cnt[b+100];
    })
};