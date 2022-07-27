
package perpustakaan;

import java.util.ArrayList;

    public class Petugas extends User {
    private ArrayList<String> NamaPetugas = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();

    public Petugas() {
        this.NamaPetugas.add("Noval");
        this.Alamat.add(" Blitar");
        this.Telepon.add("08765906432");

}

    @Override
    public void setNama(String nama) {
        this.NamaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.Alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.Telepon.add(telepon);
    }

    @Override
    public String getNama(int idpetugas) {
        return this.NamaPetugas.get(idpetugas);
    }

    @Override
    public String getTelepon(int idpetugas) {
        return this.Telepon.get(idpetugas);
    }

    @Override
    public String getAlamat(int idpetugas) {
        return this.Alamat.get(idpetugas);
    }
    public int getJumlahPetugas(){
        return this.NamaPetugas.size();
    }
}

    

