package ex2;
import global.Impressao;

public class MergeSort {


    public void decrescente(int[] vetor) {


        int tamanho = vetor.length;
        if (tamanho <= 1) return;


        int indiceMeio = tamanho/2;


        int[] vetorEsquerdo = new int[indiceMeio];
        int[] vetorDireito = new int[tamanho-indiceMeio];


        int iTotal = 0;
        int iDireito = 0;


        for (; iTotal < tamanho; iTotal++) {


            if (iTotal < indiceMeio) {
                vetorEsquerdo[iTotal] = vetor[iTotal];
            } else {
                vetorDireito[iDireito] = vetor[iTotal];
                iDireito++;
            }
        }


        decrescente(vetorEsquerdo);
        decrescente(vetorDireito);
        mergeDecrescente(vetorEsquerdo,vetorDireito,vetor);


    }

    private void mergeDecrescente(int[] vetorEsquerdo, int[] vetorDireito, int[] vetor) {


        int tamanho = vetor.length;


        int tamanhoEsquerdo = tamanho/2;
        int tamanhoDireito = tamanho - tamanhoEsquerdo;
        int iTotal = 0, iEsquerda = 0, iDireito = 0;


        while (iEsquerda < tamanhoEsquerdo && iDireito < tamanhoDireito) {
            if(vetorEsquerdo[iEsquerda] > vetorDireito[iDireito]) {
                vetor[iTotal] = vetorEsquerdo[iEsquerda];
                iTotal++;
                iEsquerda++;
            } else {
                vetor[iTotal] = vetorDireito[iDireito];
                iTotal++;
                iDireito++;
            }
            Impressao.imprimirVetor(vetor);
            System.out.println();
        }

        while(iEsquerda < tamanhoEsquerdo) {
            vetor[iTotal] = vetorEsquerdo[iEsquerda];
            iTotal++;
            iEsquerda++;
        }


        while(iDireito < tamanhoDireito) {
            vetor[iTotal] = vetorDireito[iDireito];
            iTotal++;
            iDireito++;
        }


    }


}