package ex9;
import java.util.Scanner;

import global.Util;
import global.Impressao;

public class Main {
    Util util = new Util();


    public static void main(String[] args) {
        Main main = new Main();

        int[] vetorInt = {6,3,7,34,6,3,7,3,6,87,6};

        Torneio torneio1 = main.geraTorneio();

        torneio1.iniciaTorneio();

        for (int i = 0; i < torneio1.vetores.length; i++) {
            System.out.printf("\nVetor %d: ",i);
            Impressao.imprimirVetor(torneio1.vetores[i].vetor);
            System.out.printf("Bubble: %d nanossegundos\n",torneio1.vetores[i].tempos[0]);
            System.out.printf("Insertion: %d nanossegundos\n",torneio1.vetores[i].tempos[1]);
            System.out.printf("Selection: %d nanossegundos\n",torneio1.vetores[i].tempos[2]);
            System.out.printf("Merge: %d nanossegundos\n",torneio1.vetores[i].tempos[3]);
        }

    }


    public Torneio geraTorneio() {
        System.out.println("Quantidade de vetores?");
        Scanner scanner = new Scanner(System.in);
        int qntd = scanner.nextInt();

        return new Torneio(qntd);
    }

}
