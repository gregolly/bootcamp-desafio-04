public class Carro {

    public static final String VERMELHO = "Vermelho";
    public static final String PRETA = "PRETA";
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeDeParafusos;
    private Integer quantidadePortas;
    private long numeroChassi;
    private Integer anoFabri;
    private String tipoCombustivel;

    public Carro(
            Integer quantidadePneus,
            Integer quantidadeCalotas,
            Integer quantidadeDeParafusos,
            Integer quantidadePortas,
            long numeroChassi,
            Integer anoFabri,
            String tipoCombustivel
    ) {
        setQuantidadePneus(quantidadePneus);
        setQuantidadeCalotas(quantidadeCalotas);
        setQuantidadeDeParafusos(quantidadeDeParafusos);
        setQuantidadePortas(quantidadePortas);
        setNumeroChassi(numeroChassi);
        setAnoFabri(anoFabri);
        setTipoCombustivel(tipoCombustivel);
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadePneus;
    }

    public void setQuantidadeCalotas(Integer calotas) {
        this.quantidadeCalotas = calotas;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer portas) {
        this.quantidadePortas = portas;
    }

    public long getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(long chassi) {
        this.numeroChassi = chassi;
    }

    public Integer getAnoFabri() {
        return anoFabri;
    }

    public void setAnoFabri(Integer ano) {
        this.anoFabri = ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String combustivel) {
        this.tipoCombustivel = combustivel;
    }

    public Integer getQuantidadeDeParafusos() {
        return quantidadeDeParafusos * 4;
    }

    public void setQuantidadeDeParafusos(Integer parafusos) {
        this.quantidadeDeParafusos = parafusos;
    }

    public void setCor(String cor) {
        System.out.println(cor);
    }

    public void imprimeValores() {
        System.out.println("Quantidade de pneus no carro: " + getQuantidadePneus());
        System.out.println("Quantidade de calotas: " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos totais: " + getQuantidadeDeParafusos());
        System.out.println("Quantidade de portas totais: " + getQuantidadePortas());
        System.out.println("O número do chassi do carro é: " + getNumeroChassi());
        System.out.println("O carro foi fabricado em: " + getAnoFabri());
        System.out.println("O tipo de combustivel do carro é: " + getTipoCombustivel());
    }
}
