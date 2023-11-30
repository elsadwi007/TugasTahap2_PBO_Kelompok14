/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author diky
 */
public class SistemPerpustakaan {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Buku book1 = new Buku(121, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", dateFormat.parse("10-04-1925"), 5, "tersedia");

        anggotaPerpustakaan member1 = new anggotaPerpustakaan(1, "Rafif Maulana", "Kalianda", "0858-3245-6789", "Rafif24@gmail.com", dateFormat.parse("01-09-2003"), dateFormat.parse("24-11-2023"), "Active");

        Admin admin = new Admin(101, "Dimas Adivia", "Kampung Baru nomer 3", "0858-3286-0711", "Dimas76@gmail.com");
        
        System.out.println("===================MENAMBAHKAN ANGGOTA=====================");
        admin.addMember(member1);
        member1.displayMemberInfo();
        System.out.println("Anggota berhasil ditambahkan");
        System.out.println(" ");
        
        System.out.println("==================MENAMBAHKAN BUKU========================");
        admin.addBook(book1);
        book1.menambahkanBuku();
        System.out.println("");

        System.out.println("==================TRANSAKSI PEMINJAMAN====================");
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(1, member1, book1, dateFormat.parse("24-11-2023"), dateFormat.parse("27-11-2023"));
        transaksi1.MembuatDataPeminjaman();
        System.out.println(" ");

        // Simulasi pengembalian buku
        System.out.println("=================TRANSAKSI PENGEMBALIAN=====================");
        Date tanggalPengembalian = new Date(); // Anda dapat mengganti ini dengan tanggal sebenarnya
        double denda = 0.0; // Anda dapat menghitung denda sesuai kebijakan perpustakaan
        TransaksiPengembalian transaksi2 = new TransaksiPengembalian("D001", transaksi1, tanggalPengembalian, denda);
        transaksi2.MembuatDataPengembalian("D001", transaksi1, tanggalPengembalian, denda);
        System.out.println(" ");

        System.out.println("====================Notifikasi==============");
        Notifikasi notifikasi = new Notifikasi("001", "Overdue", "Your book is overdue!", new Date(), member1);
        notifikasi.sendOverdueNotice();
        
        // Mengirim notifikasi keterlambatan pengembalian
        if (tanggalPengembalian.after(transaksi1.getTanggalPengembalian())) {
            notifikasi.sendOverdueNotice();
        }

        // Menambah buku yang dikembalikan ke stok
        book1.setStok(book1.getStok() + 1);
        book1.EditinformasiBuku();

        // Menampilkan informasi buku
        System.out.println("\nUpdated Book Information:");
        System.out.println("ID: " + book1.getId_buku());
        System.out.println("Title: " + book1.getJudul());
        System.out.println("Author: " + book1.getPenulis());
        System.out.println("Category: " + book1.getKategori());
        System.out.println("Publication Date: " + dateFormat.format(book1.getTanggal_terbit()));
        System.out.println("Stock: " + book1.getStok());
        System.out.println("Status: " + book1.getStatus());
    }
}
    





