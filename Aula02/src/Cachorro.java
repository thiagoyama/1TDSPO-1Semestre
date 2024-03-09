public class Cachorro {
    //Atributo
    String nome;
    float peso;
    int idade;
    boolean castrado;
    //Métodos
    void andar() {
        System.out.println(nome + " andando..");
    }

    //Método que calcula a dose de um medicamento
    float calcularDose(int dosePorKg){
        float doses = peso /dosePorKg;
        return doses;
    }

    //Método que calcula a idade "humana" do cachorro (cada ano do dog vale por 7)
    int calcularIdade(){
        int idadeReal = idade * 7;
        return idadeReal;
    }

}
