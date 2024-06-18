import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int data = 0;
        String tekst = scanner.next();

        for(int i = 0; i < tekst.length(); i++) {
            data += znajdzLiczbe(tekst.charAt(i));
        }
        System.out.print(data);
    }

    private static int znajdzLiczbe(char c) {
        if(c <= 106) {
            return c - 96;
        } else if(c <= 116) {
            return (c - 106) * 10;
        } else {
            switch (c) {
                case 'v':
                    return 200;
                case 'x':
                    return 300;
                case 'y':
                    return 400;
                case 'z':
                    return 500;
                default:
                    return 0;
            }
        }
    }
}