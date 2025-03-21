import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    private double hitungTunjangan() {
        return 0.01 * hitungMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + hitungMasaKerjaTahun() + " tahun " + hitungMasaKerjaBulan() + " bulan");
        System.out.println("BUP : " + formatTanggal(hitungBUP(55)));
        System.out.printf("Gaji Pokok : Rp %,d\n", (int) gajiPokok);
        System.out.printf("Tunjangan : Rp %,d\n", (int) hitungTunjangan());
    }
}