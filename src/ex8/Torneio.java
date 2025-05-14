package ex8;

import ex8.Ordenacao.BubbleSort;
import ex8.Ordenacao.InsertionSort;
import ex8.Ordenacao.MergeSort;
import ex8.Ordenacao.SelectionSort;

import java.util.Scanner;

public class Torneio {

    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    MergeSort mergeSort = new MergeSort();
    InsertionSort insertionSort = new InsertionSort();

    Vetor[] vetores;

    public Torneio(int qntdVetores) {
        int tipoVetor;
        int tamanhoVetor;
        vetores = new Vetor[qntdVetores];

        for (int i = 0; i < qntdVetores; i++) {
            System.out.printf("Vetor %d:\n", i+1);
            System.out.println("Tipo: [1] ordenado, [2] invertido ou [3] aleatório?");
            Scanner scanner = new Scanner(System.in);
            tipoVetor = scanner.nextInt();

            System.out.println("Tamanho?");
            scanner = new Scanner(System.in);
            tamanhoVetor = scanner.nextInt();


            vetores[i] = new Vetor(tipoVetor,tamanhoVetor);
        }
    }

    public void iniciaTorneio() {
        for(int i = 0; i < vetores.length; i++) {
            vetores[i].bubbleIteracoes = bubbleSort.padrao(vetores[i].vetor);
            vetores[i].insertionIteracoes = insertionSort.padrao(vetores[i].vetor);
            vetores[i].mergeIteracoes = mergeSort.padrao(vetores[i].vetor);
            vetores[i].selectionIteracoes = selectionSort.padrao(vetores[i].vetor);
        }
    }

}
