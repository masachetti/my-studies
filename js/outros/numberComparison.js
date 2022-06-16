
function compareNumbers(num1, num2){
    let soma = num1 + num2;
    return `Os números ${num1} e ${num2} ${num1===num2?'':'não '}são iguais. Sua soma é ${soma}, que é \
${soma>=10?'maior':'menor'} que 10 e ${soma>=20?'maior':'menor'} que 20`;
}

console.log(compareNumbers(15,10));