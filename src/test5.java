import java.io.Console;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = String.valueOf(scanner).length();
        int first = scanner.nextInt();
        int second = 0;
        for (int i = 0; i < num / 2; i++){
            second = second * 10 + first % 10;
            first /= 10;
        }
        if(first == second){
            System.out.println("Палидром");
        }
        else {
            System.out.println("Неполидром");
        }
    }
}
