public class test1 {
    public static void main(String[] args) {
     /*   int[] arr = new int[10000000];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }*/
        int n = 10000000;
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            if (sum > n)
                return;
        }

    }
}
