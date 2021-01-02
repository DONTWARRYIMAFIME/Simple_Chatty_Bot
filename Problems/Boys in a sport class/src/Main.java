import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean result = true;
        int firstBoyHeight  = scanner.nextInt();
        int secondBoyHeight = scanner.nextInt();
        int thirdBoyHeight  = scanner.nextInt();

        if (firstBoyHeight != secondBoyHeight) {
            boolean fromLeft = firstBoyHeight > secondBoyHeight;

            if (fromLeft) {
                if (secondBoyHeight < thirdBoyHeight) result = false;
            }
            else {
                if (secondBoyHeight > thirdBoyHeight) result = false;
            }
        }

        System.out.println(result);
    }
}