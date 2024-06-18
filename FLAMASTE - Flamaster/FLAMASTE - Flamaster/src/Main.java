import java.util.Scanner;

import static java.lang.Math.pow;
import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ile_testow = scanner.nextInt();
        int runda = 0;
        int ile_liter = 1;
        String tekst;

        while(runda <= ile_testow){

            runda++;
            tekst = scanner.next();
            char [] chars = tekst.toCharArray();

            for(int i = 0; i < chars.length - 1; i++){
                ile_liter = 1;
                while(chars[i] == chars[i + 1]){
                    ile_liter++;
                    i++;
                }
                i = i + ile_liter - 1;
                if(ile_liter != 1){
                    System.out.print(ile_liter + chars[i]);
                } else System.out.print(chars[i]);
            }

        }
    }
}