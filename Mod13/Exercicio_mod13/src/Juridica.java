public class Juridica extends Pessoa{
    private Long cnpj;
    private Double capital;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }
}
