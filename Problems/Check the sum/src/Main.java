import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number;
        number = new int[3];

        for (int i = 0; i < 3; i++) {
            number[i] = scanner.nextInt();
        }

        boolean result = false;

        if (number[0] + number[1] == 20) result = true;
        if (number[0] + number[2] == 20) result = true;
        if (number[1] + number[2] == 20) result = true;

        System.out.println(result);

    }
}