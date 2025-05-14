package ex8.Ordenacao;

import java.util.Arrays;

public class InsertionSort {

    public int padrao(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal,vetorOriginal.length);
        int trocas = 0;

        for (int i = 1; i < vetor.length; i++) {


            int chave = vetor[i];
            int j = i - 1;


            while(j>=0 && vetor[j]>chave) {
                vetor[j+1] = vetor[j];
                j--;
            }


            vetor[j+1] = chave;
            trocas++;

        }
        return trocas;
    }

}