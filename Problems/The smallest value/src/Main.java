import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        int previewNumber = 2;
        long fact = 2;

        while (fact <= number) {
            previewNumber += 1;
            fact *= previewNumber;
        }

        System.out.println(previewNumber);

    }

}