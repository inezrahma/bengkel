import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Servis[] layanan = new Servis[10]; // Maksimal 10 layanan
        int jumlahLayanan = 0;

        while (true) {
            System.out .println("=== Sistem Manajemen Kendaraan Bengkel ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tambah Riwayat Servis");
            System.out.println("3. Tampilkan Riwayat Servis");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan nomor plat kendaraan: ");
                    String nomorPlat = scanner.nextLine();
                    System.out.print("Masukkan merek kendaraan: ");
                    String merek = scanner.nextLine();
                    System.out.print("Apakah kendaraan ini mobil? (y/n): ");
                    char jenisKendaraan = scanner.next().charAt(0);
                    scanner.nextLine(); // Membersihkan buffer

                    Kendaraan kendaraan;
                    if (jenisKendaraan == 'y') {
                        System.out.print("Masukkan jumlah pintu mobil: ");
                        int jumlahPintu = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan buffer
                        kendaraan = new Mobil(nomorPlat, merek, jumlahPintu);
                    } else {
                        System.out.print("Apakah motor ini memiliki sidecar? (y/n): ");
                        char adaSidecar = scanner.next().charAt(0);
                        scanner.nextLine(); // Membersihkan buffer
                        kendaraan = new Motor(nomorPlat, merek, adaSidecar == 'y');
                    }

                    System.out.print("Masukkan nama pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Masukkan kontak pelanggan: ");
                    String kontakPelanggan = scanner.nextLine();

                    Pelanggan pelanggan = new Pelanggan(namaPelanggan, kontakPelanggan);
                    layanan[jumlahLayanan++] = new Servis(kendaraan, pelanggan);
                    break;
                case 2:
                    if (jumlahLayanan == 0) {
                        System.out.println("Belum ada layanan yang tersedia.");
                    } else {
                        System.out.print("Pilih layanan yang ingin ditambahkan riwayat servis (1-" + jumlahLayanan + "): ");
                        int pilihanLayanan = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan buffer

                        if (pilihanLayanan >= 1 && pilihanLayanan <= jumlahLayanan) {
                            System.out.print("Masukkan tanggal servis: ");
                            String tanggalServis = scanner.nextLine();
                            System.out.print("Masukkan deskripsi servis: ");
                            String deskripsiServis = scanner.nextLine();

                            layanan[pilihanLayanan - 1].tambahRiwayatServis(tanggalServis, deskripsiServis);
                        } else {
                            System.out.println("Pilihan layanan tidak valid.");
                        }
                    }
                    break;
                case 3:
                    if (jumlahLayanan == 0) {
                        System.out.println("Belum ada layanan yang tersedia.");
                    } else {
                        System.out.print("Pilih layanan yang ingin ditampilkan riwayat servis (1-" + jumlahLayanan + "): ");
                        int pilihanLayanan = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan buffer

                        if (pilihanLayanan >= 1 && pilihanLayanan <= jumlahLayanan) {
                            layanan[pilihanLayanan - 1].tampilkanRiwayatServis();
                        } else {
                            System.out.println("Pilihan layanan tidak valid.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}