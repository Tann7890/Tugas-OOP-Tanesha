import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean nextMhs = true;
        Scanner tann = new Scanner(System.in);
        ArrayList<Matkul> listMatkul = new ArrayList<>();

        while (nextMhs) {
            System.out.println("==============================================");
            System.out.println("Kartu Hasil Study");
            System.out.println("==============================================");
            System.out.print("Masukan nama: ");
            String nama = tann.nextLine();
            System.out.print("Masukan NIM: ");
            String nim = tann.nextLine();
            Mahasiswa mhs1 = new Mahasiswa(nim, nama);
            mhs1.tambahmhs(mhs1);

            boolean next = true;
            while (next) {
                System.out.print("Masukkan kode: ");
                String kode = tann.nextLine();
                System.out.print("Masukkan nama matkul: ");
                String namaMk = tann.nextLine();
                System.out.print("Masukkan nilai: ");
                int nilai = Integer.parseInt(tann.nextLine());
                Matkul mk1 = new Matkul(kode, namaMk, nilai);
                listMatkul.add(mk1);

                System.out.print("Ingin tambah matkul lain? (y/n) ");
                String lagi = tann.nextLine();
                if (lagi.equals("n")) next = false;
            }

            System.out.println("Daftar Mata Kuliah:");
            for (Matkul matkul : listMatkul) {
                matkul.cetakMatkul();
            }

            System.out.println("Tambah mahasiswa lain? (y/n)");
            String lain = tann.nextLine();
            if (lain.equals("n")) nextMhs = false;
        }
    }
}
