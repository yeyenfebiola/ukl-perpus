
package perpustakaan;

import java.util.ArrayList;

public class KoleksiBuku {
    private ArrayList<String> JudulBuku = new ArrayList<String>();
private ArrayList<Integer> StokBuku = new ArrayList<Integer>();
    private ArrayList<Integer> HargaBuku = new ArrayList<Integer>();

 public KoleksiBuku() {
   this.JudulBuku.add("LaskarPelangi");
 this.StokBuku.add(3);
        this.HargaBuku.add(55000);

 }

    public void setNamaBuku(String namaBarang) {
        this.JudulBuku.add(namaBarang);
    }

    public String getNamaBuku(int idBuku) {
        return this.JudulBuku.get(idBuku);
 }

    public void setStokBuku(int stok) {
        this.StokBuku.add(stok);
    }

    public int getStokBuku(int idBuku) {
        return this.StokBuku.get(idBuku);
    }

    public void editStokBuku(int idBuku, int stok) {
        this.StokBuku.set(idBuku, stok);
    }

    public void setHargaBuku(int hargabuku) {
        this.HargaBuku.add(hargabuku);
    }

    public int getHargaBuku(int idBarang) {
        return this.HargaBuku.get(idBarang);
    }

    int getJmlBuku() {
        return this.Penerbit.size();
    }

    class awt {

        public awt() {
        }
    }

    
}
