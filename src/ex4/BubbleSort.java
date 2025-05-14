package ex4;

public class BubbleSort {
    public void padrao(int[] vetor, int n) {
        for (int ciclo = 0; ciclo < n-1; ciclo++) {
            for (int i = 0; i < n-1; i++) {
                if (vetor[i] > vetor[i+1]) {


                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;


                    for (int j = 0; j < n; j++) {
                        System.out.print(vetor[j] + " ");
                    }
                    System.out.println();


                }
            }
        }
    }


}

