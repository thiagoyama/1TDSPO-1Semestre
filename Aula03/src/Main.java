import br.com.fiap.tds.model.Carro;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Carro
        Carro gol = new Carro();
        gol.setCor("Azul");
        gol.setModelo("Gol");
        gol.setPlaca("ZZZ123123");

        //Exibir os valores do modelo, placa e cor
        System.out.println(gol.getModelo() + " " + gol.getCor() + " " + gol.getPlaca());

    }
}