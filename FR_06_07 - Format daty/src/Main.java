import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ileDat = scanner.nextInt();

        for(int i = 0; i < ileDat; i++) {
            int data = scanner.nextInt();
            String dataString;

            if(czyPoprawnaDlugosc(data)) {
                //System.out.println("Poprawna długość daty");

                if(czyPoprawnyRok(data)) {
                    //System.out.println("Poprawny rok daty");

                    if(czyPoprawnyMiesiac(data)) {
                        //System.out.println("Poprawny miesiac daty");

                        if(czyPoprawnyDzien(data)) {
                            //System.out.println("Poprawny dzień daty");
                            wypiszDate(data);

                        } else System.out.println("niepoprawny format daty");
                    } else System.out.println("niepoprawny format daty");
                } else System.out.println("niepoprawny format daty");
            } else System.out.println("niepoprawny format daty");
        }
    }

    private static void wypiszDate(int data) {
        int dzien = data / 1000000;
        int miesiac = data / 10000 % 100;
        int rok = data % 10000;

        StringBuilder dataString = new StringBuilder();
        dataString.append(dzien);
        switch (miesiac) {
            case 1: {
                dataString.append(" stycznia ");
                break;
            }
            case 2: {
                dataString.append(" lutego ");
                break;
            }
            case 3: {
                dataString.append(" marca ");
                break;
            }
            case 4: {
                dataString.append(" kwietnia ");
                break;
            }
            case 5: {
                dataString.append(" maja ");
                break;
            }
            case 6: {
                dataString.append(" czerwca ");
                break;
            }
            case 7: {
                dataString.append(" lipca ");
                break;
            }
            case 8: {
                dataString.append(" sierpnia ");
                break;
            }
            case 9: {
                dataString.append(" września ");
                break;
            }
            case 10: {
                dataString.append(" października ");
                break;
            }
            case 11: {
                dataString.append(" listopada ");
                break;
            }
            case 12: {
                dataString.append(" grudnia ");
                break;
            }
        }
        dataString.append(rok);
        System.out.println(dataString);
    }

    private static boolean czyPoprawnyDzien(int data) {
        int dzien = data / 1000000;
        int miesiac = (data / 10000 % 100);
        //System.out.println(dzien + " : " + miesiac);
        if(miesiac % 2 == 1) {
            return dzien >= 1 && dzien <= 31;
        } else if(miesiac == 2) {
            if(data % 10000 % 4 == 0) {
                return dzien == 29;
            } else return dzien == 28;
        } else if(miesiac % 2 == 0) {
            return dzien >= 1 && dzien <= 30;
        } else return false;
    }

    private static boolean czyPoprawnyMiesiac(int data) {
        data = (data / 10000 % 100);
        //System.out.println(data);
        return data >= 1 && data <= 12;
    }

    private static boolean czyPoprawnyRok(int data) {
        data = data % 10000;
        return data >= 1000 && data <= 2200;
    }

    private static boolean czyPoprawnaDlugosc(int data) {
        return String.valueOf(data).length() == 8 || String.valueOf(data).length() == 7;
    }
}