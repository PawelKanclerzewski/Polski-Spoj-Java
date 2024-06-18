import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int xo = scanner.nextInt();
    public static int yo = scanner.nextInt();
    public static int r = scanner.nextInt();
    
    public static void main(String[] args) {
        int ileTestow = scanner.nextInt();

        for(int i = 0; i < ileTestow; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            czyWOkregu(x,y);
        }
    }

    private static void czyWOkregu(int x, int y) {
        double AB = Math.sqrt(Math.pow(xo - x, 2) + Math.pow(yo - y, 2));
        if(AB > r){
            System.out.println("O");
        } else if (AB == r) {
            System.out.println("E");
        } else if (AB < r) {
            System.out.println("I");
        }
    }
}