public class DaftarOn extends Laporan{
    String namaMts, alamat, email, telepon;
    DaftarOn(){
        super();
        namaMts="MTsN Darul Ulum";
        alamat ="Jombang";
        email ="kiko32@gmail.com";
        telepon = "089000000";
    }

    @Override
    void cetakData() {
        super.cetakData();
        System.out.println("nama MTs     : "+namaMts);
        System.out.println("Alamat   : "+alamat);
        System.out.println("Email : "+email);
        System.out.println("Telepon : "+telepon);
    }
}
