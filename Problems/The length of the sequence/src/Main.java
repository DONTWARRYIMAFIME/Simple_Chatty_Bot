import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        while (scanner.nextInt() != 0) {
            numberCount += 1;
        }

        System.out.println(numberCount);
    }
}