package algorithm;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static int[] randomInts(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        return ints;
    }
}
