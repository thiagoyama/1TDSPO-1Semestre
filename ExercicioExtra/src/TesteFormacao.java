import br.com.fiap.faculdade.model.Bacharelado;
import br.com.fiap.faculdade.model.Medio;
import br.com.fiap.faculdade.model.Tecnologo;
import br.com.fiap.faculdade.model.TipoPeriodo;

import javax.swing.*;

public class TesteFormacao {
    public static void main(String[] args) {
        //Pedir para o usuário escolher qual formação será preenchida
        String op = JOptionPane.showInputDialog("Digite a formacao (Medio, Tecnologo, Bacharelado)");

        //Ler os dados do ensino médio
        String descricao = JOptionPane.showInputDialog("Digite a descrição");
        //Converte uma String para uma das constantes
        TipoPeriodo periodo = TipoPeriodo.valueOf(
                JOptionPane.showInputDialog("Digite o Periodo (MANHA, TARDE, NOITE, PERIODO_INTEGRAL)"));

        if (op.equalsIgnoreCase("medio")){

            String tipo = JOptionPane.showInputDialog("Digite o tipo");
            //Instanciar o objeto
            Medio medio = new Medio(descricao, periodo, tipo);

            //Definir a duração
            medio.definirDuracao();

            //Calcular a mensalidade
            medio.calcularMensalidade(0.8);

            //Exibir os dados do objeto
            JOptionPane.showMessageDialog(null, medio);
        } else if (op.equalsIgnoreCase("tecnologo")){
            boolean planoEstendido = Boolean.parseBoolean(JOptionPane.showInputDialog("É plano estendido? (true/false)"));
            //Instanciar
            Tecnologo tecnologo = new Tecnologo(descricao, periodo, planoEstendido);
            //Chamar os métodos para configurar o periodo e mensalidade
            tecnologo.definirDuracao();
            tecnologo.calcularMensalidade(1);
            //Exibir os dados
            JOptionPane.showMessageDialog(null, tecnologo);
        } else if (op.equalsIgnoreCase("bacharelado")){
            String projeto = JOptionPane.showInputDialog("Digite o projeto de TCC");
            int cargaEstagio = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do estágio"));

            Bacharelado bacharelado = new Bacharelado(descricao, periodo, projeto, cargaEstagio);
            bacharelado.definirDuracao();
            bacharelado.calcularMensalidade(1.1);

            JOptionPane.showMessageDialog(null, bacharelado);
        }
    }
}