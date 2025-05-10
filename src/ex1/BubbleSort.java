package ex1;

public class BubbleSort {
    public void padrao(int[] vetor) {
        for (int ciclo = 0; ciclo < vetor.length-1; ciclo++) {
            for (int i = 0; i < vetor.length-1; i++) {
                if (vetor[i] > vetor[i+1]) {


                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;


                    for (int j = 0; j < vetor.length; j++) {
                        System.out.print(vetor[j] + " ");
                    }
                    System.out.println();


                }
            }
        }
    }


}

