import Produk.Makanan;

public class Bahan extends Makanan{
    public Bahan(String Nama, int Harga, String idMakanan, String jenisMakanan) {
        super(Nama, Harga, idMakanan, jenisMakanan);
    }

    public void cekclass(){
        System.out.println("Ini Adalah Class Bahan");
    }
}
