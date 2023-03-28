package Banco;

class Conta {
    //properties
    private double saldo;
    //constructor
    Conta(){}
    //methods
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = this.saldo + saldo;
    }

    public void sacar(double value) {
        if (this.saldo > 0) {
            this.saldo = this.saldo - value;
        } else {
            System.out.println("ERRRROOOOOOOOO");
        }
    }
}
