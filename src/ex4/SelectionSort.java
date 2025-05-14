package ex4;

public class SelectionSort {


    public static void padrao(int[] vetor, int n) {
        int menorIndice;
        for (int atual = 0; atual < n-1; atual++) {
            menorIndice = atual;
            for (int i = atual + 1; i < n; i++) {
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
