/**
 * @param {string[]} logs
 * @return {number}
 */
var minOperations = function(logs) {
    let paths = [];
    for(let log of logs){
        if(log == '../'){

            if(paths.length > 0){
                paths.pop();
            }
        }else if(log !== './'){
            paths.push(log);
        }
    }
    return paths.length;
};