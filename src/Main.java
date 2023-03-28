import CalcMath.CalcMath;

public class Main {
    public static void main(String[] args) {
        /* Casa minhaCasa = new Casa();
        minhaCasa.cor = "Preta";
        minhaCasa.numero = 20;
        System.out.println("A cor da minha casa é " + minhaCasa.cor);
        System.out.println("O número dela é " + minhaCasa.numero);
        if (minhaCasa.garagem) {
            System.out.println("E ela tem garagem");
            System.out.println("Quando chegar me fala teu nome");
        } else {
            System.out.println("E ela não tem garagem");
            System.out.println("Quando chegar me fala teu nome");
        }
        minhaCasa.abrirPorta("hdjkgskfgksfg");*/
        /*Funcionario funcionario = new Funcionario();
        funcionario.createUser();
        double salary = funcionario.getSalary(200);
        System.out.println("Salário final: "+ salary);
        funcionario.setAddSalary(800);
        salary = funcionario.getSalary(0);
        System.out.println("Salário atualizado: "+ salary);*/
        Cachorro cachorro = new Cachorro();
        cachorro.setCor("Marrom");
        String cor = cachorro.getCor();
        cachorro.acordar();
        cachorro.latir();
        System.out.println("O cachorro "+ cor +" está latindo");
    }
}