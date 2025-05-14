package ex4;
import global.Impressao;

public class MergeSort {

    public void padrao(int[] vetor, int n) {
        if (n <= 1) return;

        int meio = n / 2;

        int[] vetorEsquerdo = new int[meio];
        int[] vetorDireito = new int[n - meio];

        for (int i = 0; i < meio; i++) {
            vetorEsquerdo[i] = vetor[i];
        }
        for (int i = meio; i < n; i++) {
            vetorDireito[i - meio] = vetor[i];
        }

        padrao(vetorEsquerdo, vetorEsquerdo.length);
        padrao(vetorDireito, vetorDireito.length);

        mergePadrao(vetorEsquerdo, vetorDireito, vetor, n);
    }

    private void mergePadrao(int[] vetorEsquerdo, int[] vetorDireito, int[] vetor, int n) {
        int iEsquerda = 0, iDireito = 0, iTotal = 0;
        int tamanhoEsquerdo = vetorEsquerdo.length;
        int tamanhoDireito = vetorDireito.length;

        while (iEsquerda < tamanhoEsquerdo && iDireito < tamanhoDireito && iTotal < n) {
            if (vetorEsquerdo[iEsquerda] < vetorDireito[iDireito]) {
                vetor[iTotal++] = vetorEsquerdo[iEsquerda++];
            } else {
                vetor[iTotal++] = vetorDireito[iDireito++];
            }

            Impressao.imprimirVetor(vetor);
            System.out.println();
        }

        while (iEsquerda < tamanhoEsquerdo && iTotal < n) {
            vetor[iTotal++] = vetorEsquerdo[iEsquerda++];
        }

        while (iDireito < tamanhoDireito && iTotal < n) {
            vetor[iTotal++] = vetorDireito[iDireito++];
        }
    }
}