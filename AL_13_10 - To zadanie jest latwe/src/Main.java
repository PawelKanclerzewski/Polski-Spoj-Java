import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ileTestow = scanner.nextInt();
        scanner.reset();

        for(int i = 0; i < ileTestow; i++){
            String ciag = scanner.next();
            scanner.reset();
            String podciag = scanner.next();

            String[] strSplit1 = ciag.split("");
            String[] strSplit2 = podciag.split("");

            // Now convert string into ArrayList
            ArrayList<String> ciagList = new ArrayList<String>(
                    Arrays.asList(strSplit1));

            ArrayList<String> podciagList = new ArrayList<String>(
                    Arrays.asList(strSplit2));

            boolean czySieUdalo = true;

            for( String k : ciagList){
                if(Collections.frequency(podciagList, k) <= Collections.frequency(ciagList, k)){
                } else czySieUdalo = false;
            }

            if(czySieUdalo){
                System.out.println("Tak");
            } else{
                System.out.println("Nie");
            }
        }
    }
}