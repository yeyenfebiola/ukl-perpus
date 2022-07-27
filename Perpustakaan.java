
package perpustakaan;
import java.util.Scanner;
public class Perpustakaan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        PeminjamanBuku peminjaman = new PeminjamanBuku();
        LaporanPeminjaman laporan = new LaporanPeminjaman();

        laporan.laporan(petugas);
        System.out.print("Masukkan ID Petugas : ");
        int id = input.nextInt();
        System.out.println("Selamat datang " + petugas.getNama(id));
        System.out.println("");

        KoleksiBuku buku = new KoleksiBuku();
        laporan.laporan(siswa);
        Perpustakaan.prosesLelang(petugas, siswa, lelang, buku, laporan);
        laporan.laporan(buku);
    }
    
        
    }
    

