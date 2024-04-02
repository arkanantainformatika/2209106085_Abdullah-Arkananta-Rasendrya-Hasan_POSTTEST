import java.util.ArrayList;
import Produk.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Makanan> Mkn = new ArrayList<>();
        ArrayList<Minuman> Min = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
            System.out.println("=============");
            System.out.println("1. lihat Makanan");
            System.out.println("2. lihat Minuman");
            System.out.println("3. Tambah Makanan");
            System.out.println("4. Tambah Minuman");
           
            System.out.println("5. ubah Makanan");
            System.out.println("6. hapus Makanan");
            System.out.println("7. Lihat Bahan ");
            System.out.println("============="); 
            System.out.print("Menu : ");  
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("========== Data Makanan ==========");
                    for (int i = 0; i < Mkn.size(); i++) {
                        Makanan mkn = Mkn.get(i);

                        System.out.println("Id : " +  mkn.getIdMakanan());
                        System.out.println("Nama Makanan : " + mkn.getNama());
                        System.out.println("Jenis Makanan : " + mkn.getJenisMakanan());
                        System.out.println("Harga : Rp. " + mkn.getHarga());
                        System.out.println("=============-----======");
                    }
                    break;
                case 2 :
                System.out.println("========== Data Minuman ==========");
                for (int i = 0; i < Min.size(); i++) {
                    Minuman min = Min.get(i);
                    System.out.println("Id : " +  min.getIdMinuman());
                    System.out.println("Nama Minuman : " + min.getNama());
                    System.out.println("Jenis Minuman : " + min.getJenisMinuman());
                    System.out.println("Harga : Rp. " + min.getHarga());
                    System.out.println("===================");
                }
                break;
                case 3:
                    String idmakanan = "MKN 0" + Mkn.size() + 1;
                    System.out.println("Masukkan Nama Makanan");
                    String Nama = br.readLine();
                    System.out.println("Harga");
                    int harga = Integer.parseInt(br.readLine());
                    System.out.println("Masukkan Jenis Makanan");
                    String jnsmkn = br.readLine();
                    Makanan Makan = new Makanan(Nama, harga, idmakanan, jnsmkn);
                    Mkn.add(Makan);
                    Bahan bhn = new Bahan(Nama, harga, idmakanan, idmakanan);
                    bhn.cekclass();
                    break;
                case 4:
                System.out.println("Masukkan Nama Minum");
                String NamaMinum = br.readLine();
                System.out.println("Harga");
                int hargaM = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Jenis Makanan");
                String jnsmin = br.readLine();
                Minuman Minum = new Minuman(NamaMinum, hargaM, jnsmin, NamaMinum);
                Min.add(Minum);
                    break;
                case 5:
                System.out.println("Ubah Makanan");
                System.out.println("cari index : ");
                int cari = Integer.parseInt(br.readLine());
                for( int i = 0; i < Mkn.size(); i++){
                    if(cari == i){
                        Makanan Mknbaru = Mkn.get(i);
                        System.out.println("Masukkan Nama Makanan");
                        String NamaBaru = br.readLine();
                        Mknbaru.setNamaMakanan(NamaBaru);
                        System.out.println("Harga");
                        int hargabaru = Integer.parseInt(br.readLine());
                        Mknbaru.setHarga(hargabaru);
                    }
                }
                break;
                case 6:
                System.out.println("hapus makanan");
                System.out.println("Cari Index : ");
                int Cari = Integer.parseInt(br.readLine());
                Mkn.remove(Cari);
                break;
                default:
                    break;
            }

        }
    }
   
}
