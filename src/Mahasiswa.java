import java.util.ArrayList;

public class Mahasiswa {
    private ArrayList <Mahasiswa> listMahasiswa;
    private String NIM;
    private String Nama;
    public Mahasiswa (String NIM, String Nama) {
        this.NIM= NIM;
        this.Nama= Nama;
        this.listMahasiswa=new ArrayList<>();
    }
    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return Nama;
    }
    public void  tambahmhs(Mahasiswa mhs){
        listMahasiswa.add(mhs);
    }
}
