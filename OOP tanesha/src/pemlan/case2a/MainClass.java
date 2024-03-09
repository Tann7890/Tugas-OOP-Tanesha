package pemlan.case2a;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] a) {
        ArrayList namas = new ArrayList();
        ArrayList nims = new ArrayList();
        ArrayList alamats = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();
            nims.add(nim);

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();
            namas.add(nama);

            System.out.print("masukkan alamat: ");
            String alamat = scanner.nextLine();
            alamats.add(alamat);

            System.out.print("tambah lagi? ");
            String tambah = scanner.nextLine();

            if (tambah.equals("t")) {
                next = false;
            }
        }
        System.out.println("==================================");
        for (int i = 0; i < nims.size(); i++) {
            System.out.println(nims.get(i) + " | " + namas.get(i) + " | " + alamats.get(i));
        }
    }
}