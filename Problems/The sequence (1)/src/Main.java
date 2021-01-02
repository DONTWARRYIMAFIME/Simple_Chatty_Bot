import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();

        int currentNumber = 1;

        boolean exit = false;
        while (!exit) {

            for (int i = 0; i < currentNumber; i++) {
                System.out.print(currentNumber + " ");

                numberCount -= 1;

                if (numberCount == 0) {

                    exit = true;
                    break;
                }
            }
            currentNumber += 1;

        }
    }
}