/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import management.LaundryManager;
import entities.PesananLaundry;
import java.util.Scanner;

public class SistemManajemenLaundry {
    public static void main(String[] args) {
        LaundryManager pengelola = new LaundryManager();
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("+=================================+");
            System.out.println("|    Sistem Manajemen Laundry     |");
            System.out.println("+=================================+");
            System.out.println("|   1. Tambah Pesanan             |");
            System.out.println("|   2. Hapus Pesanan              |");
            System.out.println("|   3. Tampilkan Semua Pesanan    |");
            System.out.println("|   4. Perbarui Pesanan           |");
            System.out.println("|   5. Keluar                     |");
            System.out.println("+=================================+");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Tambah pesanan
                    System.out.print("Masukkan ID Pesanan: ");
                    String idPesanan = scanner.nextLine();
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Masukkan Jenis Layanan (Cuci Kering/Setrika/Dry Cleaning): ");
                    String jenisLayanan = scanner.nextLine();
                    PesananLaundry pesanan = new PesananLaundry(idPesanan, namaPelanggan, jenisLayanan);
                    pengelola.tambahPesanan(pesanan);
                    break;

                case 2:
                    // Hapus pesanan
                    System.out.print("Masukkan ID Pesanan yang akan dihapus: ");
                    String idHapus = scanner.nextLine();
                    pengelola.hapusPesanan(idHapus);
                    break;

                case 3:
                    // Tampilkan semua pesanan
                    pengelola.tampilkanSemuaPesanan();
                    break;

                case 4:
                    // Perbarui pesanan
                    System.out.print("Masukkan ID Pesanan yang akan diperbarui: ");
                    String idPerbarui = scanner.nextLine();
                    System.out.print("Masukkan jenis layanan baru: ");
                    String layananBaru = scanner.nextLine();
                    pengelola.perbaruiPesanan(idPerbarui, layananBaru);
                    break;

                case 5:
                    // Keluar
                    System.out.println("Keluar dari sistem.");
                    berjalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}
