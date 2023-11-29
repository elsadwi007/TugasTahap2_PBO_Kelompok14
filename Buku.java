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
public class Buku {
    private Integer id_buku;
    private String judul;
    private String penulis;
    private String kategori;
    private Date tanggal_terbit;
    private int stok;
    private String status;

    public Buku(Integer id_buku, String judul, String penulis, String kategori, Date tanggal_terbit, int stok, String status) {
        this.id_buku = id_buku;
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tanggal_terbit = tanggal_terbit;
        this.stok = stok;
        this.status = status;
    }

    public Integer getId_buku() {
        return id_buku;
    }

    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Date getTanggal_terbit() {
        return tanggal_terbit;
    }

    public void setTanggal_terbit(Date tanggal_terbit) {
        this.tanggal_terbit = tanggal_terbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void menambahkanBuku() {
        System.out.println("id Buku : "+ id_buku);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis Buku : " + penulis);
        System.out.println("Kategori Buku : " + kategori);
        System.out.println("Tanggal Buku Terbit : " + tanggal_terbit);
        System.out.println("Jumlah stok Buku : " + stok);
        System.out.println("Status ketersediaan buku : " + status);
        if (judul != null && !judul.isEmpty() && penulis != null && !penulis.isEmpty()) {
            stok = 1; 
            status = "tersedia"; 
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Informasi Buku salah.Silahkan cek ulang judul dan penulis nya");
        }
    }

    public void EditinformasiBuku() {
        
        if (judul != null && !judul.isEmpty() && penulis != null && !penulis.isEmpty()) {
            System.out.println("Book information edited successfully!");
        } else {
            System.out.println("Informasi Buku salah.Silahkan cek ulang judul dan penulis nya");
        }
    }

    public void TandaiBukutersedia() {
        status = "tersedia";
        System.out.println("Buku Tersedia!");
    }

    public void TandaiBukuDipinjam() {
        status = "dipinjam"; // Update status to borrowed
        System.out.println("Buku sedang dipinjam!");
    }
}
