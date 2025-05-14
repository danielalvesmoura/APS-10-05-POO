package global;

public class Impressao {

    public static void imprimirVetor(int[] vetor) {
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
        System.out.println();
    }

    public static void imprimirVetorString(String[] vetor) {
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
    }

    public static void imprimirVetorDeVetores(int[][] vetor) {
        for (int cont2 = 0; cont2 < vetor.length; cont2++) {
            for (int cont = 0; cont < vetor[cont2].length; cont++) {
                System.out.print(vetor[cont2][cont] + " ");
            }
            System.out.print("   ");
        }
        System.out.println();
    }

}
