import java.util.ArrayList;
import data.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App extends menu {
    public static void main(String[] args) throws IOException {
        ArrayList<pemilih> pilihan = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.flush();
            menu obj = new menu();
            obj.msg();
            int input = Integer.parseInt(br.readLine());
            switch (input) {
                case 1:
                    tampilkanData(pilihan);
                    break;
                case 2:
                    tambahData(pilihan);
                    break;
                case 3:
                    updateData(pilihan);
                    break;
                case 4:
                    hapusData(pilihan);
                    break;
                case 5:
                    System.out.println("Program Berakhir");
                    System.exit(0);
                default:
                    break;
            }
        }

    }
    
    private static void tampilkanData(ArrayList<pemilih> pilihan) {
        if (pilihan.isEmpty()) {
            System.out.println("Belum Ada Data");
        } else {    System.out.println("========== Data Pemilihan Suara ==========");
        for (int i = 0; i < pilihan.size(); i++) {
            pemilih warga = pilihan.get(i);
            String nama = warga.getNama();
            String  suara = warga.getsuara();
            int nik = warga.getnik();
    
            System.out.println("no : " +  (i+1) );
            System.out.println("Nama : " +  nama);
            System.out.println("Pilihan Suara : " + suara);
            System.out.println("NIK " + nik);
            System.out.println("__________________________________________");
        }
    }
    }

    private static void tambahData(ArrayList<pemilih> pilihan) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan Data Nama : ");
        String nama = br.readLine();
        System.out.print("Masukkan Data Pilihan Suara : ");
        String suara = br.readLine();
        System.out.print("Masukkan Data NIK : ");
        int nik = Integer.parseInt(br.readLine());
        pemilih warga = new pemilih(nama, suara, nik);
        pilihan.add(warga);
    }

    private static void updateData(ArrayList<pemilih> pilihan) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Update Data");
        tampilkanData(pilihan);
        System.out.print("Data Nomor Ke Berapa Yang Ingin Di Update? : ");
        int cari = Integer.parseInt(br.readLine()) - 1;
        for (int i = 0; i < pilihan.size(); i++ ) {
            if (cari == i) {
                pemilih newpilihan = pilihan.get(i);
                System.out.print("Masukkan Data Nama Baru  : ");
                String newNamepilihan = br.readLine();
                newpilihan.setNama(newNamepilihan);
                System.out.print("Masukkan Data pilihan Suara    : ");
                String newsuara = br.readLine();
                newpilihan.setsuara(newsuara);
                System.out.print("Masukkan Data NIK Baru : ");
                int newnik = Integer.parseInt(br.readLine());
                newpilihan.setnik(newnik);
            }
        }
    }

    private static void hapusData(ArrayList<pemilih> pilhan) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Hapus Data");
        tampilkanData(pilhan);
        System.out.print("Data Nomor Ke Berapa Yang Ingin Di Hapus? : ");
        int hapus = Integer.parseInt(br.readLine()) - 1;
        pilhan.remove(hapus);
    }
}