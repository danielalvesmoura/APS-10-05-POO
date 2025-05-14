package ex6;
import java.util.Scanner;

public class Torneio {
    Scanner scanner = new Scanner(System.in);

    public int[] geraVetor() {

        System.out.println("Quantas partidas?\n");
        int qntdPartidas = scanner.nextInt();

        int[] partidas = new int[qntdPartidas];


        for (int i = 0; i < partidas.length; i++) {
            System.out.printf("Pontuação %d: ", i+1);
            partidas[i] = scanner.nextInt();
        }

        return partidas;
    }


    public int maisAlta(int[] vetor) {

        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;

    }

}
