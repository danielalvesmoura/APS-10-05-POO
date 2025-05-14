package ex5;
import global.Impressao;

public class MergeSort {

    public void padrao(int[][] vetor) {
        MergeSort mergeSort = new MergeSort();

        int tamanho = vetor.length;
        if (tamanho <= 1) return;

        int indiceMeio = tamanho / 2;

        int[][] vetorEsquerdo = new int[indiceMeio][];
        int[][] vetorDireito = new int[tamanho - indiceMeio][];

        for (int i = 0; i < indiceMeio; i++) {
            vetorEsquerdo[i] = vetor[i];
        }

        for (int i = indiceMeio; i < tamanho; i++) {
            vetorDireito[i - indiceMeio] = vetor[i];
        }

        padrao(vetorEsquerdo);
        padrao(vetorDireito);
        mergeSort.mergePadrao(vetorEsquerdo, vetorDireito, vetor);
        ordenaCamadas(vetor);
    }

    private void mergePadrao(int[][] vetorEsquerdo, int[][] vetorDireito, int[][] vetor) {
        int iEsquerda = 0, iDireito = 0, iTotal = 0;

        while (iEsquerda < vetorEsquerdo.length && iDireito < vetorDireito.length) {
            if (vetorEsquerdo[iEsquerda][0] < vetorDireito[iDireito][0]) {
                vetor[iTotal++] = vetorEsquerdo[iEsquerda++];
            } else {
                vetor[iTotal++] = vetorDireito[iDireito++];
            }

        }

        while (iEsquerda < vetorEsquerdo.length) {
            vetor[iTotal++] = vetorEsquerdo[iEsquerda++];
        }

        while (iDireito < vetorDireito.length) {
            vetor[iTotal++] = vetorDireito[iDireito++];
        }
    }

    public void ordenaCamadas(int[][] vetor) {
        for(int i = 0; i < vetor.length-1; i++) {
            if(vetor[i][vetor[i].length-1] > vetor[i+1][0]) {
                int[] aux = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = aux;
            }
        }
        for (int cont2 = 0; cont2 < vetor.length; cont2++) {
            for (int cont = 0; cont < vetor[cont2].length; cont++) {
                System.out.print(vetor[cont2][cont] + " ");
            }
            System.out.print("   ");
        }
        System.out.println();
    }
}


