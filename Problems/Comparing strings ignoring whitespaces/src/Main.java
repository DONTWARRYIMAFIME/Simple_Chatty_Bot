import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        firstString = firstString.replace(" ", "");
        secondString = secondString.replace(" ", "");

        System.out.println(firstString.equals(secondString));

    }
}