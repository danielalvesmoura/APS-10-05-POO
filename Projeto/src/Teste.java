public class Teste {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        Impressao impressao = new Impressao();

        int[] vetor = {6,3,7,34,6,3,7,3,6,87,6};

        insertionSort.insertionSortPadrao(vetor);

        impressao.imprimirVetor(vetor);

    }

}
