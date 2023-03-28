package Teste;

public class Carro {
    //Properties
    private String nome;
    private String montadora;
    private int ano;

    //Constructor
    Carro(String montadora, String nome, int ano){
        this.montadora = montadora;
        this.nome = nome;
        this.ano = ano;
    }

    //methods

    public String getNome(){
        return this.nome;
    }

    public String getMontadora(){
        return  this.montadora;
    }

    public int getAno() {
        return this.ano;
    }
}
