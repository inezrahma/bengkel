public class Mobil extends Kendaraan  {
    private int jumlahPintu;

    public Mobil(String nomorPlat, String merek, int jumlahPintu) {
        super(); // Panggil constructor dari kelas induk (Kendaraan)
        this.jumlahPintu = this.jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil Nomor Plat: " + getNomorPlat() + ", Merek: " + getMerek() + ", Pintu: " + jumlahPintu);
    }
}
