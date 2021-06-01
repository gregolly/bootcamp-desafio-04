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

    public Carro(Integer quantidadePneus, Integer quantidadeCalotas) {
        setQuantidadePneus(quantidadePneus);
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 2;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadePneus;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas = 5;
    }

    public long getNumeroChassi() {
        return numeroChassi = 3281372;
    }

    public Integer getAnoFabri() {
        return anoFabri = 2021;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel = "Gasolina";
    }

//    public void setQuantidadeCalotas(Integer calotas) {
//        System.out.println(calotas);
//    }

    public Integer getQuantidadeDeParafusos() {
        return quantidadePneus * 4;
    }

//    public void setQuantidadeDeParafusos() {
//        this.quantidadeDeParafusos = quantidadeDeParafusos;
//    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        quantidadeCalotas = quantidadePneus;
        quantidadeDeParafusos = quantidadePneus * 4;
        this.quantidadePneus = quantidadePneus;
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
