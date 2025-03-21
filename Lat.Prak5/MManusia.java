public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Rizky", 2012, "Jl. Melati No. 45", 16000000, "198705152012051001");
        Pengusaha pe1 = new Pengusaha("Budi", 1998, "Jl. Mawar No. 12", 60000000, "001-789-456-123-000-7");
        Petani pt1 = new Petani("Sutrisno", 1985, "Jl. Cempaka No. 7", 5500000, "Sleman");
        PNS p2 = new PNS("Fajar", 2015, "", 11000000, "198902102015021003");
        p2.alamat = "Jl. Kenanga No. 88";

        System.out.println("Total jumlah manusia: " + Manusia.getCounterMns());
        System.out.println("Total jumlah Pegawai Negeri Sipil: " + PNS.getCounterPNS());
        System.out.println("Total jumlah pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Total jumlah petani: " + Petani.getCounterPetani());
        
        System.out.println("Pajak yang harus dibayar oleh PNS p1: " + p1.hitungPajak());
        System.out.println("Pajak yang harus dibayar oleh pengusaha pe1: " + pe1.hitungPajak());
        System.out.println("Pajak yang harus dibayar oleh petani pt1: " + pt1.hitungPajak());
        
        System.out.println("Lama masa kerja p1: " + p1.hitungMasaKerja());
        System.out.println("Lama masa kerja pe1: " + pe1.hitungMasaKerja());
        System.out.println("Lama masa kerja pt1: " + pt1.hitungMasaKerja());
        
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
