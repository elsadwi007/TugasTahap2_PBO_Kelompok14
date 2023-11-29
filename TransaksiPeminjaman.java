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
public class TransaksiPeminjaman {

    private int id;
    private anggotaPerpustakaan anggotaPerpustakaan;
    private Buku buku;
    private Date tanggalPeminjaman, tanggalPengembalian;

    public TransaksiPeminjaman(int id, anggotaPerpustakaan anggotaPerpustakaan, Buku buku, Date tanggalPeminjaman,Date tanggalPengembalian) {
        this.id = id;
        this.anggotaPerpustakaan = anggotaPerpustakaan;
        this.buku = buku;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = null; 
    }

    public int getId() {
        return id;
    }

    public anggotaPerpustakaan getAnggotaPerpustakaan() {
        return anggotaPerpustakaan;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public long hitungDurasiPinjam() {
        if (tanggalPengembalian == null) {
            throw new IllegalStateException("Buku belum dikembalikan.");
        }
        long diffInMillies = Math.abs(tanggalPengembalian.getTime() - tanggalPeminjaman.getTime());
        return diffInMillies / (24 * 60 * 60 * 1000);
    }

    public void MembuatDataPeminjaman() {
        if (tanggalPeminjaman != null) {
            System.out.println("Peminjaman buku " + buku.getJudul() + " oleh " + anggotaPerpustakaan.getNama()
                    + " pada tanggal " + tanggalPeminjaman);
             System.out.println("Data peminjaman berhasil dibuat.");
        } else {
            System.out.println("Transaksi peminjaman belum tercatat ");
        }
    }

    public void MemperbaruiDataPeminjaman() {
        System.out.println("Data peminjaman berhasil diperbarui.");
    }

    public void PengembalianBuku(Date tanggalPengembalian) {
        if (tanggalPengembalian != null) {
            System.out.println("Pengembalian buku " + buku.getJudul() + " oleh " + anggotaPerpustakaan.getNama()
                    + " pada tanggal " + tanggalPengembalian + ".");
        } else {
            System.out.println("Transaksi pengembalian belum tercatat ");
        }
        System.out.println("Data Pengembalian Berhasil ditambahkan");
    }
}


