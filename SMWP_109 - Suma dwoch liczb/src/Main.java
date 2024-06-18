import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ileTestow = scanner.nextInt();

        for(int i = 0; i < ileTestow; i++){
            String system = scanner.next();
            String a = scanner.next();
            String b = scanner.next();

            switch (system){
                case "2":
                    dwojkowy(a, b);
                    break;
                case "10":
                    dzisiatkowy(a,b);
                    break;
                case "16":
                    szesnastkowy(a,b);
                    break;
            }
        }
    }

    private static void szesnastkowy(String a, String b) {
    }

    private static void dzisiatkowy(String a, String b) {

        long  x = Integer.parseInt(a);
        long  y = Integer.parseInt(b);
        System.out.println(x + y);
    }

    private static void dwojkowy(String a, String b) {
        int dlugoscX = a.length();
        int dlugoscY = b.length();
        long  x = Integer.parseInt(a);
        long  y = Integer.parseInt(b);

        long x1, x2;

    }
}