public class koki extends pegawai {
    koki(String sNama,int Iid_pegawai){
        gaji = "2 Juta";
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
        System.out.println("Tugas : Memasak makanan dan minuman");
    }
}
