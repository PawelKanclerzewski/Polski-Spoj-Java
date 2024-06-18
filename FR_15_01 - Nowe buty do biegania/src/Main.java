import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        double mile = km / 1.609344;
        //System.out.println(mile);

        if(mile < 300) {
            System.out.println("NIE");
        } else if(mile >= 300 && mile < 500) {
            System.out.println("SPRAWDZIMY TWOJE OBECNE BUTY");
        } else System.out.println("TAK");
    }
}