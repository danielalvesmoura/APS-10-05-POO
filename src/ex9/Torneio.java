package ex9;

import ex8.Ordenacao.BubbleSort;
import ex8.Ordenacao.InsertionSort;
import ex8.Ordenacao.MergeSort;
import ex8.Ordenacao.SelectionSort;

import java.util.Arrays;

import java.util.Scanner;

public class  Torneio {

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
            vetores[i].tempos[0] = testaBubble(vetores[i].vetor, i);
            vetores[i].tempos[1] = testaInsertion(vetores[i].vetor, i);
            vetores[i].tempos[2] = testaMerge(vetores[i].vetor, i);
            vetores[i].tempos[3] = testaSelection(vetores[i].vetor, i);
        }
    }

    public long testaBubble(int[] vetor, int i) {
        long inicio = System.nanoTime();
        vetores[i].trocas = bubbleSort.padrao(vetor);
        long fim = System.nanoTime();
        return fim - inicio;
    }

    public long testaInsertion(int[] vetor, int i) {
        long inicio = System.nanoTime();
        insertionSort.padrao(vetor);
        long fim = System.nanoTime();
        return fim - inicio;
    }

    public long testaMerge(int[] vetor, int i) {
        long inicio = System.nanoTime();
        mergeSort.padrao(vetor);
        long fim = System.nanoTime();
        return fim - inicio;
    }

    public long testaSelection(int[] vetor, int i) {
        long inicio = System.nanoTime();
        selectionSort.padrao(vetor);
        long fim = System.nanoTime();
        return fim - inicio;
    }



}
