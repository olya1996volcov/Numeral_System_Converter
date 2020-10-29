package converter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            int temp__ = 1;
            int sourceRadix = scanner.nextInt();
            String sourceNumber = scanner.next();
            int targetRadix = scanner.nextInt();
            if(sourceRadix < 1 || sourceRadix > 36 || targetRadix < 1 || targetRadix >36){
                throw new ArithmeticException();
            }
            if (!sourceNumber.contains(".")) {
                int num10 = 0;
                String intSource;
                int targetNumber = 1;
                String intTarget;
                if (sourceRadix == 1) {
                    int integer10 = Integer.parseInt(sourceNumber);
                    while (integer10 > 0) {
                        num10++;
                        integer10 /= 10;
                    }
                } else {
                    num10 = Integer.parseInt(sourceNumber, sourceRadix);
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
                System.out.println(intTarget);
                return;
            }
            String[] a = sourceNumber.split("[.]");
            String intSource = a[0];

            String fraction = a[1];
            System.out.println(fraction);
            int num10 = 0;
            int targetNumber = 1;
            String intTarget;
            if (sourceRadix == 1) {
                int integer10 = Integer.parseInt(intSource);
                while (integer10 > 0) {
                    num10++;
                    integer10 /= 10;
                }
            } else {
                num10 = Integer.parseInt(intSource, sourceRadix);
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

            //System.out.println("intTarget = " + intTarget);


            char[] array = fraction.toCharArray();

            int fracLength = array.length;
            int[] arrayOfInt = new int[fracLength];
            String[] stringFrac = new String[fracLength];
            int[] intArray = new int[fracLength];
            for (int i = 0; i < fracLength; i++) {
                //System.out.print("array[i] = " + array[i] + "    ");
                String huynya = String.valueOf(array[i]);
                // stringFrac[i] += array[i];
                //arrayOfInt[i] = Character.digit(array[i], targetRadix);

                arrayOfInt[i] = Integer.parseInt(huynya, sourceRadix);
                // stringFrac[i] = Integer.toString(Integer.parseInt(array[i]), targetRadix);
                //System.out.println(arrayOfInt[i]);
            }
            double decimalFrac = 0;
            for (int i = 0; i < fracLength; i++) {
                decimalFrac += arrayOfInt[i] / Math.pow(sourceRadix, i + 1);
                //System.out.println(Math.pow(sourceRadix, i + 1));

            }
            //System.out.println(decimalFrac);
            // System.out.println(Integer.toString(num10, targetRadix));*/
            double temp = decimalFrac;
            int temp1 = 0;
            StringBuilder fr = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                temp = temp * targetRadix;
                temp1 = (int) temp;
                String temp2 = Integer.toString(temp1, targetRadix);
                //System.out.println("temp1 = " + temp1);
                fr.append(temp2);
                temp -= temp1;
            }
            //System.out.println("fr = " + fr);
            StringBuilder number = new StringBuilder();
            number.append(intTarget).append('.').append(fr);
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
