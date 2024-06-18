import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        if(czyUbije(s1, s2)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

        scanner.close();
    }

    private static boolean czyUbije(String s1, String s2) {
        boolean pies = false;
        char A, AA, B, BB;

        char s1K = s1.toCharArray()[0];
        char s1W = s1.toCharArray()[1];

        char s2K = s2.toCharArray()[0];
        char s2W = s2.toCharArray()[1];

        if(s1K + 2 == s2K && s1W + 1 ==s2W) return true;
        if(s1K + 2 == s2K && s1W -1 ==s2W) return true;
        if(s1K - 2 == s2K && s1W + 1 ==s2W) return true;
        if(s1K - 2 == s2K && s1W - 1 ==s2W) return true;

        if(s1K + 1 == s2K && s1W + 2 ==s2W) return true;
        if(s1K + 1 == s2K && s1W - 2 ==s2W) return true;
        if(s1K - 1 == s2K && s1W + 2 ==s2W) return true;
        return s1K - 1 == s2K && s1W - 2 == s2W;

    }
}