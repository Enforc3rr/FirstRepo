public class facebook {
    public static void main(String[] args) {
        int t;
        int [] a = {-8 , 5 , -1 , 7};
        int n = a.length;
        int b[] = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            k = a[i] * a[i];
            b[i] = k;
        }
        for (int j = 0; j < n; j++) {
            for (int p = j + 1; p < n; p++) {
                if (b[j] > b[p]) {
                    t = b[j];
                    b[j] = b[p];
                    b[p] = t;
                }
            }
        }
            for (int l = 0; l < n; l++)
            {
                System.out.print(b[l] + " ");
            }


    }
}
