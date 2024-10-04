
var TimeMap = function() {
    this.keyStore = new Map();
};

/** 
 * @param {string} key 
 * @param {string} value 
 * @param {number} timestamp
 * @return {void}
 */
TimeMap.prototype.set = function(key, value, timestamp) {
    if(!this.keyStore.has(key)){
        this.keyStore.set(key,[]);
    }
    this.keyStore.get(key).push({value , timestamp});
};

/** 
 * @param {string} key 
 * @param {number} timestamp
 * @return {string}
 */
TimeMap.prototype.get = function(key, timestamp) {
    if(!this.keyStore.has(key)){
        return "";
    }

    const values = this.keyStore.get(key);
    let low = 0 , high = values.length-1;
    let result = "";

    while(low <= high){
        const mid = Math.floor((low+high)/2);

        if(values[mid].timestamp <= timestamp){
            result = values[mid].value;
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }
    return result;
};

/** 
 * Your TimeMap object will be instantiated and called as such:
 * var obj = new TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */