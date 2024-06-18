import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ile_testow = scanner.nextInt();
        int runda = 0;

        while(runda < ile_testow){
            runda++;
            silnia(scanner.nextInt());
        }
    }

    static void silnia(int i) {
        int silnia = 1;

        if(i >= 10){
            System.out.println("0 0");
        } else{
            while(i != 0){
                silnia = silnia * i;
                --i;
            }
            System.out.println(String.valueOf(silnia/10 % 10) + " " + String.valueOf(silnia % 10) );
        }
    }
}