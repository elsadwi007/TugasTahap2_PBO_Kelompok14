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
public class Notifikasi {
    private String id, jenis, pesan;
    private Date tanggal;
    private anggotaPerpustakaan anggotaPerpustakaan;

    public Notifikasi(String id, String jenis, String pesan, Date tanggal, anggotaPerpustakaan anggotaPerpustakaan) {
        this.id = id;
        this.jenis = jenis;
        this.pesan = pesan;
        this.tanggal = tanggal;
        this.anggotaPerpustakaan = anggotaPerpustakaan;
    }
    
    
    public void sendOverdueNotice() {
        if (anggotaPerpustakaan != null) {
            System.out.println("Sending overdue notice to " + anggotaPerpustakaan.getNama() +
                    " for the item with ID " + id + ". Please return it as soon as possible.");
        } else {
            System.out.println("Cannot send overdue notice. AnggotaPerpustakan is not set.");
        }
    }

    public void sendHoldAvailable() {
        if (anggotaPerpustakaan != null) {
            System.out.println("Sending hold available notice to " + anggotaPerpustakaan.getNama() +
                    ". The item with ID " + id + " is now available for pickup.");
        } else {
            System.out.println("Cannot send hold available notice. AnggotaPerpustakan is not set.");
        }
    }

}


