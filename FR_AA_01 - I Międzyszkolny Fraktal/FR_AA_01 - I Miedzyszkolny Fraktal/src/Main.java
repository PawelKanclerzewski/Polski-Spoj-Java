import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wszyscy = 0, zdalni = 0, stacjonarni = 0;

        for(int i = 1; i <= 4; i++){
            wszyscy = scanner.nextInt();
            zdalni = scanner.nextInt();
            stacjonarni  = stacjonarni + wszyscy - zdalni;
            wszyscy = 0;
            zdalni = 0;
        }
        System.out.println(stacjonarni);
    }
}