/**
 * @param {number[][]} points
 * @return {number}
 */
var maxPoints = function(points) {
    let width = points[0].length;
    let curr = new Array(width).fill(0);
    let prev = new Array(width);

    for(let i=0;i<width;i++){
        prev[i] = points[0][i];
    }

    for(let row = 1 ; row < points.length;row++){
        let peak = 0;
        for(let col = 0;col < width;col++){
            peak = Math.max(peak -1 , prev[col]);
            curr[col] = points[row][col] + peak;
        }
        peak = 0;

        for(let col = width -1 ; col >= 0 ; col--){
            peak = Math.max(peak -1 , prev[col]);
            curr[col] = Math.max(curr[col] , points[row][col] + peak);
        }

        [prev , curr] = [curr , prev];
    }
    return Math.max(...prev);
};