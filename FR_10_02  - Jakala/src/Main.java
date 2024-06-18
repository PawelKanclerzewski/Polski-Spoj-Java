import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileLiter = scanner.nextInt();
        ArrayList<String> litery = new ArrayList<>();

        for(int i = 0; i < ileLiter; i++){
            litery.add(scanner.next());
        }
        String slowo = scanner.next();
        String[] slowoSplit = slowo.split("");
        ArrayList<String> slowoList = new ArrayList<String>(
                Arrays.asList(slowoSplit));

        for(String k: slowoList){
            if(litery.contains(k)){
                System.out.print(k + k);
            } else System.out.print(k);
        }
    }
}