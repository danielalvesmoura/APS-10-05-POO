package global;


import ex5_2.*;
import ex6.Torneio;

public class Teste {

    public static void main(String[] args) {

        int[] vetorInt = {6,3,7,34,6,3,7,3,6,87,6};
        int[][] vetorMatriz = {{4,6,8,2,7,4,5}, {65,78,4152,1645,456,78,123,45}, {51561,594984,3212631,654564,489498}};
        String[] vetorString = {"zoom","yacht","walter","boatarde"};

        Torneio torneio = new Torneio();

        int[] partidas = torneio.geraVetor();

        System.out.println(torneio.maisAlta(partidas));
    }

}
