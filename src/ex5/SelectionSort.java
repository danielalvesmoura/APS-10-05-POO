package ex5;

public class SelectionSort {


    public void padrao(int[][] vetor) {
        for (int camada = 0; camada < vetor.length; camada++) {
            int menorIndice;
            for (int atual = 0; atual < vetor[camada].length-1; atual++) {
                menorIndice = atual;
                for (int i = atual + 1; i < vetor[camada].length; i++) {
                    if (vetor[camada][i] < vetor[camada][menorIndice]) {
                        menorIndice = i;
                    }
                }
                int aux = vetor[camada][atual];
                vetor[camada][atual] = vetor[camada][menorIndice];
                vetor[camada][menorIndice] = aux;
            }
        }
    }



}
