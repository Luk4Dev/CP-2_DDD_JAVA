//###############################################################################################
// Classe Funcionario
//###############################################################################################
// - Superclasse de Gerente e Diretor.
// - Mostra conceitos de encapsulamento, sobrecarga de métodos e herança.
//###############################################################################################

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioFinal() {
        return salarioBase;
    }

//###########################################################################################
// Sobrecarga de métodos (polimorfismo estático):
//###########################################################################################

    public void aumentarSalario() {
        this.salarioBase *= 1.10;
    }

    public void aumentarSalario(double percentual) {
        this.salarioBase *= (1 + percentual / 100);
    }

    public void aumentarSalario(double percentual, double bonus) {
        this.salarioBase = this.salarioBase * (1 + percentual / 100) + bonus;
    }
}
