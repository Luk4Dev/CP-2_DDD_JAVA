//###############################################################################################
// Classe Main
//###############################################################################################
// - Classe de teste para Funcionario, Gerente e Diretor.
// - Demonstra herança, encapsulamento, sobrecarga e sobrescrita.
//###############################################################################################

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "111.111.111-11", 2000);
        System.out.println("Funcionário: " + f1.getNome());
        System.out.println("Salário final: " + f1.getSalarioFinal());

        f1.aumentarSalario();
        System.out.println("Salário após aumento de 10%: " + f1.getSalarioFinal());

        f1.aumentarSalario(20);
        System.out.println("Salário após aumento de 20%: " + f1.getSalarioFinal());

        f1.aumentarSalario(15, 500);
        System.out.println("Salário após aumento de 15% + bônus: " + f1.getSalarioFinal());

        System.out.println("------------------------------------------------");

        Gerente g1 = new Gerente("Carlos", "222.222.222-22", 5000, 2000);
        System.out.println("Gerente: " + g1.getNome());
        System.out.println("Salário final: " + g1.getSalarioFinal());

        System.out.println("------------------------------------------------");

        Diretor d1 = new Diretor("Fernanda", "333.333.333-33", 10000, 4000, 10);
        System.out.println("Diretor: " + d1.getNome());
        System.out.println("Salário final: " + d1.getSalarioFinal());
    }
}
