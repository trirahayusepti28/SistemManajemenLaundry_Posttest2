/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

public class PesananSetrika extends PesananLaundry {
    private int jumlahItem;

    public PesananSetrika(String idPesanan, String namaPelanggan, String jenisLayanan, int jumlahItem) {
        super(idPesanan, namaPelanggan, jenisLayanan);
        this.jumlahItem = jumlahItem;
    }

    public int getJumlahItem() {
        return jumlahItem;
    }

    public void setJumlahItem(int jumlahItem) {
        this.jumlahItem = jumlahItem;
    }

    @Override
    public String tampilkanInfoPesanan() {
        return super.tampilkanInfoPesanan() + ", Jumlah Item: " + jumlahItem;
    }
}

