import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileTestow = scanner.nextInt();

        for(int i = 0; i < ileTestow; i++) {
            int ileStudentow = scanner.nextInt();
            ArrayList<Integer> studenci = new ArrayList<>();

            for(int j = 1; j <= ileStudentow; j++) {
                studenci.add(j);
            }

            int najlepszeMiejsce = znajdzNajlepsze(studenci);
            System.out.print(najlepszeMiejsce);

        }
    }

    private static int znajdzNajlepsze(ArrayList<Integer> studenci) {
        int pierwsza = 2;
        int ileusunieto = 0;
        while(studenci.size() != 1) {
            studenci.remove((pierwsza-1 + ileusunieto) % studenci.size());
            ileusunieto++;
            pierwsza = znajdzNastepnaLiczbe(pierwsza);
        }
        int najlepszeMiejsce = studenci.get(0);
        return najlepszeMiejsce;
    }

    private static int znajdzNastepnaLiczbe(int pierwsza) {
        int kolejna = pierwsza + 1;
        int max = (int) Math.sqrt(kolejna);
        int licznik = 2;

        while(licznik != max) {
            if(kolejna % licznik == 0) {
                znajdzNastepnaLiczbe(kolejna++);
            } else {
                licznik++;
            }
            return kolejna;
        }

        return kolejna;
    }
}