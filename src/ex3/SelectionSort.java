package ex3;

public class SelectionSort {

    public void string(String[] vetor) {
        int menorIndice;
        for (int atual = 0; atual < vetor.length-1; atual++) {
            menorIndice = atual;
            for (int i = atual + 1; i < vetor.length; i++) {
                if (vetor[i].compareTo(vetor[menorIndice]) < 0) {
                    menorIndice = i;
                }
            }
            String aux = vetor[atual];
            vetor[atual] = vetor[menorIndice];
            vetor[menorIndice] = aux;
        }
    }


}
