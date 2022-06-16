var myArray = [1, 2, 3, 4, 5, 6, 7, 8];

// MAP
var mapedArray = myArray.map((item)=>item*2);
console.log(mapedArray);

var multiplierHolder = {multiplier:5};
// Não da pra usar o 'this' dentro de arrow functions, então tive q criar uma função anonima.
var mapFunction = function (item) {return item*(this.multiplier)}
var mapedArrayWithThis = myArray.map(mapFunction, multiplierHolder);
console.log(mapedArrayWithThis);

// FILTER

var evenNumbers = myArray.filter((item)=>item%2===0);
console.log(evenNumbers);

// REDUCE

var arraySum = myArray.reduce((acc, current) => acc + current);
console.log(arraySum);

var prices = [100, 200, 50, 35, 80.75, 99.99];
var initialBalance = 500;

var finalBalance = prices.reduce((acc, current) => acc-current, initialBalance);
console.log(finalBalance);