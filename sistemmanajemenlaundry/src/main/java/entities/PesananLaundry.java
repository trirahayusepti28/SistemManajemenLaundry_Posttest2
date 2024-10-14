/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

// Hapus final di sini
public class PesananLaundry {
    private final String idPesanan;
    private final String namaPelanggan;
    private String jenisLayanan;
    public static int totalPesanan = 0;

    // Konstruktor
    public PesananLaundry(String idPesanan, String namaPelanggan, String jenisLayanan) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.jenisLayanan = jenisLayanan;
        totalPesanan++;
    }

    // Getter dan Setter
    public String getIdPesanan() {
        return idPesanan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    // Menampilkan informasi pesanan
    public String tampilkanInfoPesanan() {
        return "ID: " + idPesanan + ", Pelanggan: " + namaPelanggan + ", Layanan: " + jenisLayanan;
    }
}
