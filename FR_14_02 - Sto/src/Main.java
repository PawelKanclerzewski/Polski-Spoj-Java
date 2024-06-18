import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.next();
        boolean czyZnalazlem = false;

        for(int i = 0; i < slowo.length() - 2; i++) {
            if(slowo.charAt(i) == 's' && slowo.charAt(i +1) == 't' && slowo.charAt(i + 2) == 'o') {
                czyZnalazlem = true;
            }
        }
        if(czyZnalazlem) {
            System.out.println("TAK");
        } else System.out.println("NIE");
    }
}