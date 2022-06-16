function calculaIdade(anos){
    return `Daqui ${anos} anos ${this.name} terá ${this.age + anos} anos de idade`;
}

var createObject = function(name, age) {return {name:name, age:age}};

var pedro = createObject('Pedro', 3);
// Apply
console.log(calculaIdade.apply(pedro, [10]));

// Call
console.log(calculaIdade.call(pedro, 15));

// Bind
var calculaIdadeDoPedro = calculaIdade.bind(pedro);
console.log(calculaIdadeDoPedro(20));

