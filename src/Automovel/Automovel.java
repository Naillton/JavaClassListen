package Automovel;

public class Automovel implements Auto {
    private String cor;
    private int velocidade;
    private String nome;

    Automovel(String cor, int velocidade, String nome) {
        this.nome = nome;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public void ligar() {
        System.out.println("Automovel ligado");
    }

    public void desligar() {
        System.out.println("Automovel desliga");
    }

    public String getCor() {
        return this.cor;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
