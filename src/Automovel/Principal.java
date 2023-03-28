package Automovel;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Preto fosco", 250, "corsa");
        carro1.setPortas(4);
        carro1.setEstoque();
        boolean sN = carro1.getEstoque();
        System.out.println("em estoque ? "+ (sN ? "SIM" : "NAO"));
        carro1.ligar();
        System.out.println("O " + carro1.getNome());
        System.out.println("da cor "+ carro1.getCor());
        System.out.println("Tem uma velocidade maxima de "+ carro1.getVelocidade());
        System.out.println("e tem "+ carro1.getPortas() +" portas");
        carro1.comprar();
        carro1.desligar();
    }
}
