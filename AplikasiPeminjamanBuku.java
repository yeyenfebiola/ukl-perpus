
package perpustakaan;

public class AplikasiPeminjamanBuku {
    public static void main(String[] args) {
        Siswa S = new Siswa();
        KoleksiBuku K = new KoleksiBuku();
        Petugas P = new Petugas();
        PeminjamanBuku B = new PeminjamanBuku();
        LaporanPeminjaman L = new LaporanPeminjaman();
        L.laporan(K);
        L.laporan(S);
        L.laporan(P);
        L.laporan(B, K);
        B.prosesPeminjamanBuku(S, B, K);
        B.prosesPeminjamanBuku(S, B, K);
        L.laporan(B, K);
        L.laporan(K);
        L.laporan(S);
        L.laporan(P);

    }
}   

    

