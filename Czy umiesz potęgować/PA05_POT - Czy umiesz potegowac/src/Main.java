import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ile_testow = scanner.nextInt();
        int a, b, x, runda = 0;

            while(runda < ile_testow){

                runda++;
                a = scanner.nextInt() % 10;
                b = scanner.nextInt();

                switch (a){
                    case 0:
                        b = 1;
                        break;
                    case 1:
                        b = 1;
                        break;
                    case 2:
                        b = b % 4;
                        break;
                    case 3:
                        b = b % 4;
                        break;
                    case 4:
                        b = b % 2;
                        break;
                    case 5:
                        b = 1;
                        break;
                    case 6:
                        b = 1;
                        break;
                    case 7:
                        b = b % 4;
                        break;
                    case 8:
                        b = b % 4;
                        break;
                    case 9:
                        b = b % 2;
                        break;
                }
                x = (int) pow(a, b);
                System.out.println(x % 10);
        }
    }
}