/**
 * @param {string} s
 * @return {string}
 */
var reverseParentheses = function(s) {
    let stack = [];
    let res  =[];

    for(let ch of s){
        if(ch === '('){
            stack.push(res.length);
        }else if(ch === ')'){
            let start = stack.pop();
            let subarr = res.slice(start).reverse();
            res.splice(start , subarr.length,...subarr);
        }else{
            res.push(ch);
        }
    }
    return res.join('');
};