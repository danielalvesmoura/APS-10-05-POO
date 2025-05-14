package ex8;


import global.Util;

public class Vetor {

    Util util = new Util();

    int[] vetor;
    int bubbleIteracoes;
    int insertionIteracoes;
    int selectionIteracoes;
    int mergeIteracoes;

    public Vetor(int tipo, int tamanho) {
        vetor = new int[tamanho];

        if(tipo == 1) {
            setVetor(geraVetorOrdenado(tamanho));
        } else if (tipo == 2) {
            setVetor(geraVetorInvertido(tamanho));
        } else if (tipo == 3) {
            setVetor(geraVetorAleatorio(tamanho));
        }
    }

    private int[] geraVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }

        return vetor;
    }

    private int[] geraVetorInvertido(int tamanho) {
        int[] vetor = new int[tamanho];

        int cont = 0;
        for (int i = tamanho-1; i >= 0; i--) {
            vetor[cont] = i;
            cont++;
        }

        return vetor;
    }

    private int[] geraVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = util.geraInteiro(0, 100);
        }

        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
}
