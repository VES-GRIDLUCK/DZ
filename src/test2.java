public class test2 {
    public static void main(String[] args) {
        for (int i = 2; i < 10000000; i++) {
            boolean find = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    find = true;
                }
                System.out.println(i + " ");
            }
        }
    }
}
