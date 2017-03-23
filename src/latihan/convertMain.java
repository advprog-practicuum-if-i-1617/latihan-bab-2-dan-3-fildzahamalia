package merubahangkahurufsebaliknya;

import java.util.Scanner;

public class convertMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        convert o = new convert();
        System.out.print("Input angka : ");
        int angka = in.nextInt();
        System.out.println("Huruf : " + o.converted(angka));

        System.out.println(" ");
        System.out.print("Input angka dalam huruf : ");
        String hur = in2.nextLine();
        System.out.println("Angka : " + o.converted(hur));

    }
}
