import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int outputNumber = 0;

        for (int i = 0; i < 3; i++) {
            int power = (int) Math.round(Math.pow(10, 2 - i));
            int tempNumber = 0;
            tempNumber += inputNumber / power;
            inputNumber -= tempNumber * power;

            outputNumber += tempNumber * Math.pow(10, i);
        }

        System.out.println(outputNumber);

    }
}
