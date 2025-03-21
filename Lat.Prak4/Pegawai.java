import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggal.format(formatter);
    }

    protected long hitungMasaKerjaTahun() {
        return ChronoUnit.YEARS.between(TMT, LocalDate.now());
    }

    protected long hitungMasaKerjaBulan() {
        return ChronoUnit.MONTHS.between(TMT, LocalDate.now()) % 12;
    }

    protected LocalDate hitungBUP(int usiaBUP) {
        LocalDate bupDate = tanggalLahir.plusYears(usiaBUP);
        return bupDate.withDayOfMonth(1).plusMonths(1);
    }

    public abstract void printInfo();
}
