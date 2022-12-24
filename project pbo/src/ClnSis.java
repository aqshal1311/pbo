public class ClnSis extends LogUser{
    private String nama, nisn, almat, asalskl, tlpon;
    public ClnSis(String nm, String no, String almt, String asal, String tlp) {
        this.nama = nm;
        this.nisn = no;
        this.almat = almt;
        this.asalskl = asal;
        this.tlpon = tlp;
    }
    public String getNama() {
        return nama;
    }

    public String getNisn() {
        return nisn;
    }

    public String getAlmat() {
        return almat;
    }

    public String getAsalskl() {
        return asalskl;
    }

    public String getTlpon() {
        return tlpon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public void setAlmat(String almat) {
        this.almat = almat;
    }

    public void setAsalskl(String asalskl) {
        this.asalskl = asalskl;
    }

    public void setTlpon(String tlpon) {
        this.tlpon = tlpon;
    }
}
