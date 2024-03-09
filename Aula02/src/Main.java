public class Main {
    public static void main(String[] args) {
        //Criar um objeto para representar um cachorro
        Cachorro dogBelga = new Cachorro();
        //Atribuir valores aos atributos do objeto
        dogBelga.nome = "Spike";
        dogBelga.peso = 30;
        dogBelga.idade = 6;
        dogBelga.castrado = true;
        //Exibir os dados do objeto cachorro
        System.out.println(dogBelga.nome + ", tem " + dogBelga.idade + " anos," +
                "pesa " + dogBelga.peso + " Kg e é castrado? " + dogBelga.castrado);

        //Criar um outro objeto cachorro
        Cachorro cao = new Cachorro();

        //Atribuir outros valores
        cao.nome = "Brutus";
        cao.peso = 40;
        cao.idade = 2;
        cao.castrado = false;

        //Exibir os valores do outro objeto
        System.out.println(cao.nome + ", tem " + cao.idade + " anos," +
                "pesa " + cao.peso + " Kg e é castrado? " + cao.castrado);

        //Chamar os métodos
        cao.andar();
        dogBelga.andar();

        //Chamar o método para calcular a dose do remedio 1 a cada 7 kg
        float doseBelga = dogBelga.calcularDose(5);
        System.out.println("Doses necessárias: " + doseBelga);

        //Calcular e exibir a idade humada do dog
        int idadeDogReal = dogBelga.calcularIdade();
        System.out.println("Idade humana: " + idadeDogReal);

    }
}