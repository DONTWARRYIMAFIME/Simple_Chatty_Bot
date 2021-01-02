import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        boolean possible = false;

        if (M * N >= K) {
            if ((K % N == 0) || (K % M == 0)) possible = true;
        }

        String str = possible ? "YES" : "NO";
        System.out.println(str);
    }
}