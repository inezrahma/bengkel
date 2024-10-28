public abstract class Kendaraan {
    private String nomorPlat;
    private String merek;

    public Kendaraan() {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerek() {
        return merek;
    }

    public abstract void tampilkanInfo();

}
