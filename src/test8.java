public class test8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            int min = i % 10 * 10 + (i / 10) % 10;
            if (min <= 59) {
                System.out.println(i + ":" + min);
            }
        }
    }
}
