package converter;

import java.util.Locale;
import java.util.Scanner;

public class MainAndua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int sourceRadix = scanner.nextInt();
        double sourceNumber = scanner.nextDouble();
        int targetRadix = scanner.nextInt();
        String[] a = String.valueOf(sourceNumber).split("[.]");
        int intSource = Integer.parseInt(a[0]);
        int fracSource = Integer.parseInt(a[1]);
        String fraction = Integer.toString(fracSource);
        int num10 = 0;
        int targetNumber = 1;
        String intTarget;
        if (sourceRadix == 1) {
            while (intSource > 0) {
                num10++;
                intSource /= 10;
            }
        } else {
            num10 = Integer.parseInt(String.valueOf(intSource), sourceRadix);
        }
        if (targetRadix == 1) {
            while (num10 != 1) {
                targetNumber = targetNumber * 10 + 1;
                num10--;
            }
            intTarget = Integer.toString(targetNumber);
            //System.out.println(targetNumber);
        } else {
            intTarget = Integer.toString(num10, targetRadix);
        }

        char[] array = fraction.toCharArray();
        int fracLength = array.length;
        int[] intArray = new int[fracLength];
        for (int i = 0; i < fracLength; i++) {
            intArray[i] = array[i] - '0';
        }
        int decimalFrac = 0;
        for (int i = 0; i < fracLength; i++) {
            decimalFrac += intArray[i] / Math.pow(sourceRadix, i + 1);
        }
        System.out.println(decimalFrac);
        // System.out.println(Integer.toString(num10, targetRadix));*/
        double temp = decimalFrac;
        int temp1 = 0;
        StringBuilder fr = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            temp = temp * targetRadix;
            temp1 = (int) temp;
            fr.append(temp1);
            temp -= temp1;
        }
    }
}
