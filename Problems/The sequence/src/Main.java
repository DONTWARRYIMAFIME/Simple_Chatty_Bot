import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elemCount = scanner.nextInt();

        int maxDivisibleValue = 0;
        for (int i = 0; i < elemCount; i++) {
            int currentNumber = scanner.nextInt();
            if ((currentNumber % 4 == 0) && (currentNumber > maxDivisibleValue)) {
                maxDivisibleValue = currentNumber;
            }
        }

        System.out.println(maxDivisibleValue);
    }
}