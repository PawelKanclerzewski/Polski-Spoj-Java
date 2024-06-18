import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        String napis = scanner.next();
        int ilePrzejsc = liczba / 2 +1;

        for(int i = 0; i < liczba/2 + 1; i++){
            int miejsce = 0;
            for(int j = 1; j < ilePrzejsc - i; j++){
                System.out.print(".");
                miejsce = j;
            }

            for(int k = 0; k < (i + 1) * 2 - 1; k++){
                System.out.print(napis.charAt(miejsce));
                miejsce++;
            }

            for(int j = 1; j < ilePrzejsc - i; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}