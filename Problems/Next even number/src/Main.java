import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        inputNumber = inputNumber % 2 == 0 ? inputNumber + 2 : inputNumber + 1;
        System.out.println(inputNumber);
    }
}