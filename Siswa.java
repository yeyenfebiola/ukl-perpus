
package perpustakaan;

import java.util.ArrayList;

public class Siswa extends User {
    public int getJumlahsiswa() {
        return this.Statussiswa.size();
    }
    private ArrayList<String> Namasiswa = new ArrayList<String>();
    private ArrayList<String> Alamatsiswa = new ArrayList<String>();
    private ArrayList<String> Teleponsiswa = new ArrayList<String>();
    private ArrayList<Boolean> Statussiswa = new ArrayList<Boolean>();

    public Siswa() {
        this.Namasiswa.add("Gizella");
        this.Alamatsiswa.add("Kediri");
        this.Teleponsiswa.add("0858479656   ");
        this.Statussiswa.add(true);

@Override
    public void setNama(String namasiswa) {
        this.Namasiswa.add(namasiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.Alamatsiswa.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.Teleponsiswa.add(telepon);
    }

    @Override
    public String getNama(int idsiswa) {
        return this.Namasiswa.get(idsiswa);
    }

    @Override
    public String getTelepon(int idsiswa) {
        return this.Teleponsiswa.get(idsiswa);
    }

    @Override
    public String getAlamat(int idsiswa) {
        return this.Alamatsiswa.get(idsiswa);
    }

    void editStatus(int idSiswa, boolean Status) {
        this.Statussiswa.set(idSiswa, Status);
    }

    Boolean getStatus(int idsiswa) {
        return this.Statussiswa.get(idsiswa);
    }

}

    
}
