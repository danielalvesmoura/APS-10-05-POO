package ex2;

public class SelectionSort {

    public void padrao(int[] vetor) {
        int maiorIndice;
        for (int atual = 0; atual < vetor.length-1; atual++) {
            maiorIndice = atual;
            for (int i = atual + 1; i < vetor.length; i++) {
                if (vetor[i] > vetor[maiorIndice]) {
                    maiorIndice = i;
                }
            }
            int aux = vetor[atual];
            vetor[atual] = vetor[maiorIndice];
            vetor[maiorIndice] = aux;
        }
    }


}
