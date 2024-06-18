import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();
        
        for(int i = 0; i < ileZestawow; i++) {
            String pierwszy = scanner.next();
            String drugi = scanner.next();
            
            string_merge(pierwszy, drugi);
        }
        scanner.close();
    }
    private static void string_merge(String pierwszy, String drugi) {
        int dlugosc = sprawdzDlugosc(pierwszy, drugi);
        StringBuilder nowyString = new StringBuilder();

        char[] p = pierwszy.toCharArray();
        char[] d = drugi.toCharArray();

        for(int i = 0; i < dlugosc; i++) {
            nowyString.append(p[i]).append(d[i]);
        }
        System.out.println(nowyString);
    }
    private static int sprawdzDlugosc(String pierwszy, String drugi) {
        return Math.min(pierwszy.length(), drugi.length());
    }
}