package ex9.Ordenacao;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int vetor[], int aux[], int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        if (inicio < fim) {
            merge(vetor, aux, inicio, meio);
            merge(vetor, aux, meio + 1, fim);
            intercalacao(vetor, aux, inicio, meio, fim);
        }
    }

    public static void intercalacao(int vetor[], int aux[], int inicio, int meio, int fim) {
        for (int x = inicio; x <= fim; x++) {
            aux[x] = vetor[x];
        }
        int esquerda = inicio;
        int direita = meio + 1;

        for (int x = inicio; x <= fim; x++) {
            if (esquerda > meio) {
                vetor[x] = aux[direita++];
            } else if (direita > fim) {
                vetor[x] = aux[esquerda++];
            } else if (aux[esquerda] < aux[direita]) {
                vetor[x] = aux[esquerda++];
            } else {
                vetor[x] = aux[direita++];
            }
        }
    }



}


