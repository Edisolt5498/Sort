import java.io.FileNotFoundException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] first = {3, 20, 21, 200, 300, 400, 500};
        int[] second = {2, 5, 7, 9, 12, 13, 500, 700, 90000};

        System.out.println(Arrays.toString(Sort.mergeArray(first, second)));
    }
}



