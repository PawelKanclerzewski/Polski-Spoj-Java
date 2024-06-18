import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nazwa_snake = scanner.next();
        char nazwa_char[] = nazwa_snake.toCharArray();

        for(int i=0; i < nazwa_char.length; i++){
            if(nazwa_char[i] == '_'){
                nazwa_char[i+1] = toUpperCase(nazwa_char[i+1]);
            } else System.out.print(nazwa_char[i]);
        }
    }
}