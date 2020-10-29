import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        if (n < str.length()) {
            String str1 = str.substring(0, n);
            String str2 = str.substring(n);
            System.out.println(str2 + str1);
        } else {
            System.out.println(str);
        }
    }
}