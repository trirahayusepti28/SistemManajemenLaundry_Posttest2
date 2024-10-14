/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package management;

import entities.PesananLaundry;

public interface ManajemenPesanan {
    void tambahPesanan(PesananLaundry pesanan);
    void hapusPesanan(String idPesanan);
    void perbaruiPesanan(String idPesanan, String jenisLayananBaru);
    void tampilkanSemuaPesanan();
}
