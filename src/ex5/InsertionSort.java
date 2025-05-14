package ex5;

import global.Impressao;

public class InsertionSort {

    public void padrao(int[][] vetor) {

        for (int camada = 0; camada < vetor.length; camada++) {

            for (int i = 1; i < vetor[camada].length; i++) {


                int chave = vetor[camada][i];
                int j = i - 1;


                while(j>=0 && vetor[camada][j]>chave) {
                    vetor[camada][j+1] = vetor[camada][j];
                    j--;
                }

                vetor[camada][j+1] = chave;

                Impressao.imprimirVetorDeVetores(vetor);

            }


        }

        insertionSortCamadas(vetor);

    }


    public static void insertionSortCamadas(int[][] vetor) {


        for (int i = 1; i < vetor.length; i++) {

            int[] chave = vetor[i];
            int j = i - 1;


            while(j>=0 && vetor[j][vetor[j].length - 1] > chave[chave.length-1]) {
                vetor[j+1] = vetor[j];
                j--;
            }

            vetor[j+1] = chave;

            for (int cont2 = 0; cont2 < vetor.length; cont2++) {
                for (int cont = 0; cont < vetor[cont2].length; cont++) {
                    System.out.print(vetor[cont2][cont] + " ");
                }
                System.out.print("   ");
            }
            System.out.println();
        }

    }


}