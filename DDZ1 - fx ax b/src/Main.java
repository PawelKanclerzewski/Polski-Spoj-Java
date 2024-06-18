import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String pierwszy = "";
        String drugi = "";
        if(a != 0) {
            pierwszy = "f(x)=" + a + "x";
        } else pierwszy = "f(x)=";

        if(b != 0){
            if(b > 0) {
                drugi = "+" + b;
            } else drugi = String.valueOf(b);
        }

        if(a == 0 && b == 0) {
            drugi = "0";
        }

        if(a == 1) {
            pierwszy = "f(x)=" + "x";
        }

        if(a == -1) {
            pierwszy = "f(x)=" + "-x";
        }
        System.out.println(pierwszy + drugi);
    }
}