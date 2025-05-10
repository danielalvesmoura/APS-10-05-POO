package ex3;

public class InsertionSort {

    public static void string(String[] vetor) {


        for (int i = 1; i < vetor.length; i++) {


            String chave = vetor[i];
            int j = i - 1;


            while(j>=0 && vetor[j].compareTo(chave) > 0) {
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