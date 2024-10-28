public class Servis {
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private RiwayatServis[] riwayatServis;
    private int jumlahRiwayat;

    public Servis(Kendaraan kendaraan, Pelanggan pelanggan) {
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.riwayatServis = new RiwayatServis[10]; // Maksimal 10 riwayat servis
        this.jumlahRiwayat = 0;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void tambahRiwayatServis(String tanggal, String deskripsi) {
        if (jumlahRiwayat < riwayatServis.length) {
            riwayatServis[jumlahRiwayat++] = new RiwayatServis(tanggal, deskripsi);
        } else {
            System.out.println("Riwayat servis sudah penuh.");
        }
    }

    public void tampilkanRiwayatServis() {
        System.out.println("Riwayat Servis untuk " + kendaraan.getNomorPlat() + ":");
        for (int i = 0; i < jumlahRiwayat; i++) {
            System.out.println(riwayatServis[i].getTanggalServis() + ": " + riwayatServis[i].getDeskripsiServis());
        }
    }

}
