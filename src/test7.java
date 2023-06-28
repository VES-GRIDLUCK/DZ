import java.util.Scanner;

public class test7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Число " + number + " : ");
        while (true) {
            if (number == 0 || number == 1) {
                System.out.print(number);
                break;
            }
            System.out.print(number % 2);
            number >>= 1;
        }
    }
}


