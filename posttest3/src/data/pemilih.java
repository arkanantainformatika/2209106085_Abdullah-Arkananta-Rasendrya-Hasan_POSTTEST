package data;

public class pemilih {
    String nama;
    String suara;
    int nik;

    public pemilih(String nama, String suara, int nik){
        this.nama = nama;        
        this.suara = suara;        
        this.nik = nik;        
    }public String getNama() {
        return nama;
    }public String getsuara() {
        return suara;
    }public int getnik() {
        return nik;
    }public void setNama(String nama) {
        this.nama = nama;
    }public void setsuara(String suara) {
        this.suara = suara;
    }public void setnik(int nik) {
        this.nik = nik;
    }
}