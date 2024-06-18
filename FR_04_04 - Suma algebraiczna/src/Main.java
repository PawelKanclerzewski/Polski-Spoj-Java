import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileTestow = scanner.nextInt();
        scanner.reset();

        for(int i = 0; i < ileTestow; i++){
            String rownanie = scanner.next();

            ArrayList<String> rownanieList = new ArrayList<>();
            ArrayList<String> rownanieList2 = new ArrayList<>();
            char pies[] = rownanie.toCharArray();

            for(int j = 0; j< rownanie.length(); j++) {
                String x = String.valueOf(pies[j]);
                rownanieList.add(x);
                rownanieList2.add(x);
            }
            zmienNawiasy(rownanieList, rownanieList2);

            for(String k : rownanieList2) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    private static void zmienNawiasy(ArrayList<String> rownanie, ArrayList<String> rownanie2) {
        int k = 0;

        if(!rownanie.contains("|")) {
            return;
        }

        while (true) {
            if (Objects.equals(rownanie.get(k), "|")) {
                rownanie2.set(k, "(");
                k++;
                break;
            } else {
                k++;
            }
        }

        for (int i = k; i < rownanie.size(); i++) {
            if (Objects.equals(rownanie.get(i), "|")) {

                if(Objects.equals(rownanie.get(i - 1), rownanie.get(i))) {
                    rownanie2.set(i, rownanie2.get(i-1));
                    continue;
                }
                if(Objects.equals(rownanie.get(i-1), "-" )|| Objects.equals(rownanie.get(i - 1), "+")) {
                    rownanie2.set(i, "(");
                    continue;
                }

                if(!(Objects.equals(rownanie.get(i-1), "-") && !(Objects.equals(rownanie.get(i-1), "+")))) {
                    rownanie2.set(i, ")");
                }
            }
        }
    }
}