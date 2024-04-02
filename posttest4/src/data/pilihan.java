package data;

public class pilihan extends pemilih {
    private String kandidat;
    private int idPemilih;
    private int usia;

    public pilihan(String nama, String suara,String kandidat, int idPemilih, int usia, int nik) {
        super(nama, suara, nik); // Urutan parameter disesuaikan dengan konstruktor kelas induk
        this.kandidat = kandidat;
        this.idPemilih = idPemilih;
        this.usia = usia;
    }

    // Metode getter dan setter untuk atribut kelas Pilihan
    public String getKandidat() {
        return kandidat;
    }

    public int getIdPemilih() {
        return idPemilih;
    }

    public int getUsia() {
        return usia;
    }

    public void setKandidat(String kandidat) {
        this.kandidat = kandidat;
    }

    public void setIdPemilih(int idPemilih) {
        this.idPemilih = idPemilih;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}