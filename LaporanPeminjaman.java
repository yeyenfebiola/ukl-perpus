
package perpustakaan;

public class LaporanPeminjaman {
    public void laporan(KoleksiBuku koleksibbuku) {
        int x = koleksibbuku.getJmlBuku();

     
       System.out.println("\t\t\t*** PERPUSTAKAAN SMK TELKOM MALANG ***");
        System.out.println("\t\t\t\t* SEMANGAT LITERASI<3*");
         System.out.println();
       System.out.println();
        System.out.println("== DAFTAR BUKU ==");
        System.out.println("Judul Buku \t\tTerbitan Pertama \tPengarang \t\tBahasa \t\tPenerbit \t\t\tHalaman \tGenre Buku  \t\tStok Buku \tHarga Buku");
        for (int i = 0; i < x; i++) {
            System.out.println(koleksibbuku.getNamaBuku(i) + "\t" +"\t" +"\t"+koleksibbuku.getStokBuku(i) + "\t" + koleksibbuku.getHargaBuku(i));

 }

    }

    public void laporan(Siswa siswa) {
        int x = siswa.getJumlahsiswa();
         
       System.out.println();
       System.out.println();
             
        System.out.println("== DAFTAR SISWA SMK TELKOM MALANG ==");
        System.out.println("Nama\tAlamat\t\tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i) + "\t"+ siswa.getAlamat(i) + "\t" +'\t' + siswa.getTelepon(i) + "\t" + siswa.getStatus(i) );

        }

    }
    
    
    public void laporan(Petugas petugas) {
        int x = petugas.getJumlahPetugas();

        System.out.println();
        System.out.println("== DAFTAR PETUGAS SMK TELKOM MALANG==");
        System.out.println();
        System.out.println("Nama  \tAlamat \tTelepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t"+ petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));

        }

    }

    public void laporan(PeminjamanBuku peminjaman, KoleksiBuku koleksibuku) {
        int x = peminjaman.getJmlPeminjaman();

        System.out.println();
        System.out.println();
        System.out.println("== DAFTAR HARGA BUKU ==");
     
        System.out.println("Nama Barang\t\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknyaBuku(i) * koleksibuku.getHargaBuku(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(koleksibuku.getNamaBuku(peminjaman.getIdBuku(i)) + "\t" + "\t" +peminjaman.getBanyaknyaBuku(i) + '\t' + koleksibuku.getHargaBuku(peminjaman.getIdBuku(i)) + "\t" + jumlah);
        }
        System.out.println("Total Profit : " + total);

    }
}
