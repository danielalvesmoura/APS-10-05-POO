package ex5;

public class BubbleSort {
    public void padrao(int[][] vetor) {

        for (int camada = 0; camada < vetor.length; camada++) {
            for (int ciclo = 0; ciclo < vetor[camada].length-1; ciclo++) {
                for (int i = 0; i < vetor[camada].length-1; i++) {
                    if (vetor[camada][i] > vetor[camada][i+1]) {


                        int aux = vetor[camada][i];
                        vetor[camada][i] = vetor[camada][i+1];
                        vetor[camada][i+1] = aux;


                    }
                }
            }
        }

        ordenaCamadas(vetor);
    }

    public void ordenaCamadas(int[][] vetor) {
        for(int i = 0; i < vetor.length-1; i++) {
            if(vetor[i][vetor[i].length-1] > vetor[i+1][0]) {
                int[] aux = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = aux;
            }
        }
        for (int cont2 = 0; cont2 < vetor.length; cont2++) {
            for (int cont = 0; cont < vetor[cont2].length; cont++) {
                System.out.print(vetor[cont2][cont] + " ");
            }
            System.out.print("   ");
        }
        System.out.println();
    }

}

