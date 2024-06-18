import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int ileTestow = scanner.nextInt();
    public static String slowo;

    public static void main(String[] args) {
        for (int i = 0; i < ileTestow; i++) {
            slowo = scanner.next();
            obliczOdleglosc(slowo);
        }
    }

    private static void obliczOdleglosc(String slowo) {
        char[] chars = slowo.toCharArray();

        int najmniejsze = najmniejszaLiterka(chars);
        int najwieksze = najwiekszaLiterka(chars);
        System.out.println(-najwieksze + najmniejsze);
    }

    private static int najwiekszaLiterka(char[] chars) {
        int temp = Integer.MAX_VALUE;

        for(int i = 0; i < chars.length; i++){
            if(temp >= chars[i]){
                temp = chars[i];
            }
        }
        return temp;
    }

    private static int najmniejszaLiterka(char[] chars) {
        int temp = Integer.MIN_VALUE;

        for(int i = 0; i < chars.length; i++){
            if(temp <= chars[i]){
                temp = chars[i];
            }
        }
        return temp;
    }
}