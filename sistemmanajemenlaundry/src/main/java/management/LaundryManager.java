/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

import entities.PesananLaundry;
import java.util.ArrayList;

public class LaundryManager implements ManajemenPesanan {
    private final ArrayList<PesananLaundry> daftarPesanan;

    // Konstruktor
    public LaundryManager() {
        this.daftarPesanan = new ArrayList<>();
    }

    @Override
    public void tambahPesanan(PesananLaundry pesanan) {
        if (pesanan != null) {
            daftarPesanan.add(pesanan);
            System.out.println("Pesanan berhasil ditambahkan.");
        } else {
            System.out.println("Pesanan tidak valid.");
        }
    }

    @Override
    public void hapusPesanan(String idPesanan) {
        boolean ditemukan = false;
        for (PesananLaundry pesanan : daftarPesanan) {
            if (pesanan.getIdPesanan().equals(idPesanan)) {
                daftarPesanan.remove(pesanan);
                System.out.println("Pesanan dengan ID: " + idPesanan + " berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Pesanan dengan ID: " + idPesanan + " tidak ditemukan.");
        }
    }

    @Override
    public void perbaruiPesanan(String idPesanan, String jenisLayananBaru) {
        boolean ditemukan = false;
        for (PesananLaundry pesanan : daftarPesanan) {
            if (pesanan.getIdPesanan().equals(idPesanan)) {
                pesanan.setJenisLayanan(jenisLayananBaru);
                System.out.println("Pesanan dengan ID: " + idPesanan + " berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Pesanan dengan ID: " + idPesanan + " tidak ditemukan.");
        }
    }

    @Override
    public void tampilkanSemuaPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Tidak ada pesanan yang tersedia.");
        } else {
            System.out.println("Daftar Pesanan Laundry:");
            for (PesananLaundry pesanan : daftarPesanan) {
                System.out.println(pesanan.tampilkanInfoPesanan());
            }
        }
    }
}
