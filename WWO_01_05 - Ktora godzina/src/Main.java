import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String godzina[] = new String[5];
        godzina[2] = ":";

        for(int i = 0; i < 5; i++){
            if(i != 2){
                godzina[i] = String.valueOf(zmienNaDziesietny(scanner.nextInt()));
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.print(godzina[i]);
        }
    }

    private static int zmienNaDziesietny(int i) {
        return (i / 100000) * 32 + ((i / 10000) % 10) * 16 + ((i / 1000) % 10) * 8 + ((i / 100) % 10) * 4 + ((i / 10) % 10) * 2 + (i % 10);
    }
}