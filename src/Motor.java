class Motor extends Kendaraan {
    private boolean adaSidecar;

    public Motor(String nomorPlat, String merek, boolean adaSidecar) {
        super();
        this.adaSidecar = adaSidecar;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Motor Nomor Plat: " + getNomorPlat() + ", Merek: " + getMerek() + ", Ada Sidecar: " + adaSidecar);
    }

}
