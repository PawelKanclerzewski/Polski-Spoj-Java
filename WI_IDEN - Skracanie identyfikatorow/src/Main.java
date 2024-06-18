import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDlugoscSlowa = scanner.nextInt();
        String slowo = scanner.next();
        System.out.println(zmienSlowo(slowo, maxDlugoscSlowa));

    }

    private static String zmienSlowo(String slowo, int maxDlugoscSlowa) {
        String coUsunac = "znaki";

        slowo = usun(slowo, maxDlugoscSlowa, coUsunac);

        if(maxDlugoscSlowa < slowo.length()) {
            coUsunac = "cyfry";
            slowo = usun(slowo, maxDlugoscSlowa, coUsunac);
            if(maxDlugoscSlowa < slowo.length()) {
                coUsunac = "samogloski";
                slowo = usunSamogloske(slowo, maxDlugoscSlowa, coUsunac);
                if(maxDlugoscSlowa < slowo.length()) {
                    coUsunac = "reszta";
                    slowo = usun(slowo, maxDlugoscSlowa, coUsunac);
                }
            }
        }
        return slowo;
    }

    private static String usunSamogloske(String slowo, int maxDlugoscSlowa, String coUsunac) {
        ArrayList<Character> tab = new ArrayList<>();
        for(int k = 0; k < slowo.length(); k++) {
            tab.add(slowo.charAt(k));
        }

        boolean czyPierwsza = true;
        int index = 0;

        while (index < tab.size()) {
            char j = tab.get(index);
            boolean b = sprawdzCoUsunac(j, coUsunac);

            if (tab.size() > maxDlugoscSlowa && b) {
                if(!czyPierwsza) {
                    tab.remove(index);
                    index--;
                } else czyPierwsza = false;
            }
            index++;
        }
        StringBuilder result = new StringBuilder(tab.size());

        for (Character c : tab) {
            result.append(c);
        }

        return result.toString();
    }

    private static String usun(String slowo, int maxDlugoscSlowa, String coUsunac) {
        ArrayList<Character> tab = new ArrayList<>();

        for(int k = 0; k < slowo.length(); k++) {
            tab.add(slowo.charAt(k));
        }

        int index = tab.size() - 1;
        while (index >= 0) {
            char j = tab.get(index);
            boolean b = sprawdzCoUsunac(j, coUsunac);

            if (tab.size() > maxDlugoscSlowa && b) {
                tab.remove(index);
            }
            index--;
        }
        StringBuilder result = new StringBuilder(tab.size());

        for (Character c : tab) {
            result.append(c);
        }

        return result.toString();
    }

    private static boolean sprawdzCoUsunac(char j, String coUsunac) {
        switch (coUsunac) {
            case "znaki":
                return !(Character.isDigit(j) || Character.isLetter(j) || j == '$');
            case "cyfry":
                return !Character.isLetter(j);
            case "samogloski":
                return j == 'a' || j =='A' || j == 'ą' || j == 'Ą' || j == 'e' || j == 'E' || j == 'ę' || j == 'Ę' || j == 'i' || j =='I' || j == 'o' || j =='O' || j == 'u' || j =='U' || j == 'ó' || j =='Ó' || j == 'y' || j == 'Y';
            case "reszta" :
                return true;
            default:
                return false;
        }
    }
}