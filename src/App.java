public class App {
    public static void main(String[] args) throws Exception {
        pegawai pPegawai = new pegawai();
        pPegawai.menampilkan();
        manajer mManajer = new manajer("manajer", 1);
        mManajer.menampilkan();
        mManajer.tugas();
        kasir kKasir = new kasir("kasir", 1);
        kKasir.menampilkan();
        kKasir.tugas();
        koki kKoki = new koki("koki", 1);
        kKoki.menampilkan();
        kKoki.tugas();
        pelayan pPelayan = new pelayan("pelayan", 1);
        pPelayan.menampilkan();
        pPelayan.tugas();
        satpam sSatpam = new satpam("satpam", 1);
        sSatpam.menampilkan();
        sSatpam.tugas();
        
    }
}
