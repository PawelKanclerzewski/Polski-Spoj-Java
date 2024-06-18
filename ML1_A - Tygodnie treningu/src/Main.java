import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dniTygodnia = scanner.nextInt();
        ArrayList<String> dni = new ArrayList<>();

        for (int i = 0; i < dniTygodnia; i++) {
            dni.add(scanner.next());
        }
        int max = dni.size();
        int pon = 0, wt = 0, sr = 0, czw = 0, pt = 0, sob = 0, niedz = 0;

        ArrayList<Integer> ile = new ArrayList<>();
        for(String k : dni) {
            switch (k) {
                case "pon":
                    pon++;
                    break;
                case "wt":
                    wt++;
                    break;
                case "sr":
                    sr++;
                    break;
                case "czw":
                    czw++;
                    break;
                case "pt":
                    pt++;
                    break;
                case "sob":
                    sob++;
                    break;
                case "niedz":
                    niedz++;
                    break;
            }
        }

        ile.add(pon);
        ile.add(wt);
        ile.add(sr);
        ile.add(czw);
        ile.add(pt);
        ile.add(sob);
        ile.add(niedz);

        int max1 = Collections.max(ile);
        System.out.println(max1 + " " + max);
    }
}