import br.com.fiap.lavanderia.model.Endereco;
import br.com.fiap.lavanderia.model.Funcionario;
import br.com.fiap.lavanderia.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //Instanciar um funcionário
        Funcionario f = new Funcionario(1, "Pedro", "12.554.545-87", endereco, "Atendente", 1500);

        //Setar o nome e cargo do funcionario
        f.setNome("Jorge Roberto");
        f.setCargo("Assistente técnico");

     }
}