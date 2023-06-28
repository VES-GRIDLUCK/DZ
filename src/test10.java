import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextInt();
        float y = scanner.nextInt();
        int day=1;
        while (x<y) {
            day++;
            x *= 1.1;
        }
        System.out.println( day + " " + x);
    }
}
