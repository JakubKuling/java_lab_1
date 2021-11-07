import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj Imię:");
        String tekst = scan.next();
        System.out.print("Podaj Nazwisko:");
        String tekstA = scan.next();
        System.out.print("Podaj swój wiek:");
        int liczba = scan.nextInt();
        System.out.print("Podaj numer indeksu:");
        int liczbaA = scan.nextInt();

        System.out.println("Imie : " + tekst);
        System.out.println("Nazwisko : " + tekstA);
        System.out.println("Wiek : " + liczba);
        System.out.println("Numer Albumu : " + liczbaA);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        int a = 2;
        int b = 4;

        int dodawanie = a + b ;
        System.out.println("dodawanie = " + dodawanie);
        int odejmowanie = a - b ;
        System.out.println("odejmowanie = " + odejmowanie);
        int mnozenie = a * b ;
        System.out.println("mnozenie = " + mnozenie);
        int dzielenie = (b / a) ;
        System.out.println("dzielenie = " + dzielenie);
        int modulo = a % b ;
        System.out.println("modulo = " + modulo) ;


    }
}
