import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ile_testow = scanner.nextInt();
        int runda = 1;
        int a, b;
        int max,min;
        int ileCukierkow;

        while(runda <= ile_testow){
            runda++;
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(a >= b){
                max = a; min = b;
            } else{
                max = b; min = a;
            }

            ileCukierkow = max;

            while(ileCukierkow % min != 0 || ileCukierkow % max != 0){
                ileCukierkow++;
            }
            System.out.println(ileCukierkow);
        }
    }
}