package Banco;

class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        double saldo = conta1.getSaldo();
        System.out.println("Saldo inicial "+ saldo);
        conta1.setSaldo(500);
        double saldo1 = conta1.getSaldo();
        System.out.println("Deposito um "+ saldo1);
        conta1.setSaldo(500);
        double saldo2 = conta1.getSaldo();
        System.out.println("Deposito dois "+ saldo2);
        conta1.sacar(200);
        double salary = conta1.getSaldo();
        System.out.println(salary);
    }
}
