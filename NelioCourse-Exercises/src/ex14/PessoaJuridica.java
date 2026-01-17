package ex14;

public class PessoaJuridica extends Pessoa {

    private int numeroDeFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double tax() {
        if (getNumeroDeFuncionarios()  < 10) {
            return getRendaAnual() * 1.6;
        } else {
            return getRendaAnual() * 1.4;
        }
    }
}
