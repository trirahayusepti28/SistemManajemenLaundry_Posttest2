/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

public class PesananDryCleaning extends PesananLaundry {
    private String jenisKain;

    // Konstruktor menetapkan layanan ke "Dry Cleaning"
    public PesananDryCleaning(String idPesanan, String namaPelanggan, String jenisKain) {
        super(idPesanan, namaPelanggan, "Dry Cleaning");  // Layanan ditetapkan ke "Dry Cleaning"
        this.jenisKain = jenisKain;
    }

    // Getter dan Setter untuk jenis kain
    public String getJenisKain() {
        return jenisKain;
    }

    public void setJenisKain(String jenisKain) {
        this.jenisKain = jenisKain;
    }

    // Override metode untuk menampilkan informasi pesanan dengan tambahan jenis kain
    @Override
    public String tampilkanInfoPesanan() {
        return super.tampilkanInfoPesanan() + ", Jenis Kain: " + jenisKain;
    }
}
