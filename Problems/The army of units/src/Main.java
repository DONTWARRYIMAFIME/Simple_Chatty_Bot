import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitsCount = scanner.nextInt();

        if (unitsCount < 1) {
            System.out.println("no army");
        } else if (unitsCount < 20) {
            System.out.println("pack");
        } else if (unitsCount < 250) {
            System.out.println("throng");
        } else if (unitsCount < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}