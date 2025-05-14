package ex4;

public class SelectionSort {


    public void padrao(int[] vetor, int n) {
        for (int atual = 0; atual < n-1; atual++) {
            for (int i = atual+1; i < n; i++) {
                if(vetor[i] < vetor[atual]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[atual];
                    vetor[atual] = aux;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(vetor[j] + " ");
            }
            System.out.println();
        }
    }



}