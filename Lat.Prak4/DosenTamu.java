import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    private double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("NIDK : " + NIDK);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kontrak Berakhir : " + formatTanggal(tanggalBerakhirKontrak));
        System.out.printf("Gaji Pokok : Rp %,d\n", (int) gajiPokok);
        System.out.printf("Tunjangan : Rp %,d\n", (int) hitungTunjangan());
    }
}
