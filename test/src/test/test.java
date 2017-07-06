package test;
import java.util.Locale;
import java.util.Scanner;

public class test {
	public static void main(String args[]) {
        Locale.setDefault(Locale.ENGLISH);

        final double Z = 10.0;
        double a, b;

        System.out.println("Задание 1: введите два числа");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();

        System.out.println(Math.abs(a - Z) > Math.abs(b - Z) ? b : a);


        System.out.println("Задание 2: введите значения для коэффициентов a, b, c");

        double c, d;

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Нет корней");
        } else {
            System.out.print(((-b + Math.sqrt(d))/2/a) + " " + ((-b - Math.sqrt(d))/2/a));
        }
        System.out.println();


        System.out.println("Задание 3: двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]");

        int m = 8, n = 5;
        int[][] arr3Test = new int[m][n];

        a = 10;
        b = 99;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3Test[i][j] = (int) a + (int) (Math.random() * (b - a + 1));
                System.out.print(arr3Test[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Задание 4: двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]");

        m = 5;
        n = 8;
        int[][] arr4Test = new int[m][n];
        int min = 100;

        a = -99;
        b = 99;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr4Test[i][j] = (int) a + (int) (Math.random() * (b - a + 1));
                if (arr4Test[i][j] < min) {
                    min = arr4Test[i][j];
                }
                System.out.print(arr4Test[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(min);


        System.out.println("Задание 5: укажите значения промежутка");

        short c1Num, c2Num;

        c1Num = in.nextShort();
        c2Num = in.nextShort();

        for (int i = c1Num; i <= c2Num; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();


        System.out.println("Задание 6: введите десятичное число для перевода в шестнадцатиричное");

        int tenToHex;
        String s = "";

        tenToHex = in.nextInt();
        while (tenToHex > 0) {
            int num = tenToHex % 16;
            tenToHex /= 16;
            if (num <= 9) {
                s = num + s;
            } else {
                s = (char) ('a' + (num - 10)) + s;
            }
        }

        System.out.println(s);

        System.out.println("Задание 7: введите значения для массива");

        final int size = 5;
        String[] stringArr = new String[size];

        for (int i = 0; i < size; i++) {
            stringArr[i] = in.next();
        }

        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (stringArr[j].compareTo(stringArr[j + 1]) > 0) {
                    String buf = "";
                    buf = stringArr[j];
                    stringArr[j] = stringArr[j + 1];
                    stringArr[j + 1] = buf;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(stringArr[i]);
        }
    }
}

