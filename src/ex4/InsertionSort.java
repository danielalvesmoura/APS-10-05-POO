package ex4;

public class InsertionSort {

    public void padrao(int[] vetor, int n) {


        for (int i = 1; i < n; i++) {


            int chave = vetor[i];
            int j = i - 1;


            while(j>=0 && vetor[j]>chave) {
                vetor[j+1] = vetor[j];
                j--;
            }


            vetor[j+1] = chave;


            for (int cont = 0; cont < n; cont++) {
                System.out.print(vetor[cont] + " ");
            }
            System.out.println();


        }
    }

}