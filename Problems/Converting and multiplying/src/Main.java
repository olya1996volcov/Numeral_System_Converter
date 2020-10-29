import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder("");
        while (true) {
            try {
                String str = scanner.nextLine();
                str1.append(str);
                int num = Integer.parseInt(str);
                str1.delete(0, str.length());
                if (num == 0) {
                    break;
                } else {
                    System.out.println(num * 10);
                }

            } catch (Exception e) {
                System.out.println("Invalid user input: " + str1);
            }
        }
    }
}