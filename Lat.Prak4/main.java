import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Pegawai dosenTetap = new DosenTetap("1231233434", "6786785", "Budi", 
                                            LocalDate.of(1990, 5, 5), 
                                            LocalDate.of(2015, 1, 1), 
                                            5000000, 
                                            "Fakultas Sains dan Matematika");
                                            
        Pegawai dosenTamu = new DosenTamu("12356788333", "6723044", "Tono",
                                        LocalDate.of(1985, 8, 20),
                                        LocalDate.of(2018, 7, 15),
                                        6000000,
                                        "Fakultas Ekonomika dan Bisnis",
                                        LocalDate.of(2026, 12, 31));

        Pegawai tendik = new Tendik("8765432109", "Anti", 
                                    LocalDate.of(1980, 10, 10), 
                                    LocalDate.of(2010, 6, 1), 
                                    4000000, 
                                    "Akademik");

        dosenTetap.printInfo();
        System.out.println();
        dosenTamu.printInfo();
        System.out.println();
        tendik.printInfo();
    }
}
