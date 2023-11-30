/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diky
 */

public class Admin {
    private int id;
    private String nama, alamat, nomorTelepon, email;
    private List<anggotaPerpustakaan> memberList;
    private List<Buku> bookList;

    public Admin(int id, String nama, String alamat, String nomorTelepon, String email) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.memberList = new ArrayList<>();
        this.bookList = new ArrayList<>();
    }

    public void addMember(anggotaPerpustakaan member) {
        memberList.add(member);
    }

    public void editMember(anggotaPerpustakaan member) {
    for (int i = 0; i < memberList.size(); i++) {
        if (memberList.get(i).getIdPerpustakan().equals(member.getIdPerpustakan())) {
            memberList.set(i, member);
            break;
        }
    }
}
    public void deleteMember(anggotaPerpustakaan member) {
        memberList.remove(member);
    }

    public void addBook(Buku book) {
        bookList.add(book);
    }

    public void editBook(Buku book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId_buku().equals(book.getId_buku())) {
                bookList.set(i, book);
                break;
            }
        }
    }

    public void deleteBook(Buku book) {
        bookList.remove(book);
    }

    void viewLoanTransactions(List<TransaksiPeminjaman> transactions) {
        for (TransaksiPeminjaman transaction : transactions) {
            System.out.println("ID Transaksi: " + transaction.getId());
            System.out.println("Nama Peminjam: " + transaction.getAnggotaPerpustakaan().getNama());
            System.out.println("Judul Buku: " + transaction.getBuku().getJudul());
            System.out.println("Tanggal Peminjaman: " + transaction.getTanggalPeminjaman());
            System.out.println("Tanggal Pengembalian: " + transaction.getTanggalPengembalian());
            System.out.println("Durasi Pinjam (hari): " + transaction.hitungDurasiPinjam());
            System.out.println("--------------------------------------");
        }
    }

    void generateReports(List<TransaksiPeminjaman> transactions) {
        int totalTransactions = transactions.size();
        long totalDurasiPinjam = 0;

        for (TransaksiPeminjaman transaction : transactions) {
            totalDurasiPinjam += transaction.hitungDurasiPinjam();
        }

        double averageDurasiPinjam = (double) totalDurasiPinjam / totalTransactions;

        System.out.println("Jumlah Transaksi Peminjaman: " + totalTransactions);
        System.out.println("Rata-rata Durasi Pinjam (hari): " + averageDurasiPinjam);
    }


}
