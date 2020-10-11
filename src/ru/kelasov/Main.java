package ru.kelasov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      pr1(3);
        pr2(5);
        pr3(6, 2);
        pr4(2,3);
        pr5(12345);
        pr6(10);
        pr7(24);
        pr8("laal");
        pr9(2,2);
        pr10(123);
        pr11();
        pr12();
        pr13();
        pr14(123);
        pr15(123);
        pr16();
        pr17();
    }
    static void pr1(int n){
        System.out.println();
        System.out.println("Задание 1");
        int a=0;
            for (int i = 1; i <= n; i++) {
                while (a != i) {
                    System.out.print(i + " ");
                    a++;
                }
                a = 0;
            }
        }

    static void pr2(int n) {
        System.out.println();
        System.out.println("Задание 2");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }

    static void pr3(int A, int B) {
        System.out.println();
        System.out.println("Задание 3");
            Scanner in = new Scanner(System.in);
            if (A < B) {
                for (int i = A; i <= B; i++) {
                    System.out.print(i + " ");
                }
            } else for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }

    static void pr4(int k, int s) {
        System.out.println();
        System.out.println("Задание 4");
        int a;
        int b = 0;

        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            int sum = 0;
            a = i;
            while (a != 0) {
                sum += a % (10);
                a /= 10;
            }
            if (sum == s) {
                b++;
            }
        }
        System.out.println(b);
    }

    static void pr5(int n) {
        System.out.println("Задание 5");
        System.out.println(recPr5(n));
    }
    static int recPr5(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + recPr5(n / 10));
    }

    static void pr6(int n) {
        System.out.println("Задание 6");
        int i = 2;
        recPr6(n, i);
    }

    static int recPr6(int n, int i) {
        if (n < 2) {
            System.out.println("NO");
        } else if (n == 2) {
            System.out.println("YES");
        } else if (n % i == 0) {
            System.out.println("NO");
        } else if (i < Math.sqrt(n)) {
            return recPr6(n, i + 1);
        } else {
            System.out.println("YES");
        }
        return 0;
    }

    public static void pr7(int n) {
        System.out.println("Задание 7");
        recPr7(n, 2);
    }
    static void recPr7(int n, int k) {
        if (k > n / 2) {
            System.out.print(n + " ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k + " ");
            recPr7(n / k, k);
        }
        else {
            recPr7(n, ++k);
        }
    }

    public static void pr8(String s) {
        System.out.println();
        System.out.println("Задание 8");

        String s2 = new StringBuffer(s).reverse().toString();
        if (s.equals(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void pr9(int a, int b) {
        System.out.println("Задание 9");
        System.out.println(recPr9(a, b));
    }

    public static int recPr9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recPr9(a, b - 1) + recPr9(a - 1, b - 1);
    }

    public static void pr10(int n) {
        System.out.println("Задание 10");
        System.out.println(recPr10(n, 0));
    }

    public static int recPr10(int n, int i) {
        if (n == 0) {
            return i;
        } else {
            return recPr10(n / 10, i * 10 + n % 10);
        }
    }

   static void pr11() {
        System.out.println("Задание 11");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if ((str.charAt(i) == '0') && (str.charAt(i + 1) == '0')) break;
            else if (str.charAt(i) == '1') count++;
        System.out.println(count);
    }

    static void pr12() {
        System.out.println("Задание 12");
        recPr12();
    }

    static void recPr12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recPr12();
            } else {
                recPr12();
            }
        }
    }

    static void pr13() {
        System.out.println("Задание 13");
        recPr13();
    }

    static void recPr13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recPr13();
            }
        }
    }

    static void pr14(int n) {
        System.out.println("Задание 14");
        recPr14(n);
    }

    public static int recPr14(int n) {
        if (n == 0) {
            return 0;
        }
        recPr14(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }

    static void pr15(int n) {
        System.out.println();
        System.out.println("Задание 15");
        recPr15(n);
    }

    static int recPr15(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.print(n % 10 + " ");
        recPr15(n / 10);
        return 0;
    }

    static void pr16() {
        System.out.println();
        System.out.println("Задание 16");
        recPr16(0, 0);
    }

    static void recPr16(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                recPr16(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                recPr16(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                recPr16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    static void pr17() {
        System.out.println();
        System.out.println("Задание 17");
        System.out.println(recPr17());
    }

    static int recPr17() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, recPr17());
        }
    }
}