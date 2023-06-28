import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

public class test6 {
    public static void main(String[] args) {
        Date date = Date.from(Instant.now());
        long timeStart = date.getTime();
        int temp = 0;
        for (int i = 1000000; i < 10000000; ++i) {
            int number = i;
            int step = 0;
            boolean isUnique = true;
            b1 : while (number > 0 && isUnique) {
                int tempCifra = number % 10;
                int stepTamp = 0;
                int numberTemp = i;
                while (numberTemp > 0 && isUnique) {
                    int tempCifra1 = numberTemp % 10;
                    if (step == stepTamp) {
                        numberTemp /= 10;
                        stepTamp++;
                        continue;
                    }
                    if (tempCifra1 == tempCifra) {
                        isUnique = false;
                        break b1;
                    }
                    numberTemp /= 10;
                    stepTamp++;
                }
                number /= 10;
                step++;
            }
            if (isUnique)
                System.out.println(i);
            temp++;
        }
        Date date2 = Date.from(Instant.now());
        long timeFinish = date2.getTime();
        System.out.println(timeFinish - timeStart);
        System.out.println(temp);

    }
}
