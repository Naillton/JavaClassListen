package Automovel;

public class Carro extends Automovel implements Auto{
    private int portas;
    private boolean estoque = false;
    Carro(String cor, int velocidade, String nome) {
        super(cor, velocidade, nome);
    }

    public int getPortas() {
        return this.portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean getEstoque() {
        return this.estoque;
    }

    public void setEstoque() {
        this.estoque = !this.estoque;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o carro vrrruuummmmmm");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro trutrutrutru");
    }

    public void comprar() {
        System.out.println(Auto.comprar());
    }
}
