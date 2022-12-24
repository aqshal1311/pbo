public class Admin extends LogUser {
    private String usrnm, pass, kdadmin, almt, email, tlp;
    public Admin(String user, String password, String kode, String alamat, String email, String telpon) {
        this.usrnm = user;
        this.pass = password;
        this.kdadmin = kode;
        this.almt = alamat;
        this.email = email;
        this.tlp = telpon;
    }
    public void setUsrnm (String usrnm){
        this.usrnm = usrnm;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setKdadmin(String kdadmin) {
        this.kdadmin = kdadmin;
    }

    public void setAlmt(String almt) {
        this.almt = almt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public String getUsrnm() {
        return usrnm;
    }

    public String getPass() {
        return pass;
    }

    public String getKdadmin() {
        return kdadmin;
    }

    public String getAlmt() {
        return almt;
    }

    public String getEmail() {
        return email;
    }

    public String getTlp() {
        return tlp;
    }
}
