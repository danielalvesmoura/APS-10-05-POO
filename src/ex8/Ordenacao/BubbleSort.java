package ex8.Ordenacao;
import java.util.Arrays;

public class BubbleSort {
    public void padrao(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal,vetorOriginal.length);

        for (int ciclo = 0; ciclo < vetor.length-1; ciclo++) {
            if(Global.estaOrdenado(vetor)) {
                return;
            }

            for (int i = 0; i < vetor.length-1; i++) {
                if (vetor[i] > vetor[i+1]) {

                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;

                }
            }
        }
    }




}

