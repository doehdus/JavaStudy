package classwork.day2;

import java.util.Scanner;

public class integerstring {
    public static void main(String[] args) {

        String str = "1 2";
        Scanner sc = new Scanner(str);

        String s = sc.next();
        int n = sc.nextInt();

        System.out.println(s);
        System.out.println(n);
    }
}