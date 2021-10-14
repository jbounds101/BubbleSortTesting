public class Main {

    public static void main(String[] args) {
	    int[] unsorted = {9, 1, 4, 10, 11, 2, 6, 15, 100, 3};
	    mixUpSort(unsorted);
    }

    public static int[] mixUpSort(int[] A) {
        int n = A.length;
        boolean repeat = true;

        while(repeat) {
            repeat = false;

            for (int i = 0; i < n - 1; i++) {
                if (A[i] > A[i+1]) {
                    // Swap
                    int placeholder = A[i];
                    A[i] = A[i+1];
                    A[i+1] = placeholder;
                    repeat = true;
                }
            }
            for (int i = n - 2; i >= 0; i--) {
                if (A[i] > A[i+1]) {
                    // Swap
                    int placeholder = A[i];
                    A[i] = A[i+1];
                    A[i+1] = placeholder;
                    repeat = true;
                }
            }

        }
       return A;
    }
}
