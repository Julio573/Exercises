package ex14;

public class PessoaFisica extends Pessoa {

    private double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double tax() {
        if (getRendaAnual() <= 20000.00) {
            return getRendaAnual() * 1.5 - getGastosSaude() * 0.5;
        } else {
            return getRendaAnual() * 1.5 - getGastosSaude() * 0.5;
        }
    }
}
