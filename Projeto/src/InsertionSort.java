public class InsertionSort {

    public void insertionSortPadrao(int[] vetor) {


        for (int i = 1; i < vetor.length; i++) {


            int chave = vetor[i];
            int j = i - 1;


            while(j>=0 && vetor[j]>chave) {
                vetor[j+1] = vetor[j];
                j--;
            }


            vetor[j+1] = chave;


            for (int cont = 0; cont < vetor.length; cont++) {
                System.out.print(vetor[cont] + " ");
            }
            System.out.println();


        }
    }
}