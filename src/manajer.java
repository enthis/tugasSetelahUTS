public class manajer extends pegawai  {
    manajer(String sNama,int Iid_pegawai){
        gaji = "7 Juta";
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
        System.out.println("Tugas : Melakukan manajemen untuk frenchise");
    }
}
