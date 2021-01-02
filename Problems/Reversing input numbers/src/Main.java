import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] numberArr;
        numberArr = new int[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            numberArr[i] = scanner.nextInt();
        }

        for (int i = 2; i > 0; i--) {
            System.out.print(numberArr[i - 1] + " ");
        }
    }
}
