import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        int flag = -1;
        char[] str = string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 't' && str[i + 1] == 'h' && str[i + 2] == 'e') {
                flag = i;
                break;
            }
        }
        System.out.println(flag);
    }
}