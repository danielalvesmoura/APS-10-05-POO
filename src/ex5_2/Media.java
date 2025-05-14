package ex5_2;

public class Media {
    public static Double media(int[] vetor) {
        Double soma = 0.;
        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }

}
