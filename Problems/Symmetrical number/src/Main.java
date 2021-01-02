import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        boolean symmetrical = true;

        if (number.charAt(0) != number.charAt(3)) symmetrical = false;
        if (number.charAt(1) != number.charAt(2)) symmetrical = false;

        int output = symmetrical ? 1 : 0;
        System.out.println(output);
    }
}
