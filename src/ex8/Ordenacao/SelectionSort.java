package ex8.Ordenacao;

import java.util.Arrays;
import global.Impressao;

public class SelectionSort {


    public void padrao(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal,vetorOriginal.length);
        int menorIndice;
        for (int atual = 0; atual < vetor.length-1; atual++) {
            if(Global.estaOrdenado(vetor)) {
                return;
            }

            menorIndice = atual;
            for (int i = atual + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menorIndice]) {
                    menorIndice = i;
                }
            }
            int aux = vetor[atual];
            vetor[atual] = vetor[menorIndice];
            vetor[menorIndice] = aux;
        }
    }



}
