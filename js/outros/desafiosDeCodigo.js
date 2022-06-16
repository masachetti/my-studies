const A = 1;
const B = 6;
var extremesSum = A+B;
var N = B-A;
var extra = (N % 2 === 0 ? A + (N/2): extremesSum);
const total = (extremesSum * ~~(N/2)) + extra;
console.log(total);