package Produk;

public class Makanan extends Jajanan{
    private String IdMakanan;
    private String JenisMakanan;
    public Makanan(String Nama, int Harga,String idMakanan, String jenisMakanan){
        super(Nama,Harga);
        this.IdMakanan = idMakanan;
        this.JenisMakanan = jenisMakanan;
    }
    public String getIdMakanan() {
        return IdMakanan;
    }
    public String getJenisMakanan() {
        return JenisMakanan;
    }
    public void setIdMakanan(String idMakanan) {
        IdMakanan = idMakanan;
    }
    public void setJenisMakanan(String jenisMakanan) {
        JenisMakanan = jenisMakanan;
    }
}
