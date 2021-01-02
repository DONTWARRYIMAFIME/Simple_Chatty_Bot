import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean result = false;
        if (str.length() > 4) {
            result = str.endsWith("burg");
        }

        System.out.println(result);
    }
}