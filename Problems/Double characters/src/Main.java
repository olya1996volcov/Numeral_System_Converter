import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = "";
        char[] string = str1.toCharArray();
        for (int i = 0; i < string.length; i++) {
            str2 += string[i];
            str2 += string[i];
        }
        System.out.println(str2);
    }
}