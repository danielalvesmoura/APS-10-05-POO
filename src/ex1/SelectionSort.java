package ex1;

public class SelectionSort {


    public void padrao(int[] vetor) {
        int menorIndice;
        for (int atual = 0; atual < vetor.length-1; atual++) {
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
