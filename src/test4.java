public class test4 {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
                if (i == sum) {
                    System.out.println(sum);
                }
            }
        }

    }
}

