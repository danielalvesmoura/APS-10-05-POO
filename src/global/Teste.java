package global;


import ex3.BubbleSort;
import ex3.InsertionSort;
import ex3.MergeSort;
import ex3.SelectionSort;

public class Teste {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        int[] vetorInt = {6,3,7,34,6,3,7,3,6,87,6};
        String[] vetorString = {"zoom","yacht","walter","boatarde"};

        bubbleSort.string(vetorString);
    }

}
