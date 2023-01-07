public class App {
    public static void main(String[] args) throws Exception {
        pegawai pPegawai = new pegawai();
        pPegawai.menampilkan();
        manajer mManajer = new manajer("manajer", 1);
        mManajer.menampilkan();
        mManajer.tugas();
        kasir kKasir = new kasir("kasir", 2);
        kKasir.menampilkan();
        kKasir.tugas();
        koki kKoki = new koki("koki", 3);
        kKoki.menampilkan();
        kKoki.tugas();
        pelayan pPelayan = new pelayan("pelayan", 4);
        pPelayan.menampilkan();
        pPelayan.tugas();
        satpam sSatpam = new satpam("satpam", 5);
        sSatpam.menampilkan();
        sSatpam.tugas();
        
    }
}
