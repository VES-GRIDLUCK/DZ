public class test2 {
    public static void main(String[] args) {
        int n = 1000;
        metka:
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue metka;
                }
                System.out.println(i);
            }
        }
    }
}
