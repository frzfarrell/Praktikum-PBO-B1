import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    private double hitungTunjangan() {
        return 0.02 * hitungMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + hitungMasaKerjaTahun() + " tahun " + hitungMasaKerjaBulan() + " bulan");
        System.out.println("BUP : " + formatTanggal(hitungBUP(65)));
        System.out.printf("Gaji Pokok : Rp %,d\n", (int) gajiPokok);
        System.out.printf("Tunjangan : Rp %,d\n", (int) hitungTunjangan());
    }
}
