package ex1;

public class SelectionSort {


    public void padrao(int[] vetor) {
        for (int atual = 0; atual < vetor.length-1; atual++) {
            for (int i = atual+1; i < vetor.length; i++) {
                if(vetor[i] < vetor[atual]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[atual];
                    vetor[atual] = aux;
                }
            }
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }
            System.out.println();
        }
    }



}