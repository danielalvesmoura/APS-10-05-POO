package ex8;
import java.util.Scanner;

import global.Util;
import global.Impressao;

public class Main {
    Util util = new Util();


    public static void main(String[] args) {
        Main main = new Main();

        Torneio torneio1 = main.geraTorneio();

        torneio1.iniciaTorneio();

        for (int i = 0; i < torneio1.vetores.length; i++) {
            System.out.printf("\nVetor %d: ",i);
            Impressao.imprimirVetor(torneio1.vetores[i].vetor);
            System.out.println();
            System.out.printf("Bubble: %d trocas.\n",torneio1.vetores[i].bubbleIteracoes);
            System.out.printf("Insertion: %d trocas.\n",torneio1.vetores[i].insertionIteracoes);
            System.out.printf("Selection: %d trocas.\n",torneio1.vetores[i].selectionIteracoes);
            System.out.printf("Merge: %d trocas.\n",torneio1.vetores[i].mergeIteracoes);

        }

    }

    public Torneio geraTorneio() {
        System.out.println("Quantidade de vetores?");
        Scanner scanner = new Scanner(System.in);
        int qntd = scanner.nextInt();

        return new Torneio(qntd);
    }

}
