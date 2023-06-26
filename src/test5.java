import java.io.Console;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in)
        int len = scanner.nextInt();

        if (len == 5)
        {
            if ([0] == number[4] && number[1] == number[3])
            {
                System.out.println("{number} - Палиндром");
            }
            else
            {
                System.out.println("{number} - НЕ палиндром");
            }
        }
        else
        {
            System.out.println("ОШИБКА: {number} - не является пятизначным");
        }
    }
}
