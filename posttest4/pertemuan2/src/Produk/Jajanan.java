package Produk;

public class Jajanan {
    protected String Nama;
    protected int Harga;

    public Jajanan(String NamaMakanan,int Harga){
        this.Nama = NamaMakanan;
        this.Harga = Harga;
    }
    public int getHarga() {
        return Harga;
    }
    public String getNama() {
        return Nama;
    }
   
    public void setNamaMakanan(String nama) {
        Nama = nama;
    }
    public void setHarga(int harga) {
        Harga = harga;
    }
    protected void PrintMakan(){
        System.out.println("Anda Berhasil Pesan");
    }
}
