//###############################################################################################
// Classe Diretor
//###############################################################################################
// - Herda de Gerente
// - Adiciona atributo "porcentagemParticipacaoLucros"
// - Sobrescreve método getSalarioFinal()
//###############################################################################################

public class Diretor extends Gerente {
    private double porcentagemParticipacaoLucros;

    public Diretor() {
        super();
    }

    public Diretor(String nome, String cpf, double salarioBase, double bonus, double porcentagemParticipacaoLucros) {
        super(nome, cpf, salarioBase, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    public double getPorcentagemParticipacaoLucros() {
        return porcentagemParticipacaoLucros;
    }

    public void setPorcentagemParticipacaoLucros(double porcentagemParticipacaoLucros) {
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    @Override
    public double getSalarioFinal() {
        return getSalarioBase() + getBonus() + (getSalarioBase() * porcentagemParticipacaoLucros / 100);
    }
}