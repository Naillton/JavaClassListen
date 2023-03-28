package Teste;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Nissan", "Nissan GTR-R35", 2020);
        String nome = carro1.getNome();
        String montadora = carro1.getMontadora();
        int ano = carro1.getAno();
        System.out.println("A montadora "+ montadora);
        System.out.println("Disponibilizou a venda o "+ nome +" em "+ ano);
    }

}
