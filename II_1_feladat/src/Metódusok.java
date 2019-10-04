
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Metódusok {

    public static void növekvőSorrend(int a, int b, int c) {
        int[] tömb = new int[3];
        tömb[0] = a;
        tömb[1] = b;
        tömb[2] = c;
        Arrays.sort(tömb);
        for (int i = 0; i < tömb.length; i++) {
            System.out.print(tömb[i] + " ");
        }
        System.out.println("");
    }

    public static void minAbsMax(float a, float b, float c) {
        float[] tömb = new float[3];
        tömb[0] = a;
        tömb[1] = b;
        tömb[2] = c;
        Arrays.sort(tömb);
        System.out.println(tömb[0]);
        for (int i = 0; i < tömb.length; i++) {
            tömb[i] = Math.abs(tömb[i]);
        }
        Arrays.sort(tömb);
        System.out.println(tömb[2]);
    }

    public static void dCsere(float a, float b, float c, float d) {
        System.out.println(a + " " + b + " " + c + " " + d);
        if (d >= 0) {
            float segéd;
            segéd = c;
            c = b;
            b = segéd;
        } else {
            float segéd;
            segéd = c;
            c = d;
            d = segéd;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }

    public static boolean háromszögE(float a, float b, float c) {
        if (a + b > c || a + c > b || b + c > a) {
            return true;
        }
        return false;
    }

    public static int hánySzökőév(int a, int b) {
        int db = 0;
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        GregorianCalendar év = new GregorianCalendar();
        for (int i = a + 1; i < b; i++) {
            if (év.isLeapYear(i)) {
                db++;
            }
        }
        return db;
    }

    public static void érdemjegy(int a) {
        switch (a) {
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
        }
    }

    /*
7. Számítsuk ki két természetes szám egész hányadosát ismételt kivonásokkal!

Algoritmus Osztás(a,b,hányados):
 hányados  0{ bemeneti adatok: a, b, kimeneti adat: hányados }
 Amíg a ≥ b végezd el:
 hányados  hányados + 1
 a  a - b
 vége(amíg)
Vége(algoritmus)
     */
    public static void osztás(int a, int b) {
        int hányados = 0;
        while (a >= b) {
            hányados++;
            a = a - b;
        }
        System.out.println(hányados);
    }

    public static boolean Prím_1(int n) {
        int osztók_száma = 0;
        for (int osztó = 1; osztó <= n; osztó++) {
            if (n % osztó == 0) {
                osztók_száma++;
            }
        }
        if (osztók_száma == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Prím_2(int n) {
        for (int osztó = 2; osztó <= Math.sqrt(n); osztó++) {
            if (n % osztó == 0) {
                return false;
            }
        }
        return true;

    }

    public static void Fibonacci_1(int n) {
        int a = 0, b = 1;
        if (n == 1) {
            System.out.print(a + " ");
        } else {
            if (n == 2) {
                System.out.print(a + " " + b + " ");
            } else {
                int c = a + b;
                System.out.print(a + " " + b + " " + c + " ");
                int k = 3;
                while (k < n) {
                    a = b;
                    b = c;
                    c = a + b;
                    System.out.print(c + " ");
                    k++;
                }
            }
        }
        System.out.println("");
    }

    public static void Fibonacci_2(int n) {
        int a = 1, b = 0;
        for (int k = 1; k <= n; k++) {
            System.out.print(b + " ");
            b = a + b;
            a = b - a;
        }
        System.out.println("");
    }

    public static int Fordított_szám(int n) {
        int újszám = 0;
        while (n != 0) {
            újszám = újszám * 10 + n % 10;
            n = n / 10;
        }
        return újszám;
    }

    public static long faktoriális(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * faktoriális(num - 1));
        }
    }

    public static void k_valOsztható(int n1, int n2, int k) {
        for (int i = n1 + 1; i < n2; i++) {
            if (i % k == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static int köviFibonacci(int n) {
        int a = 1, b = 0;
        ArrayList<Integer> fib_számok = new ArrayList<>();
        while (b <= n) {
            fib_számok.add(b);
            b = a + b;
            a = b - a;
        }
        if (n == fib_számok.get(fib_számok.size() - 1)) {
            return n + fib_számok.get(fib_számok.size() - 2);
        } else {
            return fib_számok.get(fib_számok.size() - 1) + fib_számok.get(fib_számok.size() - 2);
        }
    }

    public static void köbÖsszeg() {
        for (int i = 1; i < 1000; i++) {
            String szám = Integer.toString(i);
            int számjegyek_összege = 0;
            for (int j = 0; j < szám.length(); j++) {
                int számjegy = szám.charAt(j)-48;
                számjegyek_összege += Math.pow(számjegy, 3);
            }
            if (i == számjegyek_összege) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("    1.");
        növekvőSorrend(2, 6, 1);
        System.out.println("    2.");
        minAbsMax(-5, -2, 4);
        System.out.println("    3.");
        dCsere(3, 8, 1, -1);
        System.out.println("    4. \n" + háromszögE(5, 4, 2));

        System.out.println("    5.");
        System.out.println(hánySzökőév(1950, 1940));
        System.out.println("    6.");
        érdemjegy(4);
        System.out.println("    7.");
        osztás(25, 3);
        System.out.println("    8.");
        System.out.println(Prím_1(72));
        System.out.println(Prím_2(61));
        System.out.println("    9.");
        Fibonacci_1(11);
        Fibonacci_2(11);
        System.out.println("    10.");
        System.out.println(Fordított_szám(65132));
        System.out.println("    11. \n" + faktoriális(0));

        System.out.println("    12.");
        k_valOsztható(10, 30, 5);
        k_valOsztható(10, 30, 2);
        System.out.println("    13.");
        System.out.println(köviFibonacci(60));
        System.out.println("    14.");
        köbÖsszeg();
    }
}
