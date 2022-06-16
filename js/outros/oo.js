
class ContaBancaria{
    constructor(agencia, numero, tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0;
    }

    get saldo(){
        return this._saldo;
    }

    set saldo(value){
        this._saldo = value;
    }

    sacar(value){
        this.saldo = this.saldo - value;
    }

    depositar(value){
        this.saldo = this.saldo + value;
    }
}


class ContaCorrent extends ContaBancaria{
    constructor(agencia, numero, cartaoCredito){
        super(agencia, numero, 'CONTA_CORRENTE');
        this.cartaoCredito = cartaoCredito;
    }

    get cartaoCredito(){
        return this._cartaoCredito;
    }

    set cartaoCredito(value){
        this._cartaoCredito = value;
    }
}

class ContaPoupanca extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero, 'CONTA_POUPANCA');
    }
}


class ContaUniversitaria extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero, 'CONTA_UNIVERSITARIA');
    }

    sacar(value){
        if (value > 500){
            return "Só é possivel sacar valores menores que 500 reias";
        }
        super.sacar(value);
    }
}

var conta = new ContaUniversitaria(1,2);
console.log(conta);
conta.saldo = 1500;
conta.sacar(300);
console.log(conta);
conta.sacar(1000);
console.log(conta);