import um.Primeiro;

public class ClasseMain {
    public static void main(String[] args) {
//        Primeiro primeiro = new Primeiro();
//        Primeiro outraClassePrimeiro = new Primeiro();
//
//        primeiro.metodoPublico();
//        outraClassePrimeiro.alteraVariavel();
//        primeiro.metodoPublico();

        Carro carro = new Carro(5, 4, 4, 5, 222222, 2020, "Flex");
        carro.setCor(Carro.PRETA);
        carro.imprimeValores();
    }
}
