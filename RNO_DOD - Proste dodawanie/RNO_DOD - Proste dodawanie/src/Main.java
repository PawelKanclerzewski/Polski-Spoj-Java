import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ile_testow = scanner.nextInt();
        int ile_liczb;
        int runda = 1;
        int suma;

        while(runda <= ile_testow){
            runda++;
            suma = 0;
            ile_liczb = scanner.nextInt();

            int tab[] = new int[ile_liczb];

            for(int i = 0; i < ile_liczb; i++){
                tab[i] = scanner.nextInt();
                suma += tab[i];
            }

            System.out.println(suma);
        }
    }
}