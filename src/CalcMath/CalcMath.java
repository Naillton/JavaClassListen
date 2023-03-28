package CalcMath;
import java.lang.Math;
import java.util.Scanner;

public class CalcMath {
    private double raizASerCalculada;

    public double calcRaiz(double number) {
        double result = Math.sqrt(number);
        return result;
    }

    public static void main(String[] args) {
        double number = 81;
        CalcMath raiz = new CalcMath();
        double calc = raiz.calcRaiz(number);
        Scanner pessoa = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = pessoa.next();
        System.out.print("Digite o primeiro numero: ");
        int numberOne = n.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numberTwoo = n.nextInt();
        System.out.println(numberOne + numberTwoo);
        System.out.println("Olá "+ nome + "\n"+
                "A raiz quadrade de "+ number +" é "+ calc);
        pessoa.close();
        n.close();
    }
}
