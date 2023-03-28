import java.util.Scanner;

public class Casa {
    String cor = "Branco";
    byte numero = 10;
    boolean garagem = false;


    void abrirPorta(String visitNome){
        System.out.println("ALGUEM ESTA TENTANDO ABRIR A PORTAAAA!!!");
        campanhia();
        System.out.println("Qual o seu nome ? ");
        if (visitNome.length() == 0) {
            System.out.println("NÂO ME FALA QUEM É EU NÃO ABRO");
        } else {
            alguem(visitNome);
            System.out.println("JA VAAAIIIII!!!");
        }
    }
    protected void alguem(String nome){
        System.out.println("É O " + nome + " ABBBRREEE TA CHOVENDO");
    }
    protected void campanhia(){
        System.out.println("TIIINNNN DDDDOOOMMMMM");
    }
}
