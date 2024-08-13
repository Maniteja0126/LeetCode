/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum2 = function(candidates, target) {
    let results = [];
    candidates.sort((a,b)=>a-b);

    function backtrack(start , target , curr){
        if(target === 0){
            results.push([...curr]);
            return;
        }

        for(let i=start ; i< candidates.length ;i++){
            if(i > start && candidates[i] === candidates[i-1]) continue;

            if(candidates[i] > target ) break;

            curr.push(candidates[i]);

            backtrack(i+1 , target-candidates[i] , curr);
            curr.pop();
        }

    }
     backtrack(0,target , []);
    return results;
};