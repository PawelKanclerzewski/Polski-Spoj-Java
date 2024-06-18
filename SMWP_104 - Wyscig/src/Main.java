import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczbaAtletow = scanner.nextInt();
        int czasy[] = new int[liczbaAtletow];

        for (int i = 0; i < liczbaAtletow; i++) {
            czasy[i] = scanner.nextInt();
        }
        System.out.println(findNWWForMultipleNumbers(czasy));
    }

    // Funkcja obliczająca NWW dla dwóch liczb
    private static int findNWW(int a, int b) {
        return a * b / findNWDFast(a, b);
    }

    // Funkcja obliczająca NWD dla dwóch liczb (wykorzystuje algorytm Euklidesa)
    private static int findNWDFast(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Funkcja obliczająca NWW dla dowolnej ilości liczb
    private static int findNWWForMultipleNumbers(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findNWW(result, numbers[i]);
        }
        return result;
    }
}