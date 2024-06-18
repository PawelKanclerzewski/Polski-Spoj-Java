import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ileTestow = scanner.nextInt();
        scanner.reset();

        for(int i = 0; i < ileTestow; i++){
            String dzien = scanner.next();
            n = scanner.nextInt();

            //System.out.println(dzien +  " + " + n);

            coZaDzien(dzien);
        }
    }

    private static void coZaDzien(String dzien) {
        switch (dzien){
            case "Pn":
                n = n + 1;
                break;
            case "Wt":
                n = n + 2;
                break;
            case "Sr":
                n = n + 3;
                break;
            case "Cz":
                n = n + 4;
                break;
            case "Pt":
                n = n + 5;
                break;
            case "So":
                n = n + 6;
                break;
            case "Nd":
                n = n + 7;
                break;
        }
        //System.out.println(n);
        zaIleDni();
    }

    private static void zaIleDni() {
        n = n % 7;
        switch (n){
            case 1:
                System.out.println("Pn");
                break;
            case 2:
                System.out.println("Wt");
                break;
            case 3:
                System.out.println("Sr");
                break;
            case 4:
                System.out.println("Cz");
                break;
            case 5:
                System.out.println("Pt");
                break;
            case 6:
                System.out.println("So");
                break;
            case 0:
                System.out.println("Nd");
                break;
        }
    }
}