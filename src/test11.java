public class test11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println(i + " hiss");
                } else {
                    System.out.println(i + " fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
