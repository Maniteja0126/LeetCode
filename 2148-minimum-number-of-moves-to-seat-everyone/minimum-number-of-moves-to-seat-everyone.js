/**
 * @param {number[]} seats
 * @param {number[]} students
 * @return {number}
 */
var minMovesToSeat = function(seats, students) {
    let moves = 0 ;
    seats = seats.sort((a,b)=>a-b);
    students = students.sort((a,b)=>a-b);

    seats.forEach((s,i)=> moves = moves+Math.abs(s-students[i]));

    return moves;

};