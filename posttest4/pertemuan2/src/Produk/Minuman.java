package Produk;

public class Minuman extends Jajanan{
    private String IdMinuman;
    private String JenisMinuman;
    public Minuman(String Nama, int Harga,String idMinuman, String jenisMinuman){
        super(Nama,Harga);
        this.IdMinuman = idMinuman;
        this.JenisMinuman = jenisMinuman;
    }
    public String getIdMinuman() {
        return IdMinuman;
    }
    public String getJenisMinuman() {
        return JenisMinuman;
    }
    public void setIdMinuman(String idMinuman) {
        IdMinuman = idMinuman;
    }
    public void setJenisMinuman(String jenisMinuman) {
        JenisMinuman = jenisMinuman;
    }
}
