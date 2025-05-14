package global;

import java.util.Random;

public class Util {

    Random random = new Random();

    public int geraInteiro(int minimo, int maximo) {
        return random.nextInt(maximo - minimo) + minimo;
    }
}
