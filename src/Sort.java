public class Sort {
    public static int[] mergeArray (int[] a, int[] b) {

        if (a.length == 0) return b;
        else if (b.length == 0) return a;

        int [] sorted = new int[a.length + b.length];
        int count = 0;
        int i = 0;
        int j = 0;
        boolean firstBigger = false;

        if (true) {
            while (j < b.length && i < a.length) {
                if (a[i] < b[j]) {
                    sorted[count] = a[i];
                    count++;
                    i++;
                    firstBigger = false;
                } else {
                    sorted[count] = b[j];
                    count++;
                    j++;
                    firstBigger = true;
                }
            }
            if (firstBigger) {
                for (int k = i; k < a.length; k++) {
                    sorted[count] = a[k];
                    count++;
                }
            } else if (!firstBigger) {
                for (int k = j; k < b.length; k++) {
                    sorted[count] = b[k];
                    count++;
                }
            }
        }
        return sorted;
    }
}