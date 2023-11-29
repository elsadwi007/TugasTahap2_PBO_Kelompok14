/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author diky
 */
public class anggotaPerpustakaan {
    private Integer idPerpustakan ;
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private Date tanggalLahir;
    private Date tanggalGabung;
    private String status;

    public anggotaPerpustakaan(Integer idPerpustakan, String nama, String alamat, String nomorTelepon, String email, Date tanggalLahir, Date tanggalGabung, String status) {
        this.idPerpustakan = idPerpustakan;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
        this.tanggalGabung = tanggalGabung;
        this.status = status;
    }

    public Integer getIdPerpustakan() {
        return idPerpustakan;
    }

    public void setIdPerpustakan(Integer idPerpustakan) {
        this.idPerpustakan = idPerpustakan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalGabung() {
        return tanggalGabung;
    }

    public void setTanggalGabung(Date tanggalGabung) {
        this.tanggalGabung = tanggalGabung;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void PencarianKatalog(String judulBuku) {
        // Simulated implementation for searching catalog
        System.out.println("Searching for book with title: " + judulBuku);
    }

    public void RequestBuku(int id_buku) {
        // Simulated implementation for book request
        System.out.println("Requesting book with ID " + id_buku + " for member ID " + this.idPerpustakan);
    }

    public void PengembalianBuku(int id_buku) {
        // Simulated implementation for returning a book
        System.out.println("Returning book with ID " + id_buku + " for member ID " + this.idPerpustakan);
    }

    public void PerpanjangBuku(int id_buku) {
        // Simulated implementation for extending the due date of a book
        System.out.println("Extending due date for book with ID " + id_buku + " for member ID " + this.idPerpustakan);
    }

    public void pembayaranDenda() {
        // Simulated implementation for paying fines
        System.out.println("Paying fines for member ID " + this.idPerpustakan);
    }

    public void updateInformasi(String newAlamat, String newNomorTelepon, String newEmail) {
        // Simulated implementation for updating member information
        this.alamat = newAlamat;
        this.nomorTelepon = newNomorTelepon;
        this.email = newEmail;
        System.out.println("Member information updated for ID " + this.idPerpustakan);
        displayMemberInfo(); // Display updated information
    }

    public void ViewAccount() {
        // Simulated implementation for viewing account information
        displayMemberInfo();
    }

    public void displayMemberInfo() {
        // Helper method to display member information
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("ID: " + this.idPerpustakan);
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Nomor Telepon: " + this.nomorTelepon);
        System.out.println("Email: " + this.email);
        System.out.println("Tanggal Lahir: " + dateFormat.format(this.tanggalLahir));
        System.out.println("Tanggal Gabung: " + dateFormat.format(this.tanggalGabung));
        System.out.println("Status: " + this.status);
    }


}

