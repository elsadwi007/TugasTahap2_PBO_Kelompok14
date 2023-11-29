/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.util.Date;
/**
 *
 * @author diky
 */
public class TransaksiPengembalian {
    private String id;
    private TransaksiPeminjaman transaksiPeminjaman;
    private Date tanggalPengembalian;
    private double denda;

    
    // Constructor
    public TransaksiPengembalian(String id, TransaksiPeminjaman transaksiPeminjaman, Date tanggalPengembalian, double denda) {
        this.id = id;
        this.transaksiPeminjaman = transaksiPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.denda = denda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TransaksiPeminjaman getTransaksiPeminjaman() {
        return transaksiPeminjaman;
    }

    public void setTransaksiPeminjaman(TransaksiPeminjaman transaksiPeminjaman) {
        this.transaksiPeminjaman = transaksiPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    

    // Method to create return data with additional logic and validations
    public void MembuatDataPengembalian(String id, TransaksiPeminjaman transaksiPeminjaman, Date tanggalPengembalian, double denda) {
        System.out.println(id + "pengembalian buku pada tanggal" + tanggalPengembalian + "dengan denda sebesar " + denda);
        if (denda < 0) {
            System.out.println("Error: Denda tidak bisa bernilai negatif,atur menjadi 0.");
            this.denda = 0;
        } else {
            this.denda = denda;
        }

        // Validate tanggalPengembalian to ensure it is not in the future
        Date currentDate = new Date();
        if (tanggalPengembalian.after(currentDate)) {
            System.out.println("Error: Tanggal pengembalian tidak valid.atur kembali tanggal pengembalian");
            this.tanggalPengembalian = currentDate;
        } else {
            this.tanggalPengembalian = tanggalPengembalian;
        }

        // Set the remaining attributes
        this.id = id;
        this.transaksiPeminjaman = transaksiPeminjaman;
    }

}

