public class satpam extends pegawai {
    satpam(String sNama,int Iid_pegawai){
        gaji = "1.2 Juta";
        nama = sNama;
        id_pegawai = Iid_pegawai;
    }
    @Override
    public void menampilkan() {
        System.out.println("Nama :"+nama);
        System.out.println("Id Pegawai :"+id_pegawai);
        System.out.println("Gaji :"+gaji);
    }
    public void tugas()
    {
        System.out.println("Tugas : Menjaga keamanan di dalam dan diluar frenchise");
    }
}
