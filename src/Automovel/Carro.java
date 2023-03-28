package Automovel;

public class Carro extends  Automovel{
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
}
