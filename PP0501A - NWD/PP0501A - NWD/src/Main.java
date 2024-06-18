import java.util.Scanner;

public class Main {
    public static int temp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ile_testow = scanner.nextInt();
        int a,b;

        for(int i = 1; i <= ile_testow; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(nwd(a, b));
        }
    }
    public static int nwd(int a, int b){
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}