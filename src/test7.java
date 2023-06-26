public class test7 {

    public static void main(String[] args) {
        int number = 16;
        System.out.print("The Number " + number + " in bit presentation: ");
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


