import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileJajek = scanner.nextInt();
        int hurtownia = 0, wolnyRynek = 0;

        if(ileJajek >= 1000) {
            hurtownia = (int) (1000 * 0.5);
            wolnyRynek = ileJajek - 1000;
            System.out.println(hurtownia + wolnyRynek);

        } else {
            int przedzial = ileJajek / 100;
            double cena = 0.5 - ((10 - przedzial) * 0.05);
            System.out.println(ileJajek * cena);
        }
    }
}