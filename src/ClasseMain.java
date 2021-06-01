import um.Primeiro;

public class ClasseMain {
    public static void main(String[] args) {
//        Primeiro primeiro = new Primeiro();
//        Primeiro outraClassePrimeiro = new Primeiro();
//
//        primeiro.metodoPublico();
//        outraClassePrimeiro.alteraVariavel();
//        primeiro.metodoPublico();

        Carro carro = new Carro(4, 4);
        carro.setCor(Carro.VERMELHO);
        carro.imprimeValores();
    }
}
