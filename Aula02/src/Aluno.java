public class Aluno {
    String nome;
    float cp;
    float challenge;
    float gs;

    float mediaFinal(){
        float media = cp * 0.2f + challenge * 0.2f + gs * 0.6f;
        return media;
    }
}
