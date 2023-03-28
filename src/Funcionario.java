import java.util.Scanner;

public class Funcionario {

    //properties
    private String name;
    private String office;
    private double salary;

    //methods

    double getSalary(double desconto) {
        this.salary -= (this.salary * 0.1);
        double salary = this.salary - desconto;
        return salary;
    }


    void setAddSalary(double aditional) {
        this.salary += aditional;
    }

    void createUser(){
        String name;
        String office;
        double salary;
        System.out.println("CADASTRO DE FUNCIONÁRIO");
        Scanner func = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        name = func.nextLine();
        this.name = name;
        System.out.println("Informe o cargo do funcionário: ");
        office = func.nextLine();
        this.office = office;
        System.out.println("Informe o salário do funcionário: ");
        salary = func.nextDouble();
        this.salary = salary;
        System.out.println(
                "Funcionário: "+ this.name + "\n"+
                "Cargo: "+ this.office + "\n"+
                "Salário: "+ this.salary);
    }

}
