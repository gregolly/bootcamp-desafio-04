package um;

public class Primeiro {

    // variavel não pode ser acessada dentro do metodo estatico
    private static Integer variavel = 1;
    public final static Integer CONSTANTE = 10;
    private static Integer escopoDeClasse = 1;

    // pode ser acessado somente pela classe diretamente
    public static Integer metodoEstatico() {
        return 1;
    }

    // metodo pode ser acessado de qualquer pacote ou arquivo
    public void metodoPublico() {
        System.out.println(escopoDeClasse);
        escopoDeClasse = 10;
        System.out.println(escopoDeClasse);
//        Integer variavel = 1;
//
//        System.out.println(variavel);
//        variavel = 2;
//        System.out.println(variavel);
    }

    public void alteraVariavel() {
        System.out.println(escopoDeClasse);
        escopoDeClasse = escopoDeClasse + 2;
        System.out.println(escopoDeClasse);
    }

    // metodo só pode ser acessado dentro do mesmo arquivo
    private void metodoPrivado() {

    }

    // metodo só pode ser acessado dentro do mesmo pacote ou dentro de uma classe de henraça (com extends)
    protected void metodoProtected() {

    }

    // metodo parecido com o protected não pode ser acessado de pacotes diferentes mas não pode ser acessado
    // com extends
    void metodoDefault() {

    }
}
