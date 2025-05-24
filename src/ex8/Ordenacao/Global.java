package ex8.Ordenacao;

public class Global {

    public static Boolean estaOrdenado(int[] vetor) {
        for(int i = 0; i < vetor.length-1; i++) {
            if(vetor[i] > vetor[i+1]) {
                return false;
            }
        }
        return true;
    }
}
