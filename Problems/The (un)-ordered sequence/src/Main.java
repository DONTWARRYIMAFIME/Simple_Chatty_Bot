import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();


        int secondNumber = scanner.nextInt();
        while (secondNumber == firstNumber) {
            secondNumber = scanner.nextInt();
        }

        boolean dir = secondNumber < firstNumber;

        boolean result = true;
        boolean exit = false;

        int prevNumber = secondNumber;

        if (firstNumber != 0 && secondNumber != 0) {
            while (!exit) {
                int currNumber = scanner.nextInt();

                if (currNumber != 0){
                    if (dir) {
                        if (prevNumber < currNumber) {
                            result = false;
                            exit = true;
                        }
                    } else {
                        if (prevNumber > currNumber) {
                            result = false;
                            exit = true;
                        }
                    }

                    prevNumber = currNumber;

                } else {
                    exit = true;
                }
            }
        }

        System.out.println(result);

    }
}