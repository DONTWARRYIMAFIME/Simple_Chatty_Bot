import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr;
        strArr = new String[8];
        for (int i = 0; i < 8; i++) {
            strArr[i] = scanner.next();
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(strArr[7 - i]);
        }
    }
}
