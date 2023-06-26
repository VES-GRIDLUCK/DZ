public class test3 {
    public static void main(String[] args) {
        int konec = 10000000;
        int temp = 0;//считаем сколько цифр
        int sum = 0;
        for (int i = 0; i < konec; i++) {
            for (int j = 1; i / j > 0; j *= 10) {
                temp++;
            }
            int cisl = i;
            for (int a = 0; a < temp; a++) {
                sum += Math.pow(cisl % 10, temp);
                cisl /= 10;

            }
            if (sum == i) {
                System.out.println(sum);

            }
            sum = 0;
            temp = 0;
        }
    }
}
