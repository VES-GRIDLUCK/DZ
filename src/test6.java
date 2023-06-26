import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 99999999; ++i)
        {
            char[] charArray = Integer.toString(1).toCharArray();
            Arrays.sort(charArray);
            for (int j = 0; j < charArray.length-2; ++j)
            {
                if (charArray[i] == charArray[i+1])
                    break;
                if (i % 12345 == 0)
                {
                    System.out.println(i);
                    ++count;
                }
            }
        }
        System.out.println(String.format("Общее количество найденных чисел", count));
    }
}
